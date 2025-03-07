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
		
		
//		String url2 = "Write.jsp";
//		response.sendRedirect(url2);
		
		
	                               // "검색값"을 가져온다         
		String title = request.getParameter("title");
		                          // "검색값"을 가져온다2
		String name = request.getParameter("name");
		
		
		boardDTO boarddto = new boardDTO();
		         // DTO Name메소드에 set(저장한다) - 초기화 // getname
		boarddto.setName(name);
		boarddto.setTitle(title);
		      
	
		boardDAO boarddao = new boardDAO();
        // DAO메소드에 DTO값을 저장한다
		
		int result = boarddao.PostList(boarddto);
		System.out.println("result : " + result);
		
		
		List result2 = boarddao.selectList();
		for(int i=0; i<result2.size(); i++) {
			boardDTO dto = new boardDTO();
			
			dto = (boardDTO) result2.get(i);
			System.out.println("dto.title : " + dto.getTitle());
			System.out.println("dto.name : " + dto.getName());
		}
		request.setAttribute("result2", result2);
		
		String url = "board.jsp";
		
		request.getRequestDispatcher(url).forward(request, response);
	
	
		
	}

	
}
