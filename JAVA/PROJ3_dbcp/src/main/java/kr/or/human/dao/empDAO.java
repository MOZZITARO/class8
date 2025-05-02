package kr.or.human.dao;

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
import javax.sql.DataSource;

import kr.or.human.dto.EmpDTO;

public class empDAO {

	    public List selectEmpList() {
		List resultList = new ArrayList();
		
		
		
		
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
						
						List<EmpDTO> list = new ArrayList<EmpDTO>();
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
						    
						    
						    
						    
						    
						    resultList.add(empDTO);
//						    list.add(map);
			           
			
						}
			            
						con.close();
			
			
		} catch (Exception e) {
		     e.printStackTrace();	
		}
		
	    return resultList;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
