package kr.or.human5.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human5.dto.MemberDTO;

@Controller
public class MesController {

	// 하드코딩
	String id = "admin";
	int pw = 1234;
	String name = "관리자";	
	
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/loginCheck")
	public String loginCheck(MemberDTO dto, HttpServletRequest req) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		if(dto.getId().equals(this.id)
				&& dto.getPw() == (this.pw)) {
			
			
			
			dto.setName(this.name);
		
			HttpSession session = req.getSession();
			session.setAttribute("dto",dto);
			//세션에 담기
			
			return "redirect:main"; //main 서블릿으로 
		} else {
		
		
		// 로그인 성공하면
		// main으로 이동
		// 실패 시 login으로 이동
		return "redirect:login?msg=2";
	    }
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/main")
	public String main(HttpServletRequest req) {
		
		// 로그인 정보 저장
		HttpSession session = req.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
		
		
		
		
		//로그인 한 사람만 보기
		// 안한 사람은 login으로 이동
		if(dto == null) {
		return "redirect:login?msg=2";	
		} else {
		return "Main";
		}
		
		
		
		
	}
	
	
	
}
