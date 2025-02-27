

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */

// 톰캣(서버)
// 서블릿 주소 (목적지). 내 클래스. 톰캣이 수집
@WebServlet("/req")                   // 상속
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    // 한번만 실행(싱글톤)
    public RequestServlet() {
        super();
        System.out.println("request 생성자 실행");
    }

	// GET // 방식1
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet실행");
		
		// *요청 내용 한글깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// *응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		// 전달받은 "파라미터"의 *key를 적어서 "해당 값"을 얻어오기
		String num1 = request.getParameter("num1");
		System.out.println("num1 :" + num1);
		
		String num2 = request.getParameter("checkbox1");
		System.out.println("num2 :" + num2);
		
		
		
		
//		//getParameterValues
//		//같은 name으로 여러개 온 경우
//		//String 배열로 모두 받을 수 잇음
//		//없으면 null
//		String[] nums = request.getParameterValues("num");
//		for (String num : nums) {
//			System.out.println(num);
//		}
		
		
		
		
		
		
		// 돌려줌 화면에
		response.getWriter().print("<strong> num1 <strong>의 값은 :" + num1);
//		.append("Served at: ").append(request.getContextPath());
	}

	
	
	//POST // 방식2
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			    // 요청 내용 한글깨짐 방지
				request.setCharacterEncoding("utf-8");
				
				// 응답 내용의 한글 깨짐 방지
				response.setContentType("text/html; charset=utf-8");
//				doGet(request, response);
				
				
				// *전달받은 파라미터의 key를 적어서 해당 값을 얻어오기
				String num1 = request.getParameter("num1");
				System.out.println("num1 :" + num1);
		
				String num2 = request.getParameter("num2");
				System.out.println("num2 :" + num2);
				
				
				//AJAX 값 (원하는 값을 화면에 나타내기.)
				response.getWriter().println("{\"a\":\"100\"}");
	}
	

}
