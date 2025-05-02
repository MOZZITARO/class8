package kr.or.human.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.human.dto.EmpDTO;
import kr.or.human.service.EmpService;

@Controller
public class EmpController {

	
	
	
	@Autowired
	// EmpService 타입에 넣음
	EmpService EmpService;

	
	// 페이지 겸 셀렉트
	// 전체조회 // 메소드 GET
	@RequestMapping(value = "/emp")
	public String listEmp(
			Model model, 
			
			@ModelAttribute // dto값 파라미터
			EmpDTO dto,
			HttpServletRequest request
			
			) {

            
		System.out.println("dto결과 :" + dto);
		
		
		
		
		
		
		
//		int page = 1;
//		String stpage = request.getParameter("page");
//		if(stPage != null) {
//			page = Integer.parseInt(stpage);
//		} "null값 방지"
//		
//		
//		하드코딩
//		int viewCount = 3;
//		dto.setPage(page);
//		dto.setViewCount(viewCount); 
		
		
		
		
		
		
		
		
	     // ??????????
		// 리스트로 담기 // 호출
		// List<EmpDTO> list = EmpService.getEmpList();
		Map map = EmpService.select1Emp(dto);
		
		
//		System.out.println("list.size : " + list.size());
		model.addAttribute("map", map);  // 돌려줄때 map.empno처럼 표기.
		model.addAttribute("dto", dto);   // 명시적으로 쓰기
//		model.addAttribute("list", list);

		return "emp";
		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
	}
	
	
	
	
	
	
	
	
	
	// 조건 조회
	@RequestMapping(value = "/whereEmp")
	public String WhereEmp(

			@ModelAttribute // 전달인자
			EmpDTO dto,
			// 그 안에 "파라미터(컬럼)"를 받으려면 그 안에 있어야함 

			Model model

	) {

		// 전달 받고 확인
		System.out.println("조건 조회 이전" + dto);

		// 타입이 맞아야함
		List<EmpDTO> whdto = EmpService.whereEmp(dto);
		System.out.println("조건 조회 이후 종새 : " + whdto);
		Map map = EmpService.select1Emp(dto);
		
		
		// 돌려주기 
		model.addAttribute("whdto", whdto);
		model.addAttribute("dto", dto);
		model.addAttribute("map", map);   
		        // 데이터를 전달
		return "emp";
	}    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	// 7788인것만 조회 //한줄만 //One인데 2줄이상이면 오류남
	@RequestMapping(value = "/empOne")
	public String OneEmp() {

		// 리스트로 담기 // 호출
		EmpDTO dto = EmpService.getOneEmp();
		System.out.println("controller dto : " + dto);

//		model.addAttribute("list2", dto);

		return "home";
		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
	}

	// 행 하나 조회 // http://localhost:8080/human4/empOneno?empno=7369
	@RequestMapping(value = "/empOneno")
	// 돌려주기위해 model
	public String OneEmpno(@RequestParam("empno") int empno) {
		// 생략ㅇ // 전달인자 행 하나

		// 리스트로 담기 // 호출 // 전달인자 행 하나
		EmpDTO empone = EmpService.getEmpno(empno);
		System.out.println("controller dto 파라미터 : " + empone);

//		model.addAttribute("list3", empone);

		return "home";
		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 // 수정. 삭제 페이지
	// Model = request
	// DTO 전체조회
	@RequestMapping(value = "/detailEmp")
	public String empno2(

			// 값 전달
			// empDTO를 받는 "파라미터" ex) dto.setid(파라미터)
			@ModelAttribute EmpDTO empDTO,

			Model model

	) {
		// 리스트로 담기 // 호출
		EmpDTO dto = EmpService.getEmpno2(empDTO);
		System.out.println("controller empno2 : " + dto);

		// 돌려주기
		model.addAttribute("dto", dto);

		return "detailEmp";
		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
	}

	
	
	
	
	
	
	// 메소드는 다르게 // empno는 동일
	// 수정 정보 표시
	@RequestMapping(value = "/modifyemp")
	public String modifyEmp(

			// 값 받기
			@RequestParam("empno") int empno, // 둘 다 줘도 무방
			@ModelAttribute EmpDTO empDTO,

			Model model

	) {
		// 리스트로 담기 // 호출
		EmpDTO dto = EmpService.getEmpno2(empDTO);
		System.out.println("수정 정보 표시 : " + dto);

		// 돌려주기
		model.addAttribute("dtomodi", dto);

		return "modifyemp";
		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
	}

	// 수정
	@RequestMapping(value = "/upemp")
	public String UpdateEmp(

			@ModelAttribute EmpDTO empDTO

//			Model model

	) {
		System.out.println("DTO확인 : " + empDTO);
		// 리스트로 담기 // 호출
		int dto = EmpService.upEmpno(empDTO);
		System.out.println("수정 완료 : " + dto);

//		model.addAttribute("upemp", dto);

		return "redirect:emp";
		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
	}

	

//      // 생성
//      @RequestMapping(value="/Intemp")
//	  public String IntEmp( 
//    	  
//			  int empno
//        
//    	  ) {  
//    	   // 리스트로 담기         // 호출
//    	  EmpDTO insert = EmpService.intEmpno(
//    			  empno);
//    	  System.out.println("생성 완료 : " + insert);
//    	 
//    	  
//    	 
//    	  
//    	  
//    	  return "redirect:emp";
//    	  //  "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
//          // "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
//      }

	// 생성 //들어오는 서버
	@RequestMapping(value = "/joinEmp2")
	public String joinEmp() {

		return "JoinEmp"; // jsp로 이동
	}
	
	
	// 생성2 // Fetch 
	@ResponseBody // 뷰(JSP)로 이동하지 않고, 데이터 자체를 응답
	//@ResponseBody를 생략하면 Spring은 JSP 뷰로 이동한다고 가정합니다.

	//반환 타입이 int라서 ViewResolver가 int.jsp를 찾게 되어 오류 발생합니다.
	@RequestMapping(value = "/joinEmp")
	public int joinEmpPost(

			@RequestBody // 전달인자 // 없으면 JSON받을수없음
			EmpDTO empDTO
            
//			Model model
	) {

		// 전달 받고
		// 확인하고
		System.out.println("포스트 joinEMP DTO" + empDTO);

		int intdto = EmpService.intEmpno(empDTO);
		System.out.println("생성 완료 : " + intdto);
		
//		model.addAttribute("lnsert", intdto);

		return intdto;
	}   // 숫자값 응답(ResponseBody)

	
	
	
	
        

	
	
	
	
	// 삭제
		@RequestMapping(value = "/delemp")
		public String DeleteEmp(

				@ModelAttribute 
				EmpDTO empDTO

//				Model model

		) {
			System.out.println("삭제 DTO확인 : " + empDTO);
			// 리스트로 담기 // 호출
			int dto = EmpService.delEmpno(empDTO);
			System.out.println("삭제 완료 : " + dto);
//
//			model.addAttribute("upemp", dto);

			return "redirect:emp";
			// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
			// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
		}
		
}
