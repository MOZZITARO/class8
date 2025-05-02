package Comment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Board.board_DTO;

public class CommentDAO {

	
	public int Commentinsert (CommentDTO CommentDTO) {
		System.out.println("CommentDTO 테스트 실행");
		int result = -1;
        
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();
 
			if (ds == null) {
			    System.out.println("DataSource가 null입니다. JNDI 설정을 확인하세요.");
			} else {
			    System.out.println("DataSource 정상 연결됨!");
			}
			
			// [SQL 준비]
			String query = " insert into comments ";
			// 방법 1 : sql string을 그냥 만들기
//					query += " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
			// 방법 2 : ? 활용하기
			query += " values (seq_comments.nextval, ?, ?,  sysdate, ?) ";
			PreparedStatement ps = con.prepareStatement(query);
			// 첫번째 물음표에 값을 넣기
			// 검색값
			ps.setInt(1, CommentDTO.getPostid());
			ps.setString(2, CommentDTO.getUserid());
			ps.setString(3, CommentDTO.getCommenttext());
			
			System.out.println("댓글란의 아이디 : " + CommentDTO.getCommentid());
			System.out.println("댓글란의 날짜 : " + CommentDTO.getCommentdate());
			
			System.out.println("댓글란의 포스트아이디 : " + CommentDTO.getPostid());
			System.out.println("댓글란의 유저아이디 : " + CommentDTO.getUserid());
			System.out.println("댓글 : " + CommentDTO.getCommenttext());
			// [SQL 실행] 및 [결과 확보]
			// int executeUpdate() : select 외 모든 것
			// int에는 영향받은 줄의 수
			// DB에 삽입함
			result = ps.executeUpdate();
			System.out.println("INSERT 결과: " + result);
			con.close();
			

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류가 났어요");
		}

		return result;
	}
	
	
	public List Commentselect() {
		System.out.println("게시판 조회");
		List list = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
			String query = " select * from comments ";
			PreparedStatement ps = con.prepareStatement(query);
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();

			
			
			while (rs.next()) {

				CommentDTO dto = new CommentDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto.setCommentid(rs.getInt("commentid"));
				dto.setUserid(rs.getString("userid"));
				
				dto.setPostid(rs.getInt("postid"));
				dto.setUserid(rs.getString("userid"));
				dto.setCommenttext(rs.getString("commenttext"));
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list.add(dto);
				
				
//				System.out.println("댓글란의 아이디 : " + rs.getInt("commentid"));
//				System.out.println("댓글란의 날짜 : " + rs.getString("userid"));
//				
//				System.out.println("댓글란의 포스트아이디 : " + rs.getInt("postid"));
//				System.out.println("댓글란의 유저아이디 : " + rs.getString("userid"));
//				System.out.println("댓글 : " + rs.getString("commenttext"));
			} 

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
			
	                       // 주의
	                      // 값을 가져올때.
	public List Commentselectid(CommentDTO CommentDTO) {
		System.out.println("특정 댓글 조회");
		List list2 = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " select * from comments "
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, CommentDTO.getPostid());
			System.out.println("댓글 특정 포스트아이디출력 : "  + CommentDTO.getPostid());
			
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
           
			
			
			 while(rs.next()) {

				CommentDTO dto2 = new CommentDTO();
				
				dto2.setCommentid(rs.getInt("commentid"));
				dto2.setUserid(rs.getString("userid"));
				
				dto2.setPostid(rs.getInt("postid"));
				dto2.setUserid(rs.getString("userid"));
				dto2.setCommenttext(rs.getString("commenttext"));
				
				/* dto2.setViewcount(rs.getInt("viewcount")); */
				// DB에서 VARCHAR(해당하는 값)을 가져옴
                  
				list2.add(dto2);
                
				
				System.out.println("댓글란의 특정 아이디 : " + rs.getInt("commentid"));
				System.out.println("댓글란의 특정 날짜 : " + rs.getString("userid"));
				
				System.out.println("댓글란의 특정 포스트아이디 : " + rs.getInt("postid"));
				System.out.println("댓글란의 특정 유저아이디 : " + rs.getString("userid"));
				System.out.println("댓글 : " + rs.getString("commenttext"));
			}
			con.close();
	
} catch (Exception e) {
	e.printStackTrace();
}

return list2;
}
	
	
	
	
	
	
	public int Deletecomment(CommentDTO CommentDTO) {
		System.out.println("게시판 조회");
		
//		int a = 0;
		int rs = 0;
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " delete from comments"
					     + " where commentid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, CommentDTO.getCommentid());
			System.out.println("댓글삭제의 DeleteList commentid출력 : "  + CommentDTO.getCommentid());
			// [SQL 실행] 및 [결과 확보]
			rs = ps.executeUpdate();
            System.out.println("댓글삭제 결과확보 : " + rs);
			
			
			
			
//			 rs.next(); {
//
//				boardDTO dto3 = new boardDTO();
//				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
//				// ( int "" )
//				// rs.number("nextval)
//
//				// getstring 메소드에 title을 넣어서
//				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
//				dto3.setPostid(rs.getInt("postid"));
//				dto3.setUserid(rs.getInt("userid"));
//				dto3.setTitle(rs.getString("title"));
//				dto3.setContent(rs.getString("content"));
//				dto3.setPostdate(rs.getDate("postdate"));
//				// DB에서 VARCHAR(해당하는 값)을 가져옴
//                  
//				list3.add(dto3);
//                
//			}
//			 
//			System.out.println("boardDAO의 DeleteList postid출력 : "  + rs.getInt("postid"));
//		
			
			
			
			con.close();
//		    a = 10;
} catch (Exception e) {
	e.printStackTrace();
	
}
        
		return rs;
		
}
	
	
	
	
	
	
	public int Updatecomment(CommentDTO CommentDTO) {
		System.out.println("댓글 수정");
		
        int rs = 0;
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " update comments "					
					     + " set commenttext = ? "    					     
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, CommentDTO.getCommenttext());
			ps.setInt(2, CommentDTO.getPostid());
			
			
			System.out.println("댓글 :" + CommentDTO.getCommenttext());
			System.out.println("댓글포스트아이디 :" + CommentDTO.getPostid());
			
			
			// [SQL 실행] 및 [결과 확보]
			rs = ps.executeUpdate();
            System.out.println("댓글 수정 성공" + rs);
			
			
//			 rs.next(); {
//
//				boardDTO dto5 = new boardDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
//				dto5.setPostid(rs.getInt("postid"));
//				dto5.setUserid(rs.getInt("userid"));
//				dto5.setTitle(rs.getString("title"));
//				dto5.setContent(rs.getString("content"));
//				dto5.setPostdate(rs.getDate("postdate"));
				// DB에서 VARCHAR(해당하는 값)을 가져옴
                  
//				list5.add(dto5);
//                
//			}
			 
//			System.out.println("수정메소드출력 : "  + rs.getString("title"));
//			System.out.println("수정메소드출력 : "  + rs.getString("content"));
			con.close();
	
} catch (Exception e) {
	e.printStackTrace();
}

return rs;
}		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
