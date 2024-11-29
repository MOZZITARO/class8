package sec01.exam01;

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
			         
			    	 for(int even3 = 2; even3 <= 20; even3= even3 + 2) {
			         
			    		 System.out.println(even3);
			    		 
			    		 
			    		 
			    		 
			    		
			    }
			    
			int thirdx = 3;
			thirdx = thirdx + 3;
			 System.out.println(thirdx);
			 thirdx = thirdx + 3;
			 System.out.println(thirdx);
			 
			 
			 for(int thirdxx = 3; thirdxx <= 20; thirdxx = thirdxx + 3) {
				           
				 System.out.println(thirdxx);
			 }
			 
			 
			 int odd = 1;
			 odd = odd + 2;
			 System.out.println(odd);
			 
			 for(int odd2 = 1; odd2 <= 5; odd2 = odd2 + 2) {
			 
				 System.out.println(odd2+ ": 홀수");
				 System.out.println((odd2 + 1)+ ": 짝수"); }
			 
			 
		
			 for(int add = 1; add <= 20; add = add + 2) {
				 System.out.println(add);
				
			 }
			 
			 
			 for(in)
	}
	

}
