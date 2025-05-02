package kr.or.human6.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.human6.dto.Comdto;
import kr.or.human6.dto.Prodto;
import kr.or.human6.dto.Querydto;


public interface Chartdao {

	
	
	
	public List<Querydto> chsel(int postid);
	
	
	
}
