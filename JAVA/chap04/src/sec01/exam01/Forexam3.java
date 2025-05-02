package sec01.exam01;

import java.util.Scanner;

public class Forexam3 {

	   public void main(String[] args) {
	      // TODO Auto-generated method stub
	      
	      //0단계
	      
	      
	      System.out.println(0);
	         String star = "★";
	      for(int number = 1; number <= 5; number++) {
	         System.out.println(star);
	          }
	      
	      
	      
	      //1단계
	      System.out.println(1);
	      String star2 = "★";
	      // 1개부터 5번반복 1개씩
	      for(int number = 1; number <= 5; number++) {
	         System.out.print(star2);
	         
	          }
	      
	      
	      
	      //2단계
	      System.out.println(2);
	      String star3 = "★★★★★"; //" "가 하나의 문자
	      // 한 개부터 3번 반복 하나씩
	      for(int number = 1; number <= 3; number++) {
	         System.out.println(star3);
	          }
	      
	      
	      
	      
	      
	      //3단계
	      System.out.println(4);
	      String star4 = "★ ";
	      for(int number = 1; number <= 5; number++) {
	         System.out.print(star4);
	          }
	      
	      //3.5단계
	      System.out.println(3.5);
	      // (별다른 문자가 없으면) 숫자는 1부터 1개씩 5번 반복
	      
	      
	      for(int number = 1; number <= 5; number++) {
	            for(int number2 = 1; number2 < number; number2++) {
	               System.out.print(number);
	         
	      
	            } System.out.println(number);
	            
	      }
	      
	   
	   

          
	for(int inty = 1; inty <= 5; inty++) {
			for(int intyy = 1; intyy < inty; intyy++) {
				System.out.println(inty); 
			}
	            System.out.println();
	        }    
				
				/* j1 i1  결과 1
				 * j2 i 12 결
				 */
				
			
			
			//1 하나출력
	        // 2 두개 출력하고 엔터
	        // 3 세개 출력하고 엔터
	        // 4 4개 출력
	         // 5 5개출력
					
//	   System.out.println(1);
//	   System.out.println();   -------- 엔터치기
//	   
//	   System.out.println(2);
//	   System.out.println(2);
//	   System.out.println();

		
	// 주사위 두개로 나올 수 있는 모든 조합
	// 중복을 제거한 경우의 수
	
	}
	
	/*  int x = -1;
	  for (x = 1; x < 5; x++) {
		  
	  }
	   
	  System.out.println(x); // 5 (for문 거짓값)
	  
	  
	  
	  System.out.println("메뉴를 고르세요");
	  System.out.println("1:커피, 2:홍차, 0:종료");
	  
	  Scanner scan new Scanner(System.in);
	  int menu = scan.nextInt();
	  
	  
	  while(menu != 0) // 0이 아닐때까지 반복 = 1. 2 (0이면 끝)
		  // 조건 맞으면 계속 실행
	  if(menu == 1) {
		  System.out.println("커피 드릴게요");
	  } else if(menu == 2) {
		  System.out.println("홍차 드릴게요");  
	  } else {
	      System.out.println("메뉴에서 골라주세요"); }
	  
	  
	  System.out.println("메뉴에서 골라주세요");
	  System.out.println("1:커피, 2:홍차, 0:종료");
	  
}
System.out.println("다음에 또 오세요"); */
	   
	   String m = "";
	   do {
		   System.out.println("메뉴를 고르세요");
		   System.out.println("1:커피, 2:홍차, 0:종료");
		   m = scan.nextLine();
	   }
       if(m.equals("1"))  System.out.println("커피 드릴게요");
       } else if(menu == 2) {
	   System.out.println("홍차 드릴게요");  
        } else {
       System.out.println("메뉴에서 골라주세요"); }
       }
       While (!m.equlas("X"));
       


}
	

	
	

