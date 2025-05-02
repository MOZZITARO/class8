package Comment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Link.nextvalDAO;


@WebServlet("/commentct")
public class commentct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// *요청 내용 한글깨짐 방지
		request.setCharacterEncoding("utf-8");

		// *응답 내용의 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8");
		
	
		
		
	   String comtext = request.getParameter("com");
	   System.out.println( " 댓글  :" + comtext);
	   
	   int comid = Integer.parseInt(request.getParameter("postid"));
	   System.out.println( " 댓글 포스트아이디 :" + comid);
	   String userid = "adminid1";
	   System.out.println( " 댓글 유저아이디 :" + userid);
	   
	   CommentDTO comdto = new CommentDTO();
	   
	 
		comdto.setCommenttext(comtext);
		comdto.setPostid(comid);
       	comdto.setUserid(userid);
     	System.out.println("-----------------댓글 시작");
     	System.out.println("댓글  : " + comdto.getCommenttext());
       	System.out.println("댓글 포스트아이디 : " + comdto.getPostid());
       	System.out.println("댓글 유저아이디 : " + comdto.getUserid());
       	System.out.println("-----------------댓글 끝");
      
		
       	
       	
       	
       	
       	
       	
       	
    
       	CommentDAO comdao = new CommentDAO();
       	
       	
       	
        int result = comdao.Commentinsert(comdto);
        System.out.println("댓글은 잘 들어갔는지.. : " + result);
    
        comdao.Commentselect();
        List list = comdao.Commentselectid(comdto);
        
        
        
        
        for(int i=0; i<list.size(); i++) {
        	CommentDTO ddt = (CommentDTO) list.get(i);
        	System.out.println("ddt: " + ddt.getCommenttext());
        }
        
        request.setAttribute("comment", list);
       
        
//        comdao.Deletecomment(comdto);
//        comdao.Updatecomment(comdto); // 다른 서블릿에 넣기
       	
       	
       	
       	
       	
       	
       	
       	
        response.sendRedirect("IDServlet?postid=" + comid);
	}

}
