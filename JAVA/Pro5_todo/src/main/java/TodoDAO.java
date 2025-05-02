import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TodoDAO {

	
	
	                       // 전달인자
	public int insertTodo(TodoDTO todoDTO) {
		
		

		int result = -1;
		
		
		
		try {
			
			
			
						
						// DB접속 시작
			            // context.xml의 Resource 중에 jdbc/oracle 가져오기
						// JNDI 방식으로.....
						Context ctx = new InitialContext();
						DataSource ds =  (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
						
						//커넥션 풀에서 접속 정보를 가져오기
						//접속이 안되면 null
						Connection con = ds.getConnection();
						
						//SQL 준비
						String query = "insert into todo ";
						query += "values ( seq_todo.nextval, ?, sysdate, null, 'N' )";
						
						PreparedStatement ps = con.prepareStatement(query);
						
						
						//SQL 실행 및 결과 확보
						// int executeUpdate() : "select 외 모든 것"
						// int에는 영향받은 줄의 수
						ResultSet rs = ps.executeQuery();
						while(rs.next()) {
							
							TodoDTO dto = new TodoDTO();
							dto.setTodo_id(rs.getInt("todo_id"));
							dto.setTodo(rs.getString("todo"));
							dto.setCreate_date(rs.getDate("create_date"));
							dto.setModify_date(rs.getDate("modify_date"));
							dto.setDone(rs.getString("done"));
							
						}
			            
						con.close();

			
			
		} catch (Exception e) {
		     e.printStackTrace();	
		}
		
	    return result;
			
	}
	
	
	
	
	
	
	List selectTodoList() {
	List list = new ArrayList();
		
		
		
		try {
			
			
			
			
			// DB접속 시작
            // context.xml의 Resource 중에 jdbc/oracle 가져오기
			// JNDI 방식으로.....
			Context ctx = new InitialContext();
			DataSource ds =  (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			//커넥션 풀에서 접속 정보를 가져오기
			//접속이 안되면 null
			Connection con = ds.getConnection();
			
			//SQL 준비
			String query = " select * from todo ";
			PreparedStatement ps = con.prepareStatement(query);
			
			
			//SQL 실행 및 결과 확보
			// int executeUpdate() : "select 외 모든 것"
			// int에는 영향받은 줄의 수
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				TodoDTO dto = new TodoDTO();
				
				dto.setTodo_id(rs.getInt("todo_id"));
				dto.setTodo(rs.getString("todo"));
				dto.setCreate_date(rs.getDate("create_date"));
				dto.setModify_date(rs.getDate("modify_date"));
				dto.setDone(rs.getString("done"));
				
			}
            
			con.close();


} catch (Exception e) {
 e.printStackTrace();	
}

		// 돌려준다
		return list;
		
	}
	

	
}
