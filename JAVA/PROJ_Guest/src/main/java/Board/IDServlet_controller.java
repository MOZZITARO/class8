package Board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Comment.CommentDAO;
import Comment.CommentDTO;
import File.FileDAO;
import File.FileDTO;
import Link.linkDAO;
import Link.linkDTO;


@WebServlet("/IDServlet")
public class IDServlet_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int st = Integer.parseInt(request.getParameter("postid"));
		System.out.println("목록 누르면 포스트아이디 : " + st);
		
		
		// DTO에 세팅
		board_DTO dto = new board_DTO();
		dto.setPostid(st);
		System.out.println("보드포스트아이디 설정됨: " + dto.getPostid());
		
		linkDTO linkdto = new linkDTO();
	    //List list2 = new ArrayList();
	    linkdto.setPostid(st);
	    linkdto.setLinkid(st);
	    System.out.println("링크포스트아이디설정: " + linkdto.getPostid());
	    System.out.println("링크아이디설정 : " + linkdto.getLinkid());
	    
	    FileDTO filedto = new FileDTO();
	    filedto.setPostid(st);
	    System.out.println("파일포스트아이디설정: " + filedto.getPostid());
	    
	    
	    CommentDTO comdto = new CommentDTO();
	    comdto.setPostid(st);
	    System.out.println("댓글포스트아이디설정: " + comdto.getPostid());
	    
	    
	    
	    
	    
	    // 1
	    // DAO에 세팅
	    linkDAO linkdao = new linkDAO();
	                         // where 셀렉트
	    List list2 = linkdao.selectlinkid(linkdto);
	    
	    System.out.println("a1");
		for(int i=0; i<list2.size(); i++) {
			linkdto = (linkDTO) list2.get(i);
			System.out.println("post id : " + linkdto.getPostid() + ": 링크 주소: " + linkdto.getLink());
			System.out.println();
			
		}
		System.out.println("b1");
		
		request.setAttribute("linklist", list2);
		
		
		// 2
		// DAO에서 받아서 jsp로 전달
		board_DAO dao = new board_DAO();
		dao.viewcountList(dto); // 먼저 업뎃하고 
		
		List list = dao.newList(dto); // 그 다음 조회
		// where 셀렉트
		request.setAttribute("idpost", list);
		
		
		
		
		// 3
		FileDAO filedao = new FileDAO();
		List filelist = filedao.fileselectid(filedto);
		request.setAttribute("filelist", filelist);
		
		
		
		
		
		
		
		
		
		CommentDAO daocom = new CommentDAO();
//		List comlist = daocom.Commentselect();
//		request.setAttribute("comlist", comlist);
		List<CommentDTO> comList = daocom.Commentselectid(comdto);
		request.setAttribute("comList", comList);
		System.out.println("댓글됨?"  + comList);
		
		 // postId에 해당하는 게시글 조회
		request.setAttribute("dpo", st);
		
		
		
		
		
		
		
		  // ← postid만 넘겨도 됨
//		request.setAttribute("comment", commentList);

		
		
		
		
		
		
		
		String url = "Content.jsp";
	    request.getRequestDispatcher(url).forward(request, response);
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	
	
}


