

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import kr.or.human.dto.EmpDTO;


@WebServlet("/DbServlet")
public class DbServlet extends HttpServlet {

       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			// *요청 내용 한글깨짐 방지
			request.setCharacterEncoding("utf-8");
			
			// *응답 내용의 한글 깨짐 방지
			response.setContentType("text/html; charset=utf-8");
			
			// DB접속 시작
            // context.xml의 Resource 중에 jdbc/oracle 가져오기
			// JNDI 방식으로.....
			Context ctx = new InitialContext();
			DataSource ds =  (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			//커넥션 풀에서 접속 정보를 가져오기
			//접속이 안되면 null
			Connection con = ds.getConnection();
			
			//SQL 준비
			String query = "select * from ";
			query += "emp";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			//SQL 실행
			// ResultSet: 담김 executeQuery : SQL 중 select 실행
			// int executeUpdate() : select 외 모든 것
			// ResultSet : select 조회 결과 전체
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			rs.next();  // 다음 "줄"로 커서를 이동
			            // 다음줄이 있으면 true, 없으면 false를 return
			
			List<Map> list = new ArrayList<Map>();
			while( rs.next() ) {
				  // 다음 줄이 없을 때까지 	반복한다
				         // 컬럼명 넣기
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
			    Date hireDate = rs.getDate("hiredate");
			    System.out.println("----------------");
			    System.out.println("empno:" + empno );
			    System.out.println("ename:" + ename );
			    System.out.println("hiredate:" + hireDate );
			    
			    
			    
			    Map map = new HashMap();
			    map.put("empno", empno);
			    map.put("ename", ename);
			    map.put("hiredate", hireDate);
			    map.put("hehe", 123);
			    
			    
			    EmpDTO empDTO = new EmpDTO();
			    empDTO.setEmpno(empno);
			    empDTO.setEname(ename);
			    empDTO.setHireDate(hireDate);
			    
			    
			    
			    
			    
			    list.add((Map) empDTO);
//			    list.add(map);
			}
			
			
			
			// View 
			
			
			
			
			
			
			
			
			
			
			
			
			// 커넥션풀로 반환
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		response.getWriter()
		.println("<table border=1>"
				
				+ "<tr>"
				+ "<td>" + "테스트1" + "</td>"
				+ "<td>" + "테스트2" + "</td>"
				+ "<td>" + "테스트3" + "</td>"
				+ "</tr>"
				
				+ "<tr>"
				+ "<td>" + "테스트1" + "</td>"
				+ "<td>" + "테스트2" + "</td>"
				+ "<td>" + "테스트3" + "</td>"
				+ "</tr>"
				
				+ "</table>");
	}

	

}
