package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class board_DAO {

	public int PostList(board_DTO boardDTO) {
		System.out.println("Post 테스트 실행");
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
			String query = " insert into POSTS ";
			// 방법 1 : sql string을 그냥 만들기
//					query += " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
			// 방법 2 : ? 활용하기
			query += " values (?, ?, ?,  ?,  sysdate, ?, 0) ";
//			PreparedStatement ps = con.prepareStatement(query);
			PreparedStatement ps = new LoggableStatement(con, query);

           
			// 첫번째 물음표에 값을 넣기
			// 검색값
			ps.setInt(1, boardDTO.getPostid());
			ps.setString(2, boardDTO.getUserid());
			ps.setString(3, boardDTO.getTitle());
			ps.setString(4, boardDTO.getContent());
			ps.setString(5, boardDTO.getNotify());   
			
			System.out.println("------------시작");
			System.out.println("보드포스트아이디" + boardDTO.getPostid());
			System.out.println("보드아이디" + boardDTO.getUserid());
			System.out.println("보드제목" + boardDTO.getTitle());
			System.out.println("보드내용" + boardDTO.getContent());
			System.out.println("보드공지사항" + boardDTO.getNotify());
			// [SQL 실행] 및 [결과 확보]
			// int executeUpdate() : select 외 모든 것
			// int에는 영향받은 줄의 수
			// DB에 삽입함
			 System.out.println( ( (LoggableStatement)ps ).getQueryString() );
			result = ps.executeUpdate();
			System.out.println("INSERT 결과: " + result);
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("오류가 났어요");
		}

		return result;
	}

	
	
	
	
	
	public List selectList() {
		System.out.println("게시판 조회");
		List list = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
			String query = " select * from Posts order by postdate desc  ";
			PreparedStatement ps = con.prepareStatement(query);
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();

			
			
			while (rs.next()) {

				board_DTO dto = new board_DTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto.setPostid(rs.getInt("postid"));
				dto.setUserid(rs.getString("userid"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setViewcount(rs.getInt("viewcount"));
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list.add(dto);
				
				System.out.println("보드 포스트아이디" + rs.getInt("postid"));
				System.out.println("보드 유저아이디" + rs.getString("userid"));
				System.out.println("보드제목" + rs.getString("userid"));
				System.out.println("보드내용" + rs.getString("content"));
				System.out.println("보드날짜" + rs.getDate("postdate"));
				System.out.println("보드조회수" + rs.getInt("viewcount"));
			} 

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
			
	                       
	public List newList(board_DTO boardDTO) {
		System.out.println("게시판 조회");
		List list2 = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " select * from Posts "
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, boardDTO.getPostid());
			System.out.println("특정목록 postid출력 : "  + boardDTO.getPostid());
			
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
           
			
			
			 rs.next(); {

				board_DTO dto2 = new board_DTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto2.setPostid(rs.getInt("postid"));
				dto2.setUserid(rs.getString("userid"));
				dto2.setTitle(rs.getString("title"));
				dto2.setContent(rs.getString("content"));
				dto2.setPostdate(rs.getDate("postdate"));
				dto2.setViewcount(rs.getInt("viewcount"));
				/* dto2.setViewcount(rs.getInt("viewcount")); */
				// DB에서 VARCHAR(해당하는 값)을 가져옴
                  
				list2.add(dto2);
                
			}
			System.out.println("특정목록 제목출력 : "  + rs.getString("title"));
			System.out.println("특정목록 내용출력 : "  + rs.getString("content"));
			System.out.println("특정목록 조회수출력 : "  + rs.getInt("viewcount"));
			/* System.out.println("boardDAO의 newList 조회수출력 : " + rs.getInt("viewcount")); */
			con.close();
	
} catch (Exception e) {
	e.printStackTrace();
}

return list2;
}
	
	
	
	
	
	
	
	
	
	
	
//	public List userList(board_DTO boardDTO) {
//		System.out.println("게시판 조회");
//		List list2 = new ArrayList();
//
//		String[] userIds = {"admin1", "admin2", "admin3", "admin4"};
//		
//		try {
//			// [DB 접속] 시작
//			Context ctx = new InitialContext();
//			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
//			Connection con = ds.getConnection();
//
//			// [SQL 준비]
//			// 조회했음
////			boardDTO dto2 = new boardDTO();
//			String query = "  select username from users"
//					     + "  INNER JOIN posts ON posts.userid = users.userid  "
//					     + "  WHERE users.userid = ? ";
//			PreparedStatement ps = con.prepareStatement(query);
//			
//			for (String userId : userIds)
//			ps.setString(1, boardDTO.getUserid());
//			System.out.println("특정 유저 Userid 출력 : "  + boardDTO.getUserid());
//			
//			// [SQL 실행] 및 [결과 확보]
//			ResultSet rs = ps.executeQuery();
//           
//			
//			
//			 rs.next(); {
//
//				board_DTO dto2 = new board_DTO();
//				dto2.setUserid(rs.getString("userid"));
//				/* dto2.setViewcount(rs.getInt("viewcount")); */
//				// DB에서 VARCHAR(해당하는 값)을 가져옴
//                  
//				list2.add(dto2);
//                
//			}
//			System.out.println("특정 유저 아이디 출력 : "  + rs.getString("userid"));
//			
//			/* System.out.println("boardDAO의 newList 조회수출력 : " + rs.getInt("viewcount")); */
//			con.close();
//	
//} catch (Exception e) {
//	e.printStackTrace();
//}
//
//return list2;
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int DeleteList(board_DTO boardDTO) {
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
			String query = " delete from Posts"
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, boardDTO.getPostid());
			System.out.println("boardDAO의 DeleteList postid출력 : "  + boardDTO.getPostid());
			// [SQL 실행] 및 [결과 확보]
			rs = ps.executeUpdate();
            System.out.println("결과확보 : " + rs);
			
			
			
			
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

	
	
	
	
	
	// 수정 페이지에 제목과 내용 가져오기
	public List ModifyList(board_DTO boardDTO) {
		System.out.println("게시판 조회");
		List list5 = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " select * from Posts "
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, boardDTO.getPostid());
			System.out.println("ModifyList 출력 : "  + boardDTO.getPostid());
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
           
			
			
			 rs.next(); {

				board_DTO dto5 = new board_DTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto5.setPostid(rs.getInt("postid"));
				dto5.setUserid(rs.getString("userid"));
				dto5.setTitle(rs.getString("title"));
				dto5.setContent(rs.getString("content"));
				dto5.setPostdate(rs.getDate("postdate"));
				// DB에서 VARCHAR(해당하는 값)을 가져옴
                  
				list5.add(dto5);
                
			}
			System.out.println("수정 제목출력 : "  + rs.getString("title"));
			System.out.println("수정 내용출력 : "  + rs.getString("content"));
			System.out.println("---------------------구분");
			con.close();
	
} catch (Exception e) {
	e.printStackTrace();
}

