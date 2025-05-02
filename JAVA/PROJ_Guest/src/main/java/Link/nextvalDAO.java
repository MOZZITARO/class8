package Link;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class nextvalDAO {

	
	
	
public int nextval() {
		int nextval = -1;
		System.out.println("넥스트발 메소드입니다");
		

		try {
			// [DB 접속] 시작
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			Connection con = ds.getConnection();

			// [SQL 준비]
			// 조회했음
			
			String query = " select seq_posts.nextval as postid from dual ";      
			PreparedStatement ps = con.prepareStatement(query);
             // 값을 넣을 곳이 없으니 받을것도 없다
			// [SQL 실행] 및 [결과 확보]
			ResultSet rs = ps.executeQuery();
			
			
			
			rs.next(); {

				nextval = rs.getInt("postid");
			


				System.out.println("postid의 시퀀스번호 :" + nextval);	
					
			} 
			
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			 
		}

		return nextval;
	}
	
	
	
	
	
	
	
	
}
