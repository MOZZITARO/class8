package sec01.exam01;

import java.util.Scanner;

public class Forexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		// 1씩 증가하는것을 5번
		sum = sum + 1;
		sum = sum + 1;	
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum : "+ sum);
		// 1~n까지의 합
		// n*(n+1) / 2
		
		sum = sum + 1;
		sum = sum + 2;	
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : "+ sum);
		
		/* 반복문을 만드는 원리
		 * 
		 *   1. 반복 되는 것 찾기
		 *    Ctrl + c, v 했을 때 바뀌지 않는 것
		 *    
		 *   2. 반복되지 않는 것 찾기
		 *   규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있음
		 *   변수를 활용해서 더이상 바뀌지 않게 만들기
		 *    
		 *   3. 시작 조건
		 *   
		 *   4. 종료 조건
		 *   
		 *   for : 반복 횟수를 아는 경우
		 *   while : 반복 횟수를 모르는 경우
		 *   
		 */
		
	
	   
		
		
//		 int e = 1;
			int sum2 = 0;
			// e가 1부터 시작해서 5이전까지
			for(int e = 1; /*1*/ e <= 5;/*2*/ e++) {
				sum2 = sum2 + e /*3*/; 
			}
			System.out.println("sum2 : "+ sum2); 
			
			
			
//			int sum = 3;
			// e가 1부터 시작해서 5이전까지
			for(int e = 1; /*1*/ e <= 5;/*2*/ e++) {
				sum2 = sum2 + e /*3*/;
			}
			System.out.println("sum2 : "+ sum2);   
			
		
		
		
		
		
			/* 반복문을 만드는 원리
			 * 
			 *   1. 반복 되는 것 찾기
			 *    Ctrl + c, v 했을 때 바뀌지 않는 것
			 *    
			 *   2. 반복되지 않는 것 찾기
			 *   규칙(패턴)을 찾을 수 있으면 반복문으로 만들 수 있음
			 *   !
			 *   변수를 활용해서 더이상 바뀌지 않게 만들기
			 *    
			 *   3. 시작 조건
			 *   
			 *   4. 종료 조건
			 *   
			 *   for : 반복 횟수를 아는 경우
			 *   while : 반복 횟수를 모르는 경우
			 *   
			 */
		
		
		
		
		
		

		//1부터 10까지 더하기 만들기
/*		int S = 1;
			
		for(int i=1; i<=10; i++) {
			
			sum = i; 
			System.out.println(sum);   */
			
		/* 1 */	
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			
			/* 2 */		 
			int i2 = 1;
			System.out.println(i2);
			
			i2 = i2 + 1;
			System.out.println(i2);
			
			i2 = i2 + 1;
			System.out.println(i2);
			
			
			
			
			/* 1부터 100까지의 합 */
			System.out.println(1);
			System.out.println(1+2);
			System.out.println(1+2+3);
			System.out.println(1+2+3+4);
			System.out.println(15);
			
			
			int rep = 1;
			int rep2 = 2;
			System.out.println(rep);
			
			rep = rep + rep2;
			System.out.println(rep);
		
			rep2 = rep2 + 1;
			rep = rep + rep2;
			System.out.println(rep);

			rep2 = rep2 + 1;
			rep = rep + rep2;
			System.out.println(rep);
			
			rep2 = rep2 + 1;
			rep = rep + rep2;
			System.out.println(rep);
			
			
			for(rep = 1; rep <= 100; rep = rep + rep2) {
				
//		증감식	rep2 = rep2 + 1;
				
				System.out.println(rep);
				
			}
				
		
			// 10 ~ 1까지 출력하시오
		         System.out.println(10-1);
		         System.out.println(10-2);
		         System.out.println(10-3);
		         System.out.println(10-4);
		         System.out.println(10-5);
		         System.out.println(10-6);
		         System.out.println(10-7);
		         System.out.println(10-8);
//		         System.out.println(10-9); 패턴찾기/
		         
				 int down = 10; //실행식 (시작)
				 System.out.println(down);
				 down = down - 1; // 증감식 down--;
				 System.out.println(down);
			     down = down - 1;
			     System.out.println(down);		
			     
