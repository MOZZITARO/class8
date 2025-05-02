package kr.or.human.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.dao.MemberDAO;
import kr.or.human.dao.MemberDAOImpl;
import kr.or.human.dao.MemberDAOImpl2;

@Service // @componant의 일종
public class MemberServiceImpl implements MemberService{
	
	MemberServiceImpl() {
		
		System.out.println("MemberServiceImpl 생성자 실행");
	}
	
	
	
	
	
	// IoC
	// Inversion of Control
	// 제어의 역전
	// 타입에 맞는 클래스를 찾아서 대신 생성해줌
	// 등록된 모든 bean을 찾음
	// 정확히 동일한 클래스 또는 자동 형변환되는 클래스
	
	// DI
	// Dependency Injection
	// 의존성 주입
	// IoC로 생성한 클래스를 변수에 넣어준다
	// @Autowired의 대상 Bean의 후보가 두 개 이상이라면 
	// 1. @qualifier(bean id)에 해당하는 객체 찾기
	// 2. @Primary 객체 찾기
	// 3. 둘 다 없으면 변수명과 bean id가 같은것 찾기
	
	@Autowired
	@Qualifier("memberDAOImpl")
	// Bean ID지정
	// 지정하지 않으면 클래스 이름의 앞글자 소문자
	MemberDAO memberDAO;
    // @Autowired, @Resource, @Inject 비슷비슷하게 Ioc, DI를 해줌
	
	
	
	
	@Override
	public List getList() {
		
//		MemberDAO memberDAO = new MemberDAOImpl2();
		List list = memberDAO.selectList();
		
		
		return list;
	}

}
