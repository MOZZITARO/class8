package kr.or.human3;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller   
public class ParamController {


	// 로그인 페이지 표시
	@RequestMapping("/login.do")
	                     // 그냥 메소드임
	public ModelAndView loginForm() {
		
		
		// 자동으로 new를 해줌
		// HumanDAO dao = (HumanDAO) new HumanDAOImpl();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		
		return mav;
	}
	
	
	
	
	
	
	
	// 일반 파라미터 전달
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		

		// jsp로
		
		// 윗 코드 간단하게 //1. Model                 // 2. view이름 //  : 싱글톤
		ModelAndView mav = new ModelAndView("result"); 
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("아이디와 : " + id +":  비밀번호" + pw);
		
		
		
		
		// 값 넣기
		MemberDTO mav3 = new MemberDTO();
		mav3.setId(id); // 서블릿
		
		mav.addObject("dto", mav3); 
		
		
		
		// 값 전달 방식 (파라미터)
	    request.setAttribute("id1", id);
	    
	    // 일반 파라미터 전달
        mav.addObject("id2", id);
        
        
        
		return mav;
	
	}
	
	
	@RequestMapping("/login2") 
	public ModelAndView login2(
			
			// "id" : 필수값, 없다면 400 Bad Request 코드 발생
			// 즉, required = true가 기본 
			              // 파라미터 이름
//			@RequestParam("id")
//			400 :주소 405 : 메소드 404: 값
			               // 파라미터이름    // 없어도 오류안납니다
			@RequestParam(value = "id", required = false)
			
			// getparameter 해결
			// null : 필수가 아님
			// ↓이건 변수이다.
			String id,
			
			
			
			
			// * @RequestParam을 생략하면
			// Parameter의 Key와 변수명이 같다면 @RequestParam 생략가능
			//  >>>>>>>>> 전달인자에만 넣을 수도 있음
            // @RequestParam(value= "pw", required= false)
			  String pw
			, String a
			,        // *필수값 안줬으니까 null
//			, int b // null이 안들어가서 500오류
			
			
			
			Map map,
			MemberDTO memberDTO
			) { 
		
		    
		   System.out.println("아이디 :" + id);
		   System.out.println("비밀번호   :" + pw);
		   System.out.println("Map.id   :" + map.get("id"));
		   System.out.println("memberDTO : " + memberDTO);
		   ModelAndView mav = new ModelAndView("result");
		   return mav;
		   
		   
	}
		
		
	@RequestMapping("/login3") 
	public ModelAndView login3(
			
			// 1.DTO
			// DTO에 알아서 넣어줌
			// DTO를 "자동"으로 채우고 
			// 모델에 넣어주기까지 해줌
			// 전달인자에 넣어도 됨
			@ModelAttribute
			          // 그냥 변수이름
			MemberDTO dto1,
			
			// 이름 특정
			@ModelAttribute("dto22")
			MemberDTO dto2,
			
			
			// DTO타입의 앞글자만 소문자로 변경한 key로
			// 모델에 넣어줌
			// @ModelAttribute ("memberDTO")
			MemberDTO dto3
			) {
		
		    System.out.println("dto1 : " + dto1);
		    
		    
		    
		    // 2. DAO
		    // 자동생성모델
		    ModelAndView mav = new ModelAndView("result");
		    // setAttribute 
		    mav.addObject("dto11", dto1);
		    
			   return mav;
	
		   
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/login4") 
	public String login4() {
		
		return "result";
		
	}
	
	@RequestMapping("/login5") 
	public String login5() {
		
//		return "result";
		//"sendRedirect" 방법
		return "redirect:login.do"; // >>>>>>>>> 이걸로 바꿔치기
		
	}
	
	
	@RequestMapping("/login5_1")  // >>>>>>>>>>>> jsp(기본. view resolver) 아니고 여기로 직접 
	public String login5_1() {
		
//		return "result";
		//sendredirect 방법
		return "forward:login.do";
		
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/login6")    
	                     // 얕은 복사 // 모델 ONLY
	public String login6(Model model) {
	
	model.addAttribute("id1", "model");
	
	            // view	
		return "result";
		
	}
	
	// 주소를 보고 result.jsp를 알아서 찾아감
	@RequestMapping("/result.human") 
	public void login7() {
	
          //리턴타입이 void 또는 리턴값이 null일때
		  //@RequestMapping의 주소 중 마지막 쩜 앞의 글씨를 
		  //ViewResolver로 보냄
		
	}
	
	
	@RequestMapping("/login8/{month}/") 
	public String login8(
			
			
			// 경로에서 파라미터 출력
			@PathVariable("month")
			String id
			
			
			) {
	
	System.out.println("id : " + id);
    return "result";
		
	}
	
	
//클라이언트가 /login9/{month}/add/{day} 형식의 URL을 요청하면 이 메서드가 실행됩니다.
// {month}와 {day}는 URL 경로에서 동적으로 값을 추출하기 위한 Path Variable입니다.
	@RequestMapping("/login9/{month}/add/{day}") 
	public String login9(
			
			// 생략불가
			@PathVariable("month")
			String m,
			
			@PathVariable("day")
			String d
			
			
			) {
	
	System.out.println("m : " + m);
	System.out.println("d : " + d);
    return "result";
		
	}
	
	
	
	
	
	@RequestMapping("/login10") 
	public String login10() {
			
			
    return "result";
		
	}
	
	
	
	@RequestMapping(value="/login11", method=RequestMethod.GET) 
	public String login11() {
			
			
    return "result";
		
	}
	
	                                      // 2개쓰는 방식 
	@RequestMapping(value="/login12", method= {RequestMethod.GET, RequestMethod.POST}) 
	public String login12() {
			
			
    return "result";
		
	}
	
	
	
	                        // 13을 넣거나 14를 넣으면 밑의 여기로
	@RequestMapping(value={"/login13", "/login14"}) 
	public String login13() {
			
	System.out.println();		
    return "result";
		
	}
	
	
	
	
	
	@RequestMapping(value="/login15", method=RequestMethod.GET) 
	public String login15() {
			
	System.out.println("15 GET");		
    return "result";
		
	}
	
	
	
	
	@RequestMapping(value="/login15", method=RequestMethod.POST) 
	public String login15_1() {
			
			System.out.println("15 POST");		
		    return "result";
		
	}
	
	
	
	
	@RequestMapping(value="/login16") 
	public String login16_2() {
			
			System.out.println("15 POST");		
		    return "result";
		
	}
	
	
	
}
