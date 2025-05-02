package quiz;

import java.util.ArrayList;

public class Flim {

	
	
	
	String theater; // 극장명
	String movie;
	
	ArrayList flim; // 작품
	ArrayList place; // 극장명
	
	Flim() {
		
		this.flim.add("히든페이스");
		this.flim.add("1승");
		this.flim.add("위키드");
		this.flim.add("소방관");
		this.place.add("CGV");  // 배열추가
	
	}
	
	

	/**
	 * discount
	 * 
	 * @param int x int y
	 * @return discounts
	 * 
	 */ 
	
	int x;
	int y;
	// 표값 15000원 카드사 할인 10%
	int discount (int x, int y) {
//		int discounts = x / y; 
		int discounts = x / y; 
		return discounts;
	}
	
	/**
	 * discount
	 * 
	 * 
	 * @param int i
	 * @return doublecombo;
	 * 
	 */ 
	
	
	// 5000원 추가 금액 지불 시 팝콘 + 콜라
     void combo (int i) {
     
        System.out.println("팝콘" + "콜라");  
		 
	}
	
	
	
	
	 
	
	
	
}
