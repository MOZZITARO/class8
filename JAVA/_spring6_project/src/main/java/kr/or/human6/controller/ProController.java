package kr.or.human6.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.or.human6.Service.ComService;
import kr.or.human6.Service.LinkService;
import kr.or.human6.Service.ProService;
import kr.or.human6.dto.Comdto;
import kr.or.human6.dto.Linkdto;
import kr.or.human6.dto.Prodto;



@Controller
public class ProController {

	
	@Autowired
	// EmpService 타입에 넣음
	ProService ProService;
	
	@Autowired
	ComService Comservice;
	
	@Autowired
	LinkService Linkservice;
	
//	// 목록 전시
//	@RequestMapping(value = "/select")
//	public String selectEmp(
//			Model model, 
//			
//			@ModelAttribute // dto값 파라미터
//			Prodto dto
////			HttpServletRequest request
//			
//			) {
//
//		// 리스트로 담기 // 호출
//		List<Prodto> list = ProService.getEmpList();
//		System.out.println(" 목록 크기 " + list.size());
//		int view = ProService.Viewcount(dto);
//		model.addAttribute("select", list);
//
//		return "board";
//		// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
//		// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
//	}
	
	
	
	
	
	
	
	        // 페이지 겸 셀렉트
			// 전체조회 // 메소드 GET
			@RequestMapping(value = "/select")
			public String Pagesel(
					Model model, 
					
					@ModelAttribute // dto값 파라미터
					Prodto dto,
					HttpServletRequest request
					
					) {

		            
				
				
				
				
				
				
				
				
//				int page = 1;
//				String stpage = request.getParameter("page");
//				if(stPage != null) {
//					page = Integer.parseInt(stpage);
//				} "null값 방지"
//				
//				
//				하드코딩
//				int viewCount = 3;
//				dto.setPage(page);
//				dto.setViewCount(viewCount); 
				
				
				
				
				
				
				
				int view = ProService.Viewcount(dto);
			     // ??????????
				// 리스트로 담기 // 호출
				// List<EmpDTO> list = EmpService.getEmpList();
				Map map = ProService.SelectPage(dto);
				System.out.println(" 페이 :" + dto);
				System.out.println(" 맵 크기 " + map.size());
				System.out.println(" 맵 내용 : " + map);
//				System.out.println("list.size : " + list.size());
				model.addAttribute("map", map);  // 돌려줄때 map.empno처럼 표기.
				model.addAttribute("dto", dto);   // 명시적으로 쓰기
//				model.addAttribute("list", list);

				
				
				
//				if (dto.getPage() <= 0) {
//				    dto.setPage(1);
//				}
//				if (dto.getPagecount() <= 0) {
//				    dto.setPagecount(3);                
//				    
//				  
//				}
				  // 기본값 설정
				
				
				
				
				return "board";
				// "Model 객체를 사용하여 명시적"으로 추가하고 있습니다.
				// "클라이언트 요청 파라미터"를 처리하지 않으므로 @ModelAttribute의 자동 바인딩 기능이 필요하지 않습니다.
			}
	
	
	
	// 생성 입구
	@RequestMapping(value = "/write")
	public String writeEmp() {
			
	
		return "Write";
		
	}
	
