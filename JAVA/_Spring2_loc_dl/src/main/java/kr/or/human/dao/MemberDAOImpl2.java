package kr.or.human.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;





@Repository // @Repository 어노테이션을 사용하면 해당 클래스가 스프링의 Bean으로 등록되어 Component Scan을 통해 자동으로 인식됩니다. 
//따라서 @Repository 어노테이션을 사용하지 않으면 직접 Bean으로 등록해줘야 합니다.
public class MemberDAOImpl2 implements MemberDAO{

	@Override
	public List selectList() {
		
		
		List list = new ArrayList();
		list.add("하나");
		list.add("둘");
		list.add("셋");
         
		return list;
	}

	
	

	
	
}
