package kr.or.human.service;

import java.util.List;
import java.util.Map;

import kr.or.human.dto.EmpDTO;

public interface EmpService {

	
	
	public  List<EmpDTO> whereEmp(EmpDTO empDTO);
	public  List<EmpDTO> getEmpList();
	public 	EmpDTO getOneEmp();
	public 	EmpDTO getEmpno(int empno);
	public 	EmpDTO getEmpno2(EmpDTO empDTO);  
	public 	int upEmpno(EmpDTO empDTO);
	public 	int delEmpno(EmpDTO empDTO);
	public 	int intEmpno(EmpDTO empDTO);
	public 	Map<String, Object> select1Emp(EmpDTO empDTO);
	
	
	
}
