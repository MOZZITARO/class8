package Board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class boardDAO {

	public int PostList(boardDTO boardDTO) {
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
			String query = " insert into Posts ";
			// 방법 1 : sql string을 그냥 만들기
//					query += " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
			// 방법 2 : ? 활용하기
			query += " values (seq_todo.nextval, seq_todo.nextval, ?,  ?,  sysdate) ";
			PreparedStatement ps = con.prepareStatement(query);
			// 첫번째 물음표에 값을 넣기
			// 검색값
			ps.setString(1, boardDTO.getTitle());
			ps.setString(2, boardDTO.getContent());
			
			System.out.println(boardDTO.getTitle());
			System.out.println(boardDTO.getContent());
			// [SQL 실행] 및 [결과 확보]
			// int executeUpdate() : select 외 모든 것
			// int에는 영향받은 줄의 수
			// DB에 삽입함
			result = ps.executeUpdate();
			System.out.println("INSERT 결과: " + result);
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
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
			String query = " select * from Posts ";
			PreparedStatement ps = con.prepareStatement(query);

			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();

			
			
			while (rs.next()) {

				boardDTO dto = new boardDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto.setPostid(rs.getInt("postid"));
				dto.setUserid(rs.getInt("userid"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list.add(dto);

			}

			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
			
	
	
	
	
			public List newList() {
				System.out.println("게시판 조회");
				List list2 = new ArrayList();

				try {
					// [DB 접속] 시작
					Context ctx = new InitialContext();
					DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
					Connection con = ds.getConnection();

					// [SQL 준비]
					// 조회했음
					String query = " select * from Posts "
							     + " where postid =  ";
					PreparedStatement ps = con.prepareStatement(query);

					// [SQL 실행] 및 [결과 확보]
					ResultSet rs = ps.executeQuery();
                    System.out.println(rs);
					
					
					while (rs.next()) {

						boardDTO dto2 = new boardDTO();
						// 실행(조회)된 것에서 // INT를 가져옴(입력X)
						// ( int "" )
						// rs.number("nextval)

						// getstring 메소드에 title을 넣어서
						// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
						dto2.setPostid(rs.getInt("postid"));
						dto2.setUserid(rs.getInt("userid"));
						dto2.setTitle(rs.getString("title"));
						dto2.setContent(rs.getString("content"));
						dto2.setPostdate(rs.getDate("postdate"));
						// DB에서 VARCHAR(해당하는 값)을 가져옴
                          
						list2.add(dto2);
                        System.out.println(dto2);
					}

					con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list2;
	}

}
