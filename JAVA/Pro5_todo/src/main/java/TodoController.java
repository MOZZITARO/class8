

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TodoController")
public class TodoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TodoDAO todoDAO = new TodoDAO();
		
		
		
		String url = "/WEB-INF/views/list.jsp";
		request.getRequestDispatcher(url).forward(request, response);
		
	
	}

	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post");
		
		// *요청 내용 한글깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// *응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
		
		String post = request.getParameter("todo");
		System.out.println(post);
		
		
	
		TodoDTO todoDTO = new TodoDTO();
		todoDTO.setTodo(post);
		
		
		
		TodoDAO todoDAO = new TodoDAO();
		int result = todoDAO.insertTodo(todoDTO);
		System.out.println("result : " + result);
		
		
	}

}
