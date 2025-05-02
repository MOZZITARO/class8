package kr.or.human.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human.service.MemberService;
import kr.or.human.service.MemberServiceImpl;

@Controller
public class MemberController {
    
	
	// 자동실행 // 생성자 // new했을시 // 여기서는 autowired
	MemberController() {
		
		System.out.println("멤버컨트롤러 실행");
	}
	
	
	
	
	
	
	// DI 우선순위 
	// 1.  완전히 동일한 클래스
	// 2.  자동 형 변환이 가능한 클래스
	// 클래스 찾아줌(IoC) + "변수"에 넣어줌 (DI)
	@Autowired
	MemberService memberService;
	
	
	// Value, method // get과 POST뿐만 아닌 여러 메소드 가능
    @RequestMapping("/member")	
    
    
	String listMember() {
		System.out.println("listMember 실행");
		
		
		// 객체생성 X 
//		MemberService memberService = new MemberServiceImpl();
		
		
		// 리스트에 담기
	    List memberList = memberService.getList();
	    System.out.println(memberList);
	    
	    return "home"; // jsp로 이동
	}
    
    
    
    
    
    
    
}
