

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloserVlet
 */
// 전용 어노테이션 // 주소까지 들어옴
// import
@WebServlet("/hello")
public class HelloserVlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	// ???
    public HelloserVlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("HelloServlet 생성");
    }

	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 메소드 // outputstream
		
		
//		response.getWriter()
//		.append("<strong>Served</strong> at: ")
//		.append(request.getContextPath());
//		
		
		PrintWriter out = response.getWriter();
		out.println("<h1>");
		out.print("Hello Servlet");
		out.println("<h1>");
		
		for(int i=0; i<5; i++) {
			out.println(i + "<br>");
		}
	}

    
    
	                   // 요청, 클라이언트의 모든 정보
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
