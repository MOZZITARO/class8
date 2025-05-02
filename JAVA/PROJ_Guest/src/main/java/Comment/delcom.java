package Comment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delcom")
public class delcom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int comdel = Integer.parseInt(request.getParameter("comdel"));
		int delcom = Integer.parseInt(request.getParameter("delcom"));
		System.out.println("삭제 코멘트아이디 :" + delcom);
		System.out.println("삭제 포스트아이디 :" + comdel);
		
		CommentDTO comdto = new CommentDTO();
		comdto.setCommentid(delcom);
		
		
		CommentDAO comdao = new CommentDAO();
        comdao.Deletecomment(comdto);
		
		
		
        response.sendRedirect("IDServlet?postid=" + comdel);
		
	}
	
	
	

}
