package sec03.exam01;

import java.util.ArrayList;

public class kimbab {

	
	
	
	
	
	/*
	 * 
	 * 김밥천국 관리 클래스
	 */
	
	String name; // 지점명
	String address; // 주소
	
//	String[] menu; //메뉴들
//	int[] price;  // 메뉴와 순서를 맞춰서 관리하는 가격
	
	ArrayList menu; // 배열 꺼내기
	ArrayList price;
	
	int seedMoney; //권리금
	
	kimbab(int seedMoney) {
		System.out.println("kimbob(int) 생성자 실행");
		this.seedMoney = seedMoney;
		
		this.menu.add("야채김밥"); ///배열
//		System.out.println(this.menu.get(0));
		// for(int i = 0; i<this.menu.size(); i++)
		this.price.add(3500);
		
		this.menu.add("라면");
//		System.out.println(this.menu.get(0));
		// for(int i = 0; i<this.menu.size(); i++)
		this.price.add(4000);
	}
	
	
	
	
	
	/*
	 * 김밥싸기
	 * 
	 * @parameter String main, String sub
	 * @return String 완성품 이름
	 * 
	 * 
	 */              // 여기에 값을 넣어
	 String makeRoll(String main, String sub) {
		 
		 System.out.println(main + "과 "+ sub + "로 김밥을 만듭니다" );
		 String result = main + "과 "+ sub + "김밥 ";
		 return result;
	 }
	 
	 
	 
	 
	 
	 
	 /*
		 * 메뉴주문
		 * 
		 * @parameter int index 메뉴번호
		 * @return Void
		 * 
		 * 
		 * 
		 */
	     void order (int index) {
	    	 String menuName = (string)this.menu.get(index)
	    			 
	    			 String result
	     }
	 
	 
	 
	 
	 
	 
	 /*
		 * 영수증 출력
		 * 
		 * @parameter int index 메뉴번호, int count 개수
		 * @return Void 
		 * 
		 * 
		 * 
		 */
	 
	 void print(int index, int count) {
		 String menuName = (String)this.menu.get(index);
		 int menuPrice = (int)this.price.get(index);
		 
		 System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-");
		 System.out.println(" 메뉴명 : " + menuName);
		 System.out.println("--------------------------");
		 System.out.println("총 금액: "+ (menuPrice*count));
		 System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-");
}
	 
	 
	 
	 
	 /*
		 * 메뉴 추가
		 * 
		 * @parameter String 메뉴명, int 가격
		 * @return Void 
		 */
	     void addMenu(String menuName, int menuPrice) {
	    	 this.menu.add(menuName);
	    	 this.price.add(menuPrice);
	    	 
	    	
	     }
	     
	     
	     
	     
	     
	 /**
	  * 전체 메뉴와 가격 확인
	  * 야채 : 3500원
	  * 라면 : 4000원
	  * @param
	  * @return void
	  */
	  void printMenu() {
		  for(int i=0; i<this.menu.size(); i++) {
			  System.out.println(this.menu.get(i) +" : ");
		  }
	  }
}
