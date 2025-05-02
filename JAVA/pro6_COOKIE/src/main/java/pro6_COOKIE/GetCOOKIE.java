package pro6_COOKIE;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;


@WebServlet("/get")
public class GetCOOKIE extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html"; );
		boolean isShow = true;
		
		Cookie[] cookies = request.getCookies(); 
		if(cookies != null) {
			for(int i=0; i< cookies.length; i++) {
				Cookie c = cookies[i];
				String name = c.getName();
				String value = c.getValue();
				System.out.println("name" + name);
				
				if("name2".equals(name)) {
					String str = URLDecoder.decode(value);
					System.out.println(str);
				}
				
			} 
			if( "key".equals(name) && "value".equals(value) ) {
				
			}
		}
		
		
		
	}

}