//			     조건문 (제한)
			    for(int down2 = 10; down2 >= 1; down2 = down2 - 1 ) {
			    	System.out.println(down2);
			    }
			    	
			    	// 1 ~ 20 짝수만
			    	 System.out.println(2+2);
			         System.out.println(2+4);
			         System.out.println(2+6);
			         System.out.println(2+8);
			    	
			    	 //실행문
			         int even = 2;
			    	 even = even + 2;
			    	 System.out.println(even);
			    	 even = even + 2;
			    	 System.out.println(even);
			         
			         
			         //조건문
			         
			    	 //for(int even3 = 2; even3 <= 20; even= even3 + 2) {
			         
			    		 //System.out.println(even);
			    	 
System.out.println("-----------------");
			         //1
			    	 for(int even3 = 2; even3 <= 20; even3= even3 + 2) {
			         
			    		 System.out.println(even3); }
			    		 
			    		 
			    		 for(int qqq2=1; qqq2<=20; qqq2++)
			    			 if(qqq2 % 2 == 0 ) {
			    				 System.out.println(qqq2);
			    			 }                              // 홀짝 판별기(중요)
			    		 
			    		 
			    		 
			    		
			    
			    //2
			int thirdx = 3;
			thirdx = thirdx + 3;
			 System.out.println(thirdx);
			 thirdx = thirdx + 3;
			 System.out.println(thirdx);
			 
			 
			 for(int thirdxx = 3; thirdxx <= 20; thirdxx = thirdxx + 3) {
				           
				 System.out.println(thirdxx);
			 }
			 
			 //3
			 int odd = 1;
			 odd = odd + 2;
			 System.out.println(odd);
			 
			 for(int odd2 = 1; odd2 <= 5; odd2 = odd2 + 2) {
			 
				 System.out.println(odd2+ ": 홀수");
				 System.out.println((odd2 + 1)+ ": 짝수"); }
			 
			 
			 		 
			 for(int q3 = 1; q3 <=5; q3++) {
				 if(q3 % 2 == 0) {
					 System.out.println(q3+ ": 짝수");
				 }
				 else { 
					 System.out.println(q3+ ": 홀수");
				 }
				 
				 
				 
				 
				 
			 }
			 
		
			
				 
				 
				// 1. 1 ~ 20 까지 짝수만 출력하시오
			        // 2. 1 ~ 20 까지 3의 배수만 출력하시오
			        // 3. 1 ~ 5 까지 모두 출력하면서 홀/짝
			        //        1 : 홀수
			        //        2 : 짝수
			        // 4, 1~20까지 홀수의 합
			        // 5. 1~20까지 홀수의 개수
			        // 6. 1~10까지 옆으로 3개씩 출력
			        //        1 2 3
			        //        4 5 6
			        //        7 8 9
			        //        10
			        // 구구단 2단 출력
			        //        2 x 1 = 2
			        //        2 x 2 = 4
				 
				 
			
				 
			 
				//4 
			 int sums = 0; // 선 변수 설정
		     
			 for(int even2 = 1; even2 <= 20; even2++){
				 sums += even2; // 덮어쓰기
				  }
			 
			 System.out.println(sums); // 밖으로 빼기
				 
			 
             // 선 변수 설정
			 int sumss = 0;
			 for(int even2 = 1; even2 <= 20; even2++){
				 if(even2 % 2 == 1) {
			     System.out.println(even2);
				 sums += even2; // 덮어쓰기
				  }
			 
			 System.out.println(sumss);
			 
			 
			 
			
					 
			 
			 
			 //5
			 for(int even66 = 1; even66 <= 20; even66 = even66 + 2){
				 System.out.println(even66); }
			 
			 
			 
			 int summ = 0;
			 for(int even77 = 1; even77 <=20; even77++) {
				 if(even77 % 2 == 1) {
					 System.out.println(summ + ": 짝수");
					 summ += 1; 
				 }
				 System.out.println(summ);
			 }
			       
			 	
				
			 System.out.println("-----------------");
			 
			//6 
			 int qq6 = 1;
			 int qqq6 = 2;
			 System.out.println("2 x " + qq6 +" = "+(2 * qq6));
				 
			 
			 
			 
			 
			 
			 
			 
			 System.out.println("-----------------");
			//1부터 n까지 짝수의 합 구하기
			 
			// int n = scan.nextInt();
	/*		 int n =
			  
			 int sum99 = 0;
			 for (int even88 = 1; even88 <= n; even88++) {
				// if(even88 % 2 == 0) {
					// System.out.println(even88 + ": 짝수");
					 sum99 += even88;
				 }
			 
			 
			 
			 
			 
			 
			 System.out.println(n + sum99); */ 
			 // 이중포문
			 
		 /*   for(int q = 1; q <= 3; q++) {
		    	 System.out.print("2 x " + q + " = " + (2*q));} */
		    	 
		/*    	 for(int q2 = 2; q2 <= 9; q2++) {
			    	 System.out.println("2 x" + q2 + " = " + (3*q2)); */
		    	 // 2 x [2] = [4]
			    	 // 2 x [3] = [6]
			    	// 2 x [4] = [8]
			    	 
			    	 
			 /*   	 for(int dan = 2; dan <= 9; dan++) {
			    		 
				    	 System.out.println("---" + dan + "단--");
				    	 
				    	 for(int q5 = 1; q5 <= 9; q5++) {
					    	 System.out.print(dan +"x"+ q5 +" = "+ (dan*q5)+" "); 
				    	 } // 띄어쓰기 - "(스페이스바)"
				    	 // 줄바꿈 - System.lineSeparator(), /n     */
				    	
					    	  
			    	 }
				    	
				    	
				    	 
				    	 
				    	 // 2단 이후 띄어쓰기 / 3단 이후 띄어쓰기
				    	    
			    	 
					    	 
				    	 // 2 x [2] = [4] 
		    	
			     	 
			    	 
			    	 
			    	 
		     

		    	 
		     // 
			 System.out.println("-----------------");
			 
		//	 for(int dan2 = 2; dan2 <= 9; dan2++) // 2는 3에서 +1씩 반복된다
				 
	    		 
		    /*	 System.out.println("---" + dan2 + "단--"); */
		    	 
		    //	 for(int q6 = 1; q6 <= 1; q6++) { // 1은 1번 반복된다
			    //	 System.out.print(dan2 +"x"+ q6 +" = "+ (dan2*q6)+" "); 
			    	 
			    	 
			    	 
			    	// 2단옆에 3단을 나란히 놔야함
			    	//2번째 줄부터 반복되던 1이 2로 바뀐다
			//    	 for(int q0 = 2; q0 <= 2; q0++)
			    //	 System.out.print(dan2 +"x"+ q0 +" = "+ (dan2*q0)+" "); 
					 
					 for(int dan2 = 2; dan2 <= 9; dan2++) // 2는 3에서 +1씩 반복된다
					 {
		    		 
			    	// System.out.print("---" + dan2 + "단--"); 
			    	 
			    	 for(int q6 = 1; q6 <= 1; q6++) {
			    		 
			    		                      {
			    	    	  
			    	      }
			    		 // 1은 1번 반복된다
				    	 System.out.println(dan2 +"x"+ q6 +" = "+ (dan2*q6)+" "); 
				    	 
				    	 } 
				   // 	 for(int dan3 = 2; dan3 <= 9; dan3++) // 2는 3에서 +1씩 반복된다
						 {
			    		 
				    	// System.out.print("---" + dan2 + "단--"); 
				    	 
				    //	 for(int q7 = 1; q7 <= 9; q7++) { // 1은 1번 반복된다
					    //	 System.out.println(dan3 +"x"+ q7 +" = "+ (dan3*q7)+" ");
				    	 // ㄴ 내려가는것은 q6
				  // 	 for(int q7 = 3; q7 <= 3; q7++) { // 2는 1번 반복된다
				//	   	 System.out.print(q7 +"x"+ q6 +" = "+ (q6*q7)+" "); 
					    	 // 2~9 * 2임. 이것만 밑으로 내려가게 해야.
		    	 }  // 2 x [3] = 2 * [3]
			    	 // 새 이중포문을 쓸 경우 그냥 밑에 새로 생김

						 System.out.println("-----------------");
						 
						 // 정답
						 System.out.println("2x1=2 3x1=3");
						 System.out.println("2x2=4 3x2=6");
						 
						 System.out.println("-----------------");
						 int k = 1;
						 int m = 2;
						 int m2 = 3;
						 m2 = m + 1;
						// System.out.println(m + "x" + k + "=" + (m*k)+" " +m2 + "x"+ k +"=" + (m2*k) +"");
						 
						 //2, 3단 출력
						 // 시작 1 
						 // 종료 9
						 for(int k2=1; k2<=9; k2++) {
							 System.out.println(m + "x" + k2 + "=" + (m*k2)+ " " +(m+1) + "x"+ k2 + "=" + ((m+1)*k2) +""); 
						 }
						 
						 
				    	 }
