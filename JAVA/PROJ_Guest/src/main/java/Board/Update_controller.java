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



import File.FileDAO;
import File.FileDTO;
import Link.linkDAO;
import Link.linkDTO;


@WebServlet("/Update")
public class Update_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// *요청 내용 한글깨짐 방지
		request.setCharacterEncoding("utf-8");

		// *응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		
		
		
//		int up = Integer.parseInt(request.getParameter("update"));
//		
//		String up2 = request.getParameter("uptitle");	
//		String up3 = request.getParameter("upcontent");
//		
//		String up4 = request.getParameter("uplink");
//		String up5 = request.getParameter("upfile");
		
		
		
//		System.out.println("업데이트아이디 : " + up);
//		System.out.println("업데이트제목 : " + up2);
//		System.out.println("업데이트내용 : " + up3);
//		System.out.println("업데이트내용 : " + up4);
		
		// 변경해야할 것
		board_DTO dtup = new board_DTO();
//		dtup.setPostid(up);
//		dtup.setTitle(up2);
//		dtup.setContent(up3);
//		
		linkDTO dtlink = new linkDTO();
//		dtlink.setPostid(up);
//		dtlink.setLink(up4);
		
		FileDTO dtfile = new FileDTO();
//		dtfile.setPostid(up);
//		dtfile.setFile_name(up5);
		// 파일 나타내기
		// 파일 수정
		
		
		
		
		
		
		
		// 파일업로드도 가져와야해서 이걸 씀
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
	                     
	               if(fileItem.getFieldName().equals("update")) {
	                                 // 여기다가 씀
	                   dtup.setPostid(Integer.parseInt(fileItem.getString(encoding)));
	                   System.out.println("아이디와 파일 : " + fileItem.getString(encoding));
	                   
	               }
	               
	               if(fileItem.getFieldName().equals("uptitle")) {
	                  
	                  dtup.setTitle(fileItem.getString(encoding));
	                   System.out.println("제목과 파일 : " + fileItem.getString(encoding));
	               }
	            
	               
	                  if(fileItem.getFieldName().equals("upcontent")) {
	                  
	                     dtup.setContent(fileItem.getString(encoding));
	                   System.out.println("내용과 파일 : " + fileItem.getString(encoding));
	               }
	                  
	                  
	                  
	                  
	                  
	                  
	                  
	                  if(fileItem.getFieldName().equals("update")) {
                          // 여기다가 씀
                      dtlink.setPostid(Integer.parseInt(fileItem.getString(encoding)));
                      System.out.println("아이디와 파일 : " + fileItem.getString(encoding));
            
                    }   
	                  
	                  if(fileItem.getFieldName().equals("uplink")) {
	                     
	                     dtlink.setLink(fileItem.getString(encoding));
	                   System.out.println("링크와 파일 : " + fileItem.getString(encoding));
	               }
	                  
	                 
	                  
	                  
	                  if(fileItem.getFieldName().equals("update")) {
		                     
		                     dtfile.setPostid(Integer.parseInt(fileItem.getString(encoding)));
		                   System.out.println("링크와 파일 : " + fileItem.getString(encoding));
		               }
	                  
	                  
	            } else {
	               // 첨부파일 영역
	               
	               // getSize : 파일 크기
	               if (fileItem.getSize() > 0) {
	                  // 파일명 추출
	                  String fileName = fileItem.getName();
	                  
	                  fileName = System.currentTimeMillis() +"_"+ fileName;
	                 
	                  dtfile.setFile_name(fileName);
	                  System.out.println("파일 이름 : " + fileName);
	                  
	                  File uploadFile = new File(currentDirPath + "\\" + fileName);
//	                  File uploadFile = new File(currentDirPath + File.separator + fileName);
//	                  File uploadFile = new File(currentDirPath + System.getProperty("file.separator") + fileName);
	                  
	                  // 파일 저장
	                  fileItem.write(uploadFile);
	                  
	               } // end if
	            } // end if
	         } // end for
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		board_DAO daup = new board_DAO();
		int uplist = daup.UpdateList(dtup);
//		request.setAttribute("uplist",uplist);
		
		linkDAO dalink = new linkDAO();
		int uplink = dalink.UpdateLink(dtlink);
//		request.setAttribute("uplink",uplink);
		
		FileDAO dafile = new FileDAO();
		int upfile = dafile.fileupdate(dtfile);
		
		
		
		// 브라우저로 요청 (주소를 바꿈) // GET
		String url = "board";
	    response.sendRedirect(url);
	    
	    
	    
	    
	} catch (Exception e) {
		e.printStackTrace();
	 }
	}
	
	
	
}
