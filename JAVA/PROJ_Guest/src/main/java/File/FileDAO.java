package File;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import Board.board_DTO;
import Link.linkDTO;

public class FileDAO {

	
	
	public int fileinsert(FileDTO FileDTO) {
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
			String query = " insert into fileattachments ";
			// 방법 1 : sql string을 그냥 만들기
//					query += " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
			// 방법 2 : ? 활용하기
			query += " values (seq_fileattachments.nextval, ?, ?, ?) ";
			PreparedStatement ps = con.prepareStatement(query);
			// 첫번째 물음표에 값을 넣기
			// 검색값
			ps.setInt(1, FileDTO.getPostid());
			ps.setString(2, FileDTO.getFiles());
			ps.setString(3, FileDTO.getFile_name());
			
			System.out.println("파일포스트아이디" + FileDTO.getPostid());
			System.out.println("파일" + FileDTO.getFiles());
			System.out.println("파일이름" + FileDTO.getFile_name());
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
	
	
	public List fileselect() {
		System.out.println("파일 셀렉트");
		List list2 = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
			
			String query = " select * from fileattachments ";      
			PreparedStatement ps = con.prepareStatement(query);
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
			
			
			
			while(rs.next()) {

				FileDTO dto = new FileDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				dto.setFileid(rs.getInt("fileid"));
				dto.setPostid(rs.getInt("postid"));
				dto.setFiles(rs.getString("files"));
				dto.setFile_name(rs.getString("file_name"));
				
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list2.add(dto);
				System.out.println("셀렉트파일아이디" + rs.getInt("fileid"));
				System.out.println("셀렉트파일포스트아이디" + rs.getInt("postid"));
				System.out.println("셀렉트파일" + rs.getString("files"));
				System.out.println("셀렉트파일이름" + rs.getString("file_name"));  	
			} 
			System.out.println("여기까지 됨 끝");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list2;
	}
	
	
	
	
	
	public List fileselectid(FileDTO FileDTO) {
		System.out.println("특정파일목록");
		List list2 = new ArrayList();

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
//			boardDTO dto2 = new boardDTO();
			String query = " select * from fileattachments "
					     + " where postid = ? ";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1, FileDTO.getPostid());
			System.out.println("특정목록 postid출력 : "  + FileDTO.getPostid());
			
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
           
			
			
			 rs.next(); {

				 FileDTO dto2 = new FileDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
				    dto2.setFileid(rs.getInt("fileid"));
					dto2.setPostid(rs.getInt("postid"));
					dto2.setFiles(rs.getString("files"));
					dto2.setFile_name(rs.getString("file_name"));
				
				/* dto2.setViewcount(rs.getInt("viewcount")); */
				// DB에서 VARCHAR(해당하는 값)을 가져옴
                  
				list2.add(dto2);
                
			}
			    System.out.println("특정 파일아이디" + rs.getInt("fileid"));
				System.out.println("특정 파일포스트아이디" + rs.getInt("postid"));
				System.out.println("특정 파일" + rs.getString("files"));
				System.out.println("특정 파일이름" + rs.getString("file_name"));  	
			/* System.out.println("boardDAO의 newList 조회수출력 : " + rs.getInt("viewcount")); */
			con.close();
	
} catch (Exception e) {
	e.printStackTrace();
}

return list2;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int fileupdate(FileDTO FileDTO) {
		System.out.println("--------------------------파일 시작");
		
		
		
		int rs = 0;
		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();
			
			// [SQL 준비]
			
			System.out.println("FileDTO.getPostid() : "+ FileDTO.getPostid());
			
			String query = " update fileattachments "
					     + " set file_name = ? "
				         + " where postid = ? ";
			System.out.println("query: " + query);
			
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, FileDTO.getFile_name());
			ps.setInt(2, FileDTO.getPostid());
			System.out.println("파일이름 : " + FileDTO.getFile_name());
			System.out.println("파일 포스트아이디 :" + FileDTO.getPostid());
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			rs = ps.executeUpdate();
			
			
			
//			while(rs.next()) {
//
//				FileDTO dto = new FileDTO();
				// 실행(조회)된 것에서 // INT를 가져옴(입력X)
				// ( int "" )
				// rs.number("nextval)

				// getstring 메소드에 title을 넣어서
				// 나온결과를 dto메소드에 전달인자로 넣어서 결과를만듬
//				dto.setFileid(rs.getInt("fileid"));
//				dto.setPostid(rs.getInt("postid"));
//				dto.setFiles(rs.getString("files"));
//				dto.setFile_name(rs.getString("file_name"));
//				
//				
//				// DB에서 VARCHAR(해당하는 값)을 가져옴
//
//				list2.add(dto);
//                 
//				System.out.println("파일아디 :" + rs.getInt("fileid"));
//				System.out.println("파일포스트아디 :" + rs.getInt("postid"));
//				System.out.println("파일 :" + rs.getString("files"));	
//				System.out.println("파일네임 :" + rs.getString("file_name"));	
//			} 
//			System.out.println("여기까지 됨 끝");
//			System.out.println("------------------------");
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rs;
	}
	
	
	
	

	
	
	
	
	
}
