package quiz;

import java.util.Scanner;

public class CoffeeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("메뉴를 고르세요");
		System.out.println("1.아메리카노, 2.라떼, 3.기타메뉴, 4.종료");
		Scanner scan = new Scanner(System.in);
		int coffee = scan.nextInt();
		// 타입일치
		
		
//		while문 = 조건에 여하에 따라 반복
//		for문 = 숫자를 반복하게 해줌
//		if문 = 선택하고 끝남
//		조건이 참이면 계속 반복
//		4인경우 종료
		while(true)	{
			 
	    	
	    	
			if(coffee == 1) {
			System.out.println("1.ICE 2.HOT");
		} else if (coffee == 2) {
			System.out.println("1.ICE 2.HOT");
		} else if (coffee == 3) {
			System.out.println("1.아인슈페너 2.에스프레소");
		}  else if(coffee == 4) {
			System.out.println("종료");
			System.out.println("다음에 또 오세요");
			break;
		}	
	
			
			System.out.println("메뉴를 고르세요");
		    System.out.println("1.아메리카노, 2.라떼, 3.기타메뉴, 4.종료");
	    	coffee = scan.nextInt(); 
	    
    	}
			
			
			
			
			
			
     	
//     	switch(coffee){
//    	case 1:
//    		System.out.println("1.ICE 2.HOT");
//    		break;
//    	case 2:
//    		System.out.println("1.ICE 2.HOT");
//    		break;
//    	case 3: 
//    		System.out.println("1.아인슈페너 2.에스프레소");
//    		break;
//    	case 4:
//    		System.out.println("주문이 종료되었습니다");
//    		System.out.println("다음에 또 오세요!");
//    		break;
//    	} 
//		
//	} 	System.out.println("주문이 종료되었습니다");
	
	}

}
	