//					 for(int dan2 = 2; dan2 <= 9; dan2++) // 2는 3에서 +1씩 반복된다
					 
		    		 
					    /*	 System.out.println("---" + dan2 + "단--"); */
					    	 
					    //	 for(int q6 = 1; q6 <= 1; q6++) { // 1은 1번 반복된다
						    //	 System.out.print(dan2 +"x"+ q6 +" = "+ (dan2*q6)+" ");
					 
					 
					 
					 
					
					 System.out.println("------------25----");
					 
					 
					 
					 
				 	 String star2 = "★"; {
					 
					 for(int stars=1 ; stars <= 5; stars = stars + 1){
						 
						 System.out.print(star2); }
					 
					 
			
				 	 }
	}
					 
		
				//	 }
					 
                              
                     
					 
					 
					 
			 	/*	 System.out.println("★★★★★");
					 System.out.println("★★★★★");
					 System.out.println("★★★★★");
					 System.out.println("");
					 System.out.println("-----------------"); */
	 
	
	// strasss가 문자열 1자 그자체 1번에서 시작, 3번반복
	String starsss = "★"; {
     
	 for(int starss =1 ; starss <= 3; starss = starss + 1){
		                                        
		 System.out.println(starsss);{
			 
		 } 
	 }
	 
	 for(int inty=1; inty<=5; inty++) {
			System.out.println(inty); {
				for(int intyy=1; intyy <= inty; inty++) {
					System.out.println(intyy);
				}
			}
		}
	}

	}
					
 	/* String star = "★ "; {
					 
					 for(int stars=1 ; stars <= 5; stars = stars + 1){
						 
						 System.out.print(star); 
					 
					 } */
					 
					 
					 
					 
				/*	 String star = "★";
					 String starz = "★★"; 
					 String starzz = "★★★";
					 String starzzz = "★★★★";
					 String starzzzz = "★★★★★"; */
				
					 
				/*	 System.out.println(star);
					 System.out.println(starz);
					 System.out.println(star+starz);
					 System.out.println();
					 */
						 // 내리기
						/* for(int stars=1 ; stars <= 1; stars = stars + 1){							 			
							 System.out.println(star); 
							 
							 for(int starso=2 ; starso <= 2; starso = starso + 1){							 			
								    System.out.println(starz); 
								    
								    for(int starsoo=3 ; starsoo <= 3; starsoo = starsoo + 1){							 			
									     System.out.println(starzz);
							 
									     for(int starsooo=4 ; starsooo <= 4; starsooo = starsooo + 1){							 			
										     System.out.println(starzzz);
										     
										     for(int starsoooo=5 ; starsoooo <= 5; starsoooo = starsoooo + 1){							 			
											     System.out.print(starzzzz); */
											     
	
					/* for(int stars= 1 ; stars <= 2; stars = stars 1){							 			
						 System.out.print(star);  
						 
						 
								    
					 
					// for (int numbers = 1; numbers <= 1; numbers=numbers+1)
								    
					//		 }

	
		 
	

							 
						 
						 
						
						 		 
				/*		 System.out.print("★"); 
						 System.out.print("★ + ★"); 
						 System.out.print("★ + ★★"); 
						 System.out.print("★ + ★★★"); 
						 System.out.print("★ + ★★★★");	
						 하나
						 하나 + 하나
						 하나 + 둘
						 하나 + 셋
						 하나 + 넷  */
						 



						 
						 
						 
						 


						 
	

					 
	
	



	
	
	 
		    

	

		     
	 
	 
	 
	

		    
			 
	
			 
	


