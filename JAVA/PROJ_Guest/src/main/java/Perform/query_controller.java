package Perform;

import Perform.queryDAO;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/query")
public class query_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	
		queryDTO dt = new queryDTO();
		
		queryDAO da = new queryDAO();
		List list = da.selectList(dt);
		request.setAttribute("query", list);
		System.out.println("리스트 결과 출력 : " + list.size());
		
		String url = "Perform.jsp";
	    request.getRequestDispatcher(url).forward(request, response);
	    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// *요청 내용 한글깨짐 방지
		request.setCharacterEncoding("utf-8");

		// *응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");

		
		String text = request.getParameter("perform");
		String date = request.getParameter("date");
		String week = request.getParameter("week");
		String month = request.getParameter("month");
		System.out.println(" 일 : " + date);
		System.out.println(" 주 : " + week);
		System.out.println(" 월 : " + month);
		System.out.println(" 검색 : " + text);
		
		queryDTO dt = new queryDTO();
		dt.setDate(date);       
		dt.setProductid(0);
		dt.setProductname(text);
		
		
		
		
		
		
		
		
		
		queryDAO da = new queryDAO();
		List list = da.selectList(dt);
		
		request.setAttribute("query", list);
		System.out.println("리스트 결과 출력 : " + list.size());
		
		String url = "Perform.jsp";
	    request.getRequestDispatcher(url).forward(request, response);
	}

}