return list5;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 조회수 컬럼
	public int viewcountList(board_DTO board_DTO) {
		System.out.println("게시판 수정");
		
        int rs = 0;
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " update Posts "					
					     + " set viewcount = (select viewcount + 1 from posts where postid = ?) "    					  
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
//			ps.setInt(1, boardDTO.getViewcount() + 1);
			ps.setInt(1, board_DTO.getPostid());
			ps.setInt(2, board_DTO.getPostid());
			
			
			System.out.println("조회수 포스트 아이디 :" + board_DTO.getPostid());
			
			// [SQL 실행] 및 [결과 확보]
			rs = ps.executeUpdate();
           
			
			
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
	

	
	
	
	
	
	
	// 수정 페이지에 내용 수정하기
	public int UpdateList(board_DTO boardDTO) {
		System.out.println("게시판 수정");
		
        int rs = 0;
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " update Posts "					
					     + " set title = ? "    
					     + "   , content = ? "
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, boardDTO.getTitle());
			ps.setString(2, boardDTO.getContent());
			ps.setInt(3, boardDTO.getPostid());
			
			System.out.println("업데이트제목 :" + boardDTO.getTitle());
			System.out.println("업데이트내용 :" + boardDTO.getContent());
			System.out.println("업데이트아이디 :" + boardDTO.getPostid());
			
			// [SQL 실행] 및 [결과 확보]
			rs = ps.executeUpdate();
           
			
			
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
