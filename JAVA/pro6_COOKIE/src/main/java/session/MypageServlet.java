package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MypageServlet")
public class MypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		boolean isLogon = (boolean) session.getAttribute("isLogon");
		if(isLogon == null || !isLogon) {
			response.sendRedirect(request.getContextPath()+ "/cookie.jsp");
		}
		
		response.getWriter().println("여기는 로그인해야 올 수 있는 곳");
	    }

	
	
}
