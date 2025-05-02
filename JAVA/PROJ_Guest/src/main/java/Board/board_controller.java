package Board;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Comment.CommentDTO;
import File.FileDAO;
import File.FileDTO;
import Link.linkDAO;
import Link.linkDTO;
import Link.nextvalDAO;


@WebServlet("/board") 
public class board_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	// 1. @RequestMapping(value="/login15", method=RequestMethod.GET) 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//DAO에서 받아서
//		boardDAO dao = new boardDAO();
//		List resultList = dao.selectList();
		//VIEW로 보냄
//		request.setAttribute("resultList", resultList);
		
//		String str = request.getParameter("todo");
//		String str1 = request.getParameter("todo1");
//		System.out.println(str + str1);
		
		
		
		
		
		
		
		
		   // 돌려주다          // 2. componant로 bean을 각자 지정하고 컨트롤러에서 @Autowire로 주입
		                        // 객체 자동생성 및 변수에 객체 수동주입
		   board_DAO boarddao = new board_DAO();
		   
		   
		   
		   List result2 = boarddao.selectList();
		   
		   // 3-1. ModelAndView mav = new ModelAndView();
		   // mav.setViewName(jsp이름)
		   // mav.addObject(키, 데이터)
		   // 3-2. model >>>> model 전달인자. addAttribute로 키와 데이터 
		   request.setAttribute("result2", result2);
		
		   
		   //
		   String url = "board.jsp";
		   request.getRequestDispatcher(url).forward(request, response);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8");

	    // 전달받은 값 확인
	 // 4. @RequestParam(value = "id", required = false) "String id"
//	    String title = request.getParameter("title");
//	    String name = request.getParameter("name");
//	    
	    
	    
//	    String[] userIds = {"admin1", "admin2", "admin3", "admin4"};
	    
	    
	    
	    String userid = "adminid1";
	    String notify = "Y";
	
	    
	    // 아무 소용이 없음
	   

//	    String link = request.getParameter("link");
//	    String write = request.getParameter("write");
//	    String main = request.getParameter("main");
//	    String file = request.getParameter("file");
//	
//	    System.out.println("파일" + file);
//	    System.out.println("링크" + link);
//	    System.out.println("제목" + write);
//	    System.out.println("내용" + main);
	  
//	    System.out.println(click);
	    
	    
//	    String[] userIds = {"admin1", "admin2", "admin3", "admin4"};
//	    
//	    for(String userId : userIds) {
//	    System.out.println("순환 :" + userIds);
//	    
//	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
	    nextvalDAO nextvaldao = new nextvalDAO();
	    int nextval = nextvaldao.nextval();
	    System.out.println("신규발급 넥스트발 :" + nextval);
	    
	    
	    
	    
	    board_DTO boarddto = new board_DTO();
	    linkDTO linkdto = new linkDTO();	  
	    FileDTO filedto = new FileDTO();
//	    CommentDTO comdto = new CommentDTO();
	    
	    
	    // @componant @autowired
	    boarddto.setPostid(nextval);
	    System.out.println("-----------------보드 시작");
	    System.out.println("보드포스트아이디 : " +  boarddto.getPostid());
	    // 파라미터가 아닌값은 그냥 그대로 넣는다
        boarddto.setNotify(notify);  
        
        
//        for (String userId : userIds) {
//            boarddto.setUserid(userId);
//            // 여기서 boardDTO 객체를 활용한 추가 작업 수행
//            System.out.println("설정된 userId: " + boarddto.getUserid());
//        }
       	boarddto.setUserid(userid);	
       	
       	
       	
       	
        System.out.println("보드공지사항 : " + boarddto.getNotify());
        System.out.println("보드유저아이디 : " + boarddto.getUserid());
        System.out.println("-----------------보드 끝");
       	linkdto.setLinkid(nextval);
       	linkdto.setPostid(nextval);
       	System.out.println("-----------------링크 시작");
       	System.out.println("링크아이디 : " + linkdto.getLinkid());
       	System.out.println("링크포스트아이디 : " + linkdto.getPostid());
       	System.out.println("-----------------링크 끝");
       	
