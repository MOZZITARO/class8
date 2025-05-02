package kr.or.human6.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import kr.or.human6.dto.Comdto;
import kr.or.human6.dto.Prodto;
import kr.or.human6.dto.Querydto;




@Repository
public class ChartdaoImpl implements Chartdao{
	
	  
	
	@Autowired
	SqlSession sqlSession;
	
	
	
	
	
	
	
	// 전체조회
	@Override
	public 	List<Querydto> chsel(int postid){
		
		
	List<Querydto> chsel = sqlSession.selectList("mapper.chart.chartsel", postid);
    System.out.println("차트조회 : " + chsel);
    return chsel;
		
	}
	
	
	
	
	
}
