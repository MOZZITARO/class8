package download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/filedownload")
public class filedownload extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("filename");
		
		String path = "C:\\temp\\upload";
		 File file= new File(path + "\\"+fileName);
		 
		 //브라우저 캐시를 사용하지 않도록 설정
		 response.setHeader("Cache-Control", "no-cache");
		 //지금 응답이 첨부파일이라는 것
		 // 그리고 그 파일이 이름이 ""
		 response.addHeader("Content-disposition", "attachment; fileName=" + fileName);
		 
		 //파일 읽기
		 FileInputStream fis = new FileInputStream(file);
		 byte[] buf = new byte[1024*1]; // 보통 8kb
		 
		 OutputStream os = response.getOutputStream();
		 int count = -1;
		 while( ( count = fis.read(buf) )    !=-1) {
			 os.write(buf, 0, count);
		 }
		 
		 os.close();
		 fis.close();
	}

	
	
}
