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

			// [SQL 준비]
			String query = " insert into POST ";
			// 방법 1 : sql string을 그냥 만들기
//					query += " values ( seq_todo.nextval, '"+ todoDTO.getTodo() +"', sysdate, null, 'N' )";
			// 방법 2 : ? 활용하기
			query += " values ( ? , 20, ?) ";
			PreparedStatement ps = con.prepareStatement(query);
			// 첫번째 물음표에 값을 넣기
			// 검색값
			ps.setString(1, boardDTO.getTitle());
			ps.setString(2, boardDTO.getName());

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
			String query = " select * from POST ";
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
				dto.setTitle(rs.getString("title"));

				dto.setToday(rs.getInt("today"));
				dto.setName(rs.getString("name"));
				// DB에서 VARCHAR(해당하는 값)을 가져옴

				list.add(dto);

			}

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
