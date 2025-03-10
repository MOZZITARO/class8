package Board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/board")
public class board extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//DAO에서 받아서
		boardDAO dao = new boardDAO();
		List resultList = dao.selectList();
		//VIEW로 보냄
		request.setAttribute("resultList", resultList);
		
		String str = request.getParameter("todo");
		String str1 = request.getParameter("todo1");
		System.out.println(str + str1);
		
		
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8");

	    // 전달받은 값 확인
//	    String title = request.getParameter("title");
//	    String name = request.getParameter("name");
//	    
	    
	    
	    System.out.println("-----------------");
	    String write = request.getParameter("write");
	    String main = request.getParameter("main");
	    System.out.println(write);
	    System.out.println(main);
	    
	    

	    if (write == null || write.trim().isEmpty()) {
	    	write = "제목 없음"; // 기본값 설정
	    }

	    System.out.println("전달된 값: " + write + ", " + main);

	    boardDTO boarddto = new boardDTO();
	    boarddto.setTitle(write);
	    boarddto.setContent(main);

	    boardDAO boarddao = new boardDAO();
	    int result = boarddao.PostList(boarddto);

	    System.out.println("result : " + result);

	    List result2 = boarddao.selectList();
	    request.setAttribute("result2", result2);

	    String url = "board.jsp";
	    request.getRequestDispatcher(url).forward(request, response);
	    
	    
	    
	    
	    
	    System.out.println("-----------------!");
	    List result3 = boarddao.newList();
	    request.setAttribute("result2", result3);
	    System.out.println(result3);
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
}
