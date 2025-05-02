package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



            // bean 이름지정
@Repository("memberDAOImpl")
public class MemberDAOImpl implements MemberDAO{

	@Override // 오버라이딩
	public List selectList() {
		
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
         
		return list;
	}

	
	

	
	
}
