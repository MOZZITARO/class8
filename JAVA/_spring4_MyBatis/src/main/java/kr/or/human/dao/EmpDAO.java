package kr.or.human.dao;

import java.util.List;

import kr.or.human.dto.EmpDTO;

public interface EmpDAO {
	
	
	
	
	
	public  List<EmpDTO> whereEmp(EmpDTO empDTO);
	public  List<EmpDTO> selectEmpList();
	public 	EmpDTO selectOneEmp();
	public 	EmpDTO selectEmpno(int empno);
	// 인터페이스 하나하나 넣어야
	
	public 	EmpDTO selectEmpno2(EmpDTO empDTO);  
	public 	int upEmpno(EmpDTO empDTO);
	public 	int intEmpno(EmpDTO empDTO);
	public 	int delEmpno(EmpDTO empDTO);
	public 	List<EmpDTO> select1Emp(EmpDTO empDTO);
	public 	int totalList();
}
