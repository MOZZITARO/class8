package kr.or.human.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	
	@Autowired
	SqlSession sqlSession;
	
	
	
	@Override
	public 	List<EmpDTO> whereEmp(EmpDTO empDTO){
		
		
	List<EmpDTO> whdao = sqlSession.selectList("mapper.emp.dynamic.whereEmp", empDTO);
    System.out.println("DAO 종새 : " + whdao);
    return whdao;
		
    
	}
	
	
	
	
	// 전체조회
	@Override
	public 	List<EmpDTO> selectEmpList(){
		
		
	List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
    System.out.println("result : " + result);
    return result;
		
	}
	
	// 7788 조회
	@Override
	public 	EmpDTO selectOneEmp(){
		
		
    EmpDTO dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
    System.out.println("result : " + dto);
    return dto;
		
	}
	
	// 전달인자: 행 하나
	@Override
	public 	EmpDTO selectEmpno(int empno){
		
		
    EmpDTO dto = sqlSession.selectOne("mapper.emp.selectoneEmpno", empno);
    System.out.println("result : " + dto);
    return dto;
		
	}
	
	
	
	// 전달인자: 전달인자의 행 전체
	@Override
	public 	EmpDTO selectEmpno2(EmpDTO empDTO){
		
    // 동일한 empno
    EmpDTO dto = sqlSession.selectOne("mapper.emp.selectEmpno2", empDTO);
    System.out.println("mapper.emp.selectEmpno2 : " + dto);
    return dto;
		
	}
	
	
	
	    // 수정 메소드
		@Override
		public 	int upEmpno(EmpDTO empDTO){
			int modto = -1;
			
		try {	                      
	         modto = sqlSession.update("mapper.emp.selectUpdate", empDTO);
	         System.out.println("mapper.emp.selectUpdate : " + modto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	      	 return modto;
			
		}
		
		
		// 생성 메소드
		@Override
		public 	int intEmpno(EmpDTO empDTO){
		int updto = -1;					
		
		try {
			
		updto = sqlSession.insert("mapper.emp.Insert", empDTO);
		System.out.println("mapper.emp.Insert : " + updto);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return updto;
							
		}
		
		
		// 삭제 메소드
		@Override
		public 	int delEmpno(EmpDTO empDTO){
		int dldto = -1;			
		
		try {
	    dldto = sqlSession.selectOne("mapper.emp.Delete", empDTO);
	    System.out.println("mapper.emp.Delete : " + dldto);

		} catch(Exception e) {
			e.printStackTrace();
		}
	    
	    
	    
	    
	    return dldto;
				
	    
	    
	    
	    
	    
		       }
				
		
		
		
		
		
		
		// insert????
		void getSeq() {
			int seq = sqlSession.selectOne("mapper.emp.getSeq");
			
			EmpDTO dto = new EmpDTO();
			dto.setEmpno(seq);
			dto.setEname("임의");
			// insert에 보내서 테이블 a에서 seq 사용
			// insert에 보내서 테이블 b에서 seq 사용
			
		}
		
		
		
		
		
		// 페이징 포함
		// ?????
		// 페이징 + 셀렉트 메소드
		@Override
		public 	List<EmpDTO> select1Emp(EmpDTO empDTO){
									
									                        // namespace. ID
     // List<EmpDTO> updto = sqlSession.selectList("mapper.emp.dynamic.whereEmp", empDTO);
		List<EmpDTO> updto = sqlSession.selectList("mapper.emp.page.selectPageEmp", empDTO);
	    System.out.println("updto : " + updto);
	    return updto;
									
				}
		
		
		// 페이징 전체 메소드
		@Override
		public 	int totalList(){
							
									                        // namespace. ID
	   // List<EmpDTO> updto = sqlSession.selectList("mapper.emp.dynamic.whereEmp", empDTO);
		int page = sqlSession.selectOne("mapper.emp.page.totalEmp");
	    System.out.println("count(*) : " + page);
	    return page;
									
				}
				
		
//		@Override
//		public 	void doFilter(Servlet request, ServletResponse){
//							
//									                        // namespace. ID
//	   // List<EmpDTO> updto = sqlSession.selectList("mapper.emp.dynamic.whereEmp", empDTO);
//		int page = sqlSession.selectOne("mapper.emp.page.totalEmp");
//	    System.out.println("count(*) : " + page);
//	    return page;
//									
//				}
				
		
		
		
	
}
