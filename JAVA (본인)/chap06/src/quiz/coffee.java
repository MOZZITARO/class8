package quiz;

import java.util.Scanner;

public class coffee {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메뉴를 고르세요");
		System.out.println("1.아메리카노(1500), 2.라떼(2500), 3.기타메뉴, 4.종료");
		Scanner scan = new Scanner(System.in);
		int coffee = scan.nextInt();
		// 타입일치
		
		
//		while문 = 조건에 여하에 따라 반복
//		for문 = 숫자를 반복하게 해줌
//		if문 = 선택하고 끝남
//		조건이 참이면 계속 반복
//		4인경우 종료
		while(true)	{
			 
	    	
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1.아메리카노, 2.라떼, 3.기타메뉴, 4.종료");
			
			if(coffee == 1) {
			System.out.println("1.ICE 2.HOT");
			
			double detail = scan.nextInt();
			if(detail == 1) {
				System.out.println("1 디카페인(3000) 2 선택하지 않음");
			} else /* detail = 2 */{
				System.out.println("1 디카페인 2 선택하지 않음");
				
			}
			
			
			double decafein = scan.nextInt(); 
			if(decafein == 1) {
				
				System.out.println("--------------------------");
				System.out.println("디카페인 아아를 구매하셨습니다");
				System.out.println("금액은 3000원입니다");
				System.out.println("--------------------------");
				break;
				
			} else {
					System.out.println("--------------------------");
				System.out.println("아아를 구매하셨습니다");
				System.out.println("금액은 3000원입니다");
				System.out.println("--------------------------");
				break;
			}
			
			} 
		   
			
			
			
			else if (coffee == 2) {
				System.out.println("1.바닐라 라떼 2.카페라떼");
			      
			    double latte = scan.nextInt();
			    if (latte == 1) {
				System.out.println("--------------------------");
				System.out.println("바닐라 라떼를 구매하셨습니다");
				System.out.println("금액은 3500원입니다");
				System.out.println("--------------------------");
				break;
			    } else {
				System.out.println("--------------------------");
				System.out.println("카페라떼를 구매하셨습니다");
				System.out.println("금액은 2500원입니다");
				System.out.println("--------------------------");
				break;
			    }
		        }
			   
			
			
		
			
			
			
			
			else if (coffee == 3) {
			System.out.println("1.아인슈페너 2.에스프레소");
		    double other = scan.nextInt();
		    if (other == 1) {
			System.out.println("--------------------------");
			System.out.println("아인슈페너를 구매하셨습니다");
			System.out.println("금액은 4500원입니다");
			System.out.println("--------------------------");
			break;
		    } else {
			System.out.println("--------------------------");
			System.out.println("에스프레소를 구매하셨습니다");
			System.out.println("금액은 1500원입니다");
			System.out.println("--------------------------");
			break;
		    }
			}
	
	
		   
			
			
			
			
		    else if(coffee == 4) {
			System.out.println("종료");
			System.out.println("다음에 또 오세요");
			break;
		    }	
	

			System.out.println("메뉴를 고르세요");
		    System.out.println("1.아메리카노, 2.라떼, 3.기타메뉴, 4.종료");
	    	coffee = scan.nextInt(); 
    	    } 
		
		
		
}

}
		
		
		// 1.만드려는 커피의 종류 (
		 //  2. 상세 종류
		      // + 가격
		         // 선택한 내용 출력
		
		            // 처음 단계
		               // 종료
		
		
		// 입력하고 싶으면 스캐너를 만들어야함
		// 새로 만든다 - 객체
		// 실행문을 썼으면 변수에 저장해야함(필수)
//		Scanner scan = new Scanner(System.in);
//		int coffee = scan.nextInt();
		// 타입일치
		
		
//		//while문 = 조건에 여하에 따라 반복
//		//for문 = 숫자를 반복하게 해줌
//		//if문 = 선택하고 끝남
//		//조건이 참이면 계속 반복
//		//4인경우 종료
//		while(coffee != 4) {
//		if(coffee == 1) {
//			System.out.println("아메리카노 나왔습니다");
//		} else if (coffee == 2) {
//			System.out.println("라떼 나왔습니다");
//		} else if (coffee == 3) {
//			System.out.println("에스프레소 나왔습니다");
//		} else {
//			System.out.println("다시 골라주세요");
//		}
//		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1.아메리카노, 2.라떼, 3.에스프레소, 4.종료");
//		coffee = scan.nextInt();
//		
//	} 	System.out.println("주문이 종료되었습니다");
//		
//		
		// 2를 골랐을경우
//	    // 세부 내용이 나오도록
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1.아메리카노, 2.라떼, 3.기타, 4.종료");
//		Scanner scan = new Scanner(System.in);
//		int coffee = scan.nextInt();
//		
//	do {
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1.아메리카노, 2.라떼, 3.기타, 4.종료");
//     	coffee = scan.nextInt();
	// 1번을 고르면 다음 내용이 나오게 하고 싶다.
	
		
//	} while(coffee != 4);
	
	
	
	
	

