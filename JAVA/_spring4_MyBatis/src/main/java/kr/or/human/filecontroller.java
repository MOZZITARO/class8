package kr.or.human;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class filecontroller {

	
	@RequestMapping(value = "/uploads")
	public String joinEmp(
			
			
			
			) {

		return "upemp"; // jsp로 이동
	}
	
	
	
	
	
	@RequestMapping("/upload2")
    public String upload( MultipartHttpServletRequest req ) {
        
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        System.out.println("title: "+ title);
        System.out.println("content: "+ content);
        
        // 파일 처리
        MultipartFile mf = req.getFile("file1");
        
        long fileSize = mf.getSize();
        System.out.println("fileSize: "+ fileSize);
        
        String fileName = mf.getOriginalFilename();
        System.out.println("fileName: "+ fileName);
        
        try {
            String path = "C:\\temp\\upload";
            String safeFileName = path +"\\"+ System.currentTimeMillis() +"_"+ fileName;
            System.out.println("safeFileName: "+ safeFileName);
            File file = new File(safeFileName);
            System.out.println("파일 :" + file);
            mf.transferTo( file );
            
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return "upload";
    }
	
	
	
	

	
	
	
	
	
	
	
	
	
}
