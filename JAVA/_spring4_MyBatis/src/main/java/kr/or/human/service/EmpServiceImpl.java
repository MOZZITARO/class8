package kr.or.human.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human.dao.EmpDAO;
import kr.or.human.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	
	@Autowired
	EmpDAO empDAO;
	
	
	
	
	@Override // 이걸 컨트롤러에서 불러옴
	public 	List<EmpDTO> whereEmp(EmpDTO empDTO) {
		
		
    List<EmpDTO> whdto = empDAO.whereEmp(empDTO);
    System.out.println("종새 : " + whdto);
    return whdto;
		
	}
	
	
	
	
	@Override // 이걸 컨트롤러에서 불러옴
	public 	List<EmpDTO> getEmpList() {
		
		
    List result = empDAO.selectEmpList();
    System.out.println("result : " + result);
    return result;
		
	}
	
	
	
	@Override
	public 	EmpDTO getOneEmp(){
		
		
    EmpDTO dtoone = empDAO.selectOneEmp();
    System.out.println("result : " + dtoone);
    return dtoone;
		
	}
	
	
	
	@Override
	public 	EmpDTO getEmpno(int empno){
		
		
    EmpDTO dto = empDAO.selectEmpno(empno);
    System.out.println("result : " + dto);
    return dto;
		
	}
	
	
	
	
	
	@Override
	public 	EmpDTO getEmpno2(EmpDTO empDTO){
		
		
    EmpDTO dto2 = empDAO.selectEmpno2(empDTO);
    System.out.println("mapper.emp.selectEmpno2 : " + dto2);
    return dto2;
		
	}
	
	
	
	
	
	
	
	
	
	
	// 수정 메소드
	@Override
	public 	int upEmpno(EmpDTO empDTO){
		
		
    int updto = empDAO.upEmpno(empDTO);
    System.out.println("mapper.emp.selectUpdate : " + updto);
    return updto;
		
	}

		
		
		
	// 생성 메소드
	@Override
	public 	int intEmpno(EmpDTO empDTO){
	
				
    int updto = empDAO.intEmpno(empDTO);
    System.out.println("mapper.emp.Insert : " + updto);
    return updto;
				
	}
		
	 // 삭제 메소드
	 @Override
	 public int delEmpno(EmpDTO empDTO){
			
			
	 int dldto = empDAO.delEmpno(empDTO);
	 System.out.println("mapper.emp.Delete : " + dldto);
	 return dldto;
			
		 }	

		
		
	
	
	
	
	
	
	// 조건 메소드 //searchlist
	@Override
	public 	Map<String, Object> select1Emp(EmpDTO empDTO){
						
								  
				
				
	        // 보여줄 시작. 끝 index 찾기
		    // unreachble code : 위에 끝난 코드가 있음
		    int page = empDTO.getPage();
			int viewCount = empDTO.getViewCount();
			
			int indexStart = (viewCount * (page-1)) + 1;
			int indexEnd = page * viewCount;
			
			empDTO.setIndexStart(indexStart);
			empDTO.setIndexEnd(indexEnd);
			
			
			
			
			
			// 한 페이지의 내용만 있는 리스트
			List list = empDAO.select1Emp(empDTO);
		    System.out.println("mapper.emp.select1Emp : " + list);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    // 전체 글 개수
		    int total = empDAO.totalList();
		    
		    Map<String, Object> map = new HashMap();
		    System.out.println("지도 :" + map);
		    map.put("list", list);
		    map.put("total", total);
		    
		    
		    
		    
		    
		    return map;
			
	   }
		
			
			
			
			
	
		
		
		
}
