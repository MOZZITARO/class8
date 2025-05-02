package Link;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Board.board_DTO;


public class linkDAO {

	public int Linkinsert(linkDTO linkDTO) {
		System.out.println("---------------링크 테스트 실행");
		int result = -1;

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();
 
			if (ds == null) {
			    System.out.println("DataSource가 null입니다. JNDI 설정을 확인하세요.");
			} else {
			    System.out.println("DataSource 정상 연결됨 링크!");
			}
			
			// [SQL 준비]
			String query = " insert into linkattachments ";
			// 방법 1 : sql string을 그냥 만들기
//					query += " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
			// 방법 2 : ? 활용하기
			query += " values (seq_linkattachments.nextval, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(query);
			// 첫번째 물음표에 값을 넣기
			// 검색값
			ps.setInt(1, linkDTO.getPostid());
			ps.setString(2, linkDTO.getLink());
			
			
			
			
			System.out.println("구분 --------------------");
			System.out.println("링크아이디 출력 : " + linkDTO.getLinkid());
			System.out.println("링크포스트아디 출력 : " + linkDTO.getPostid());
			System.out.println("링크주소출력 : " + linkDTO.getLink());
			
			// [SQL 실행] 및 [결과 확보]
			// int executeUpdate() : select 외 모든 것
			// int에는 영향받은 줄의 수
			// DB에 삽입함
			result = ps.executeUpdate();
			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	
	
	
	public List selectlink() {
		System.out.println("링크 셀렉트");
		List list2 = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
			
			String query = " select * from LINKATTACHMENTS ";      
			PreparedStatement ps = con.prepareStatement(query);
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
			
			
			
			while(rs.next()) {

				linkDTO dto = new linkDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto.setLinkid(rs.getInt("linkid"));
				dto.setPostid(rs.getInt("postid"));
				dto.setLink(rs.getString("link"));
				
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list2.add(dto);
                 
				System.out.println("셀렉트링크아디 :" + rs.getInt("linkid"));
				System.out.println("셀렉트포스트아디 :" + rs.getInt("postid"));
				System.out.println("셀렉트링크 :" + rs.getString("link"));	
			} 
			System.out.println("여기까지 됨 끝");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list2;
	}
	
	
	
	
	
	
	
	
	
	
	
	public List selectlinkid(linkDTO linkDTO) {
		System.out.println("--------------------------");
		
		System.out.println("id 링크 셀렉트");
		
		List list2 = new ArrayList();
		System.out.println("여기까지 됨1");
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();
			System.out.println("여기까지 됨1-1");
			// [SQL 준비]
			// 조회했음
			System.out.println("여기까지 됨2");
			System.out.println("linkDTO.getPostid() : "+ linkDTO.getPostid());
			String query =  " select * from linkattachments ";
				   query += " where postid = ? ";
			System.out.println("query: " + query);
			System.out.println("여기까지 됨2-1");
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, linkDTO.getPostid());
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
			System.out.println("여기까지 됨3");
			
			
			while(rs.next()) {

				linkDTO dto2 = new linkDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto2.setLinkid(rs.getInt("linkid"));
				dto2.setPostid(rs.getInt("postid"));
				dto2.setLink(rs.getString("link"));
				
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list2.add(dto2);
                 
				System.out.println("셀렉트링크아디임 :" + rs.getInt("linkid"));
				System.out.println("셀렉트포스트아디임 :" + rs.getInt("postid"));
				System.out.println("셀렉트링크임 :" + rs.getString("link"));
			} 
			System.out.println("여기까지 됨 끝");
			System.out.println("------------------------");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list2;
	}
	
	
	
	
	
	
	// 수정 페이지에 제목과 내용 가져오기
		public List Modifylink(linkDTO linkDTO) {
			System.out.println("수정페이지에 링크주소");
			List list3 = new ArrayList();

			try {
				// [DB 접속] 시작
				Context ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				Connection con = ds.getConnection();

				// [SQL 준비]
				// 조회했음
//				boardDTO dto2 = new boardDTO();
				String query = " select * from linkattachments "
						     + " where postid = ? ";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setInt(1, linkDTO.getPostid());
				System.out.println("수정 포스트 아이디 출력 : "  + linkDTO.getPostid());
				// [SQL 실행] 및 [결과 확보]
				ResultSet rs = ps.executeQuery();
	           
				
				
				 rs.next(); {

					 linkDTO dto3 = new linkDTO();
					// 실행(조회)된 것에서 // INT를 가져옴(입력X)
					// ( int "" )
					// rs.number("nextval)

					// getstring 메소드에 title을 넣어서
					// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
					dto3.setLinkid(rs.getInt("linkid"));
					dto3.setPostid(rs.getInt("postid"));
					dto3.setLink(rs.getString("link"));
					
					// DB에서 VARCHAR(해당하는 값)을 가져옴
	                  
					list3.add(dto3);
	                
				}
				System.out.println("구분 --------------------");
				System.out.println("수정페이지 링크아이디출력 : "  + rs.getInt("linkid"));
				System.out.println("수정페이지 포스트아이디출력 : "  + rs.getInt("postid")); 
				System.out.println("수정페이지 링크출력 : "  + rs.getString("link"));
				con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	return list3;
	}
		
	
	
		
		// 수정 페이지에 내용 수정하기
		public int UpdateLink(linkDTO linkDTO) {
			System.out.println("링크 업데이트");
			
	        int rs = 0;
			try {
				// [DB 접속] 시작
				Context ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
				Connection con = ds.getConnection();

				// [SQL 준비]
				// 조회했음
//				boardDTO dto2 = new boardDTO();
				String query = " update linkattachments "					
						     + " set link = ? "    
						     + " where postid = ? ";
				PreparedStatement ps = con.prepareStatement(query);				
				ps.setString(1, linkDTO.getLink());
				ps.setInt(2, linkDTO.getPostid());
				
				System.out.println("링크 업뎃 :" + linkDTO.getLink());	
				System.out.println("링크 포스트아이디 업뎃 :" + linkDTO.getPostid());
				
				// [SQL 실행] 및 [결과 확보]
				rs = ps.executeUpdate();
	           
				
				
//				 rs.next(); {
	//
//					boardDTO dto5 = new boardDTO();
					// 실행(조회)된 것에서 // INT를 가져옴(입력X)
					// ( int "" )
					// rs.number("nextval)

					// getstring 메소드에 title을 넣어서
					// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
//					dto5.setPostid(rs.getInt("postid"));
//					dto5.setUserid(rs.getInt("userid"));
//					dto5.setTitle(rs.getString("title"));
//					dto5.setContent(rs.getString("content"));
//					dto5.setPostdate(rs.getDate("postdate"));
					// DB에서 VARCHAR(해당하는 값)을 가져옴
	                  
//					list5.add(dto5);
//	                
//				}
				 
//				System.out.println("수정메소드출력 : "  + rs.getString("title"));
//				System.out.println("수정메소드출력 : "  + rs.getString("content"));
				con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}

	return rs;
	}	
	
	
	
}
