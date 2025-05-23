package kr.or.human6.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import kr.or.human6.dto.Comdto;
import kr.or.human6.dto.Linkdto;
import kr.or.human6.dto.Prodto;




@Repository
public class LinkdaoImpl implements Linkdao{
	
	  
	
	@Autowired
	SqlSession sqlSession;
	
	
	
	// 생성
	@Override
	public 	int Linkint(Linkdto Linkdto) {
		
	
	System.out.println("Linkdto dto : " + Linkdto);
	int Linkint = sqlSession.insert("mapper.pro.link.Linkint", Linkdto);
    System.out.println("링크 생성 : " + Linkint);
    return Linkint;
		
	}
	
	
	
	
	// 전체조회
	@Override
	public 	List<Linkdto> Linksel(){
		
		
	List<Linkdto> Linksel = sqlSession.selectList("mapper.pro.link.Linksel");
    System.out.println("댓글전체목록조회 : " + Linksel);
    return Linksel;
		
	}
	
	
	// 하나만 조회
	@Override
	public  Linkdto Linkselid(Linkdto Linkdto){
		
		
	Linkdto Linkselid = sqlSession.selectOne("mapper.pro.link.Linkselid", Linkdto);
    System.out.println("댓글하나조회 : " + Linkselid);
    return Linkselid;
		
	}
	
	
	// 삭제 메소드
//	@Override
//	public 	int Comdel(Comdto Comdto){
//				
//	
//	
//	int Comdel = sqlSession.selectOne("mapper.pro.comment.Comdel", Comdto);
//    System.out.println("mapper.pro.comment.Comdel : " + Comdel);
//
//    return Comdel;	
//	}
	
	// 수정 메소드
	@Override
	public 	int Linkfix(Linkdto Linkdto){
				
	
	
	int Linkfix = sqlSession.update("mapper.pro.link.Linkup", Linkdto);
    System.out.println("링크수정 : " + Linkfix);

    return Linkfix;	
	}

	
}
