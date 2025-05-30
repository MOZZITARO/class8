package pro6_COOKIE;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/setCOOKIE")
public class setCOOKIE extends HttpServlet {
	
       
  
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// 만료일이 있는 쿠키
		// 브라우저 자체에 SQLite(DB)또는 파일로 저장
		Cookie c1 = new Cookie("key", "Value");
//		c1.setMaxAge(0); // 초 단위
        c1.setMaxAge(30); // 초 단위 (10초)
		response.addCookie(c1);
		
		// 만료일없는 세션 쿠키 만들기
		Cookie c2 = new Cookie("name", "value2");
		c2.setMaxAge(-1);
		// 세션쿠키 : 만료일이 없는 쿠키
		// setMaxAge를 설정하지 않거나 
		// 음수를 넣어서 만든다
		// 브라우저 메모리에만 저장됨.
		// 즉, 브라우저의 모든 탭을 끄면 사라짐
		response.addCookie(c2);
		
		String value = "한글";
		value = URLEncoder.encode(value, "utf-8");
		System.out.println("value : " + value);
		Cookie c3 = new Cookie("name2", "한글");
		response.addCookie(c3);
		
	}

	

}
