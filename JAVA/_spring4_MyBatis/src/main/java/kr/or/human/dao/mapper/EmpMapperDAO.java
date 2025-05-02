package kr.or.human.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.or.human.dto.EmpDTO;


@Mapper //"Mapping 파일에 기재"된 SQL을 호출
public interface EmpMapperDAO {

	
	
	// 구현체 생략 (DAOimpl) *SelectOne
	
	
	
	
	             // xml의 id와 "DAO의 메소드 명"을 같게 한다
	List<EmpDTO> selectEmp();
	
	          // 간단할때는 편리함
	          // 3차 사용 지양
	@Select("select * from emp2 where = #{empno}") 
	// xml(쿼리문) 생략
	List<EmpDTO> selectDetailEmp(@Param("empno") int empno);
	
	
	
	
	
	
	
	
	
}