	// 생성 데이터
//	@ResponseBody
	@RequestMapping(value = "/insert")
	public String insertEmp(
			
			@ModelAttribute
			Prodto Prodto,
			Linkdto Linkdto,
			MultipartHttpServletRequest req
			
			) {
   
		// 1. 글 생성 // 글쓰기에서 목록으로 
		int intdto = ProService.insertEmpList(Prodto);
		
		
		
		
		
		// 키포인트
		int id = Prodto.getPostid();
		System.out.println("post아이디 : " + id);
		// 키포인트
		
		
		// 2. 링크 생성
		Linkdto.setPostid(id);
//		System.out.println("post아이디2 : " + id2);
		
		int linkdto = Linkservice.Linkint(Linkdto);
		System.out.println(" 글 생성 성공시 1 :  " + intdto);
		
		
		
		
		
		
		
		
		
		
		// 3. 파일 처리
//      MultipartFile mf = req.getFile("file1");
		  List<MultipartFile> fileList = req.getFiles("file1");
        for(MultipartFile mf: fileList) {
  
  	long fileSize = mf.getSize();
      System.out.println("fileSize: "+ fileSize);
      
      String fileName = mf.getOriginalFilename();
      System.out.println("fileName: "+ fileName);
      
      try {
          String path = "C:\\temp\\upload";
          String safeFileName = path +"\\"+ System.currentTimeMillis() +"_"+ fileName;
          System.out.println("safeFileName: "+ safeFileName);
          File file = new File(safeFileName);
          
          mf.transferTo( file );
          
      } catch (IllegalStateException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return "forward:select";
		
	}
	

		
	
	
	// 글 내용 // 목록에서 상세글로 
	@RequestMapping(value = "/Content")
	public String contentEmp(
			
			@RequestParam(value="postid") int postid,
			@ModelAttribute
			Prodto prodto, 
			Comdto comdto,
			Linkdto Linkdto,
			Model model
			
			
			) {
		
		
//		    int linkdto = Linkservice.Linkint(Linkdto);
		    
		
		
		
		
		
		    System.out.println(" 컨텐츠 DTO :" + prodto);
		    Prodto dtopro = ProService.Contentemp(prodto);
		    int view = ProService.Viewcount(prodto);
		    model.addAttribute("con", dtopro);
		    
		    
		    
//	        List<Comdto> comsel = Comservice.Comsel(postid);
//	        // 입력한 값
//		    System.out.println(" Comdto :" + postid);
//		    // 전체 목록
//		    System.out.println(" 댓글목록 Content :" + comsel);
//		    model.addAttribute("comsel", comsel);
	
		    
		    List<Comdto> selcom = Comservice.Comselid(postid);
	        System.out.println(" Comdto " + postid);
	        System.out.println(" 댓글 하나 Content " + selcom);
		    model.addAttribute("selcom", selcom);
		    
		    // 상세글에 주소 뿌리기
		    Linkdto Linkselid = Linkservice.Linkselid(Linkdto);
		    System.out.println("링크  DTO : " + Linkdto);
		    System.out.println("링크 하나만 뽑기 : " + Linkselid);
		    model.addAttribute("Linkselid", Linkselid);
		    
		    
		    
		    
		    
		    
		    
		return "Content";
		
	}
	
	
	
	
	
	
	// 글 삭제
		@RequestMapping(value = "/condel")
		public String condel(
				
				@ModelAttribute
				Prodto prodto
				
				
				
				) {
			
			    
			    int condel = ProService.Condel(prodto);
			    
			    System.out.println(" 컨텐츠 삭제되면 1이뜸 " + condel);
			    
		
			return "forward:select";
			
		}
		
	
		
		
		// 글 수정 정보
		@RequestMapping(value = "/conmod")
		public String conmod(
				
				
				@ModelAttribute
				Prodto prodto,
				Linkdto linkdto,
				Model model
									
				) {
			
			
			    System.out.println(" 컨텐츠 수정 정보 DTO " + prodto);
			    Prodto conmod = ProService.Contentemp(prodto);
			    System.out.println(" 컨텐츠 수정  정보 DTO2 " + conmod);
			    model.addAttribute("modi", conmod);
			    
			    System.out.println(" 링크 수정 정보 DTO " + linkdto);
			    Linkdto dtolink = Linkservice.Linkselid(linkdto);
			    System.out.println(" 링크 수정 정보 DTO2 :" + dtolink);
			    model.addAttribute("dtolink", dtolink);
			
			System.out.println("확인");		
			return "Modify";
			
		}	
		
		
		// 글 수정
		@RequestMapping(value = "/conup")
		public String conup(
				
				
				
				@ModelAttribute
				Prodto prodto,
				Linkdto linkdto
//				Model model
									
				) {
			
			
			    System.out.println(" 컨텐츠 수정임 DTO " + prodto);
			    int conmod = ProService.Conup(prodto);
		        System.out.println(" 컨텐츠 수정임 DTO2 " + conmod);
			    int modlink = Linkservice.Linkfix(linkdto);
			    System.out.println(" 링크 수정임 ㅇㅇ " + modlink);
//		        model.addAttribute("modi", conmod);
			
			
				
			return "forward:select";
			
		}	
		
		
		
		

		
		
		
		

}
