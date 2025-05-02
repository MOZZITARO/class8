package kr.or.human.service;

import java.util.List;

public class EmpService {

	
	
	
	
	public List getEmpList() {
		
		System.out.println("EmpService getEmpList 실행");
		
		EmpService empService = new EmpService();
		List list = empService.getEmpList();
		System.out.println("목록의 길이 : " + list.size());
		
		return list;
	}
	
	
	
	
	
	
	
}