//       	comdto.setPostid(nextval);
//       	comdto.setUserid(userid);
//     	    System.out.println("-----------------댓글 시작");
//       	System.out.println("댓글 포스트아이디 : " + comdto.getPostid());
//       	System.out.println("댓글 유저아이디 : " + comdto.getUserid());
//       	System.out.println("-----------------댓글 끝");
       	
       	
       	
	      String encoding = "utf-8";
	      request.setCharacterEncoding(encoding);
	      
	      try {
	         // File : 파일 또는 디렉토리(폴더)를 관리하는 class
	         File currentDirPath = new File("C:\\temp\\upload");
	         
	         // 세팅
	         DiskFileItemFactory factory = new DiskFileItemFactory();
	         factory.setRepository(currentDirPath);   // 경로 지정
	         factory.setSizeThreshold(1024 * 1024);   // 임시 파일의 크기를 byte단위로

	         ServletFileUpload upload = new ServletFileUpload(factory);
	         // 업로드 파일의 최대 크기 지정
	         upload.setFileSizeMax(1024*1024*100); // 100 메가 바이트 100MB
	         
	         // request를 분석해서
	         // 요청 파라메터들을 FileItem 뽑고 그걸 List에 담아서 돌려줌
	         List<FileItem> items = upload.parseRequest(request);
	         for (int i = 0; i < items.size(); i++) {
	            
	            FileItem fileItem = (FileItem) items.get(i);

	            // form 요소인지 판별
	            if (fileItem.isFormField()) {
	               // getFieldName : 파라메터 key
	               // getString : 파라메터 value
	               System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
	               
//	       	    boarddto.setUserid(userid);
//	       	    boarddto.setTitle(write);
//	       	    boarddto.setContent(main);
               	              
	               
			             
	               
	            if(fileItem.getFieldName().equals("write")) {
					                  
			    boarddto.setTitle(fileItem.getString(encoding));
			    System.out.println("제목과 파일 : " + fileItem.getString(encoding));
					               }
		            
					               
	            
	            
	            
		         if(fileItem.getFieldName().equals("main")) {
						                  
				 boarddto.setContent(fileItem.getString(encoding));
			     System.out.println("내용과 파일 : " + fileItem.getString(encoding));
						            }
				                  
								                 
							                  
//				  linkdto.setLink(link);	         
								          	               
										                 
												                  
												                  
												                                   
			      if(fileItem.getFieldName().equals("link")) {
																                  
				  linkdto.setLink(fileItem.getString(encoding));
				  System.out.println("링크주소 : " + fileItem.getString(encoding));
									}
				           					                  
												                  
							
//			      if(fileItem.getFieldName().equals("com")) {
//	                  
//				  comdto.setCommenttext(fileItem.getString(encoding));
//				  System.out.println("댓글입력!!!!!!!! : " + fileItem.getString(encoding));
//										}
			      
												                  
												                  
												                  
												                  
	            } else {
	               // 첨부파일 영역
	               
	               // getSize : 파일 크기
	               if (fileItem.getSize() > 0) {
	                  // 파일명 추출
	                  String fileName = fileItem.getName();
	                  
	                  fileName = System.currentTimeMillis() +"_"+ fileName;
	                  
	                  // 이건 여기서 처리
	                  System.out.println("-----------------파일 시작");
	                  filedto.setPostid(nextval);
	                  System.out.println("이것은 파일포스트아이디:" + filedto.getPostid());
	                  filedto.setFileid(nextval);	
	                  System.out.println("이것은 파일아이디:" + filedto.getFileid());
	                  filedto.setFile_name(fileName);
	                  System.out.println("이것은 파일네임:" + fileName);
	                  System.out.println("-----------------파일 끝");
	                  File uploadFile = new File(currentDirPath + "\\" + fileName);
//	                  File uploadFile = new File(currentDirPath + File.separator + fileName);
//	                  File uploadFile = new File(currentDirPath + System.getProperty("file.separator") + fileName);
	                  
	                  // 파일 저장
	                  fileItem.write(uploadFile);
	                  
	               } // end if
	            } // end if
	         } // end for
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
//	    boarddto.setUserid(userid);
//	    boarddto.setTitle(write);
//	    boarddto.setContent(main);
//      boarddto.setNotify(notify);         

 	    
        
//      linkdto.setLink(link);	         
//	    linkdto.setLinkid(nextval);
//	    linkdto.setPostid(nextval);
	    
//	 	filedto.setFileid(nextval);	 
//	 	filedto.setPostid(nextval);	
//	 	filedto.setFiles(nextval);	 
//	 	filedto.setFile_name(file);		         
	         
	 
//	    System.out.println("보드포스트아이디" + boarddto.getPostid());
//	    System.out.println("보드유저아이디" + boarddto.getUserid());
//		System.out.println("보드제목" + boarddto.getTitle());
//		System.out.println("보드내용" + boarddto.getContent());
//		System.out.println("보드공지사항" + boarddto.getNotify());
//		
//		
//		System.out.println("링크주소" + linkdto.getLink());
//		System.out.println("링크아이디" + linkdto.getLinkid());
//		System.out.println("링크포스트아이디" + linkdto.getPostid());
	         
//	 	System.out.println("파일아이디" + filedto.getFileid());
//	 	System.out.println("파일포스트아이디" + filedto.getPostid());
//	 	System.out.println("파일" + filedto.getFiles());
//	 	System.out.println("파일이름" + filedto.getFile_name());	 
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    // DAO 메소드에 저장
	    board_DAO boarddao = new board_DAO();
	    // 인서트
	    int result = boarddao.PostList(boarddto);
	    System.out.println("결과물임 : " + result);
        // 셀렉트
	    List result2 = boarddao.selectList();
	    request.setAttribute("result2", result2);
        // 댓글유저
	    
	    
	    
	    
	    
	    
	    linkDAO linkdao = new linkDAO();
	    // 인서트
	    int link2 = linkdao.Linkinsert(linkdto);
	    System.out.println("결과물링크 : " + link2);
	    // 셀렉트
	    List linkk = linkdao.selectlink();

        // where 셀렉트
	    List links = linkdao.selectlinkid(linkdto);
	    request.setAttribute("links", links);
	    
	    
	    
	    
	    
	    
	    
	    // Autowire
	    FileDAO filedao = new FileDAO();
	    int file = filedao.fileinsert(filedto);
	    System.out.println("파일인서트 성공했는지 : " + file);
	    List fileselect = filedao.fileselect();
	    System.out.println("파일셀렉트 성공했는지 : " + fileselect);
	    
	    
	    
	    
	    
	    
	    
	    
	    // 문제1
	    String url = "board.jsp";
	    request.getRequestDispatcher(url).forward(request, response);
	    
	    // 5. redirect & forward
	    // return "redirect:login.do";
	    // return "forward:login.do";
	    
	    
	    
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
	      
	
	 
	      
	      
	      
	          
		}
	
	
	
	
}
	    
	    
	    
	    
	    
	    
	
	    
	           
	      
	       
	    
	
	

