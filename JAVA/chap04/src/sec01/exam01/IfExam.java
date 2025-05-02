package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Scanner scan = new Scanner(System.in);
		// int scores = scan.nextInt(); // 숫자만 필요
		int score = 93;
	
		
		if (score >= 90)  {
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
		}
		
		
		if (score < 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급 B");
			
		}
		
		
		if (!(score >= 90))  { // if(score < 90)
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
		}
		
		
		if (score >= 90)  {
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
		} else {
			System.out.println("90점 이상입니다");
			System.out.println("등급 B");
		}
		
		
		
		
		if(score >= 90) {
			System.out.println("90점 이상입니다");
			System.out.println("등급 A");
		}
		else if (score < 90 && score >= 80) {
		System.out.println("80~89점 이상입니다");
		System.out.println("등급 B");	
		}
	    else if (score < 80 && score >= 70) {
	    System.out.println("70~79점 이상입니다");
	    System.out.println("등급 C");
	    } else {
			System.out.println("70점 미만입니다");
			System.out.println("등급 B");
	    }
		
		
        // 문제 1.
			//z1이 x1과 y1 사이에 있는 지 확인 
			// *Boolean
			int x1 = 15;
			int y1 = 20;
			int z1 = 17;
			// 변수에 담아도 되고 아니어도 됨
			boolean r1 = (z1 >= x1);
			boolean r2 = (z1 <= y1);
			if(r1 && r2) {
				System.out.println(z1); }
				else { 
					System.out.println(z1 + "no");
			}
		
		    // 짝수 홀수 판별기
		    int x2 = 3;
		    if ((x2 % 2) == 0) {
		    	System.out.println(x2 + "짝수");
		    } else {
		    	System.out.println(x2 + "홀수");
		    }
			
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			// 문제 2
			/*
			 * 어제 온도가 -3도 였을때
			 * 오늘 온도(입력 받아도 됨)가 // 온도에 따라 변화
			 * 무엇을 묻는 문제??
			 * 
			 * 1. "영하"인지 "영상"인지
			 * < 0
			 *
			 * 2. 만약 영하라면 "영하 1도입니다" 
			 * 영상이라면 "영상 2도 입니다"
			 * 
			 * 3. "어제보다 온도가 높습니다"
			 * "어제보다 온도가 낮습니다" - 어제보다 오늘온도가 높은지 낮은지
			 * (단순 온도 비교)
			 * 
			 * 4. "어제보다 2도 높습니다"
			 * ex : 3, -1면 "어제보다 4도 낮습니다" 
			 * (온도차)
			 */
			int yt = -3;		// 어제 온도
			int t = 1;		// 오늘 온도
			boolean second = yt > t;
			boolean first = yt < t; //비교
			
		    int temp = t-yt; // 4도 높습니다  ----? 
		    boolean temp2 = temp > yt;
		    boolean temp3 = temp < yt;
		    
		    
		    
		    //1
		    if(t<0) {
				 System.out.println("영하");
			 } else {
				 System.out.println("영상");
			 } 
			
		    //2
		    /*       if(t <= 0) {
			System.out.println("1. 영하");
//			System.out.println("2. 영하 "+ (t * -1) +"도 입니다");
			System.out.println("2. 영하 "+ (-t) +"도 입니다");
			
		} else {
			System.out.println("1. 영상");
			System.out.println("2. 영상 "+ t +"도 입니다");
		}
		*/
		    
		    
		    // 3 *문제1아님
			// 부호는 <를 썼다면 다음은 >=로 등식을 써야한다
			/* if(first) {
				 System.out.println("어제보다 온도가 낮습니다");
			 } else if (second){
				 System.out.println("어제보다 온도가 높습니다");
			 } */
		    
		    if(first) {
				 System.out.println("어제보다 온도가 낮습니다");
			 } else {
				 System.out.println("어제보다 온도가 높습니다");
			 } 
			
		    
			
			//4
		    /* if(temp2) {
				 System.out.println("어제보다 " + ?? + "도 높습니다");
			 } else if (temp3){
				 System.out.println("어제보다 " + ?? + "도 낮습니다");
			 } */
			 
		    
		    
		    /* // 7,3 : 4 >> 7-3
		// -5, -2 : 3 >> -5 - -2 >> -5 + 2 >> -3
		// -2, 3 : 5 >> -2 - 3 >> -5
		// 3, -2 : 5 >> 3 - -2 >> 5
		int diff = yt - t;
		if(diff < 0) {
			diff = -diff;
//				diff = diff * -1;
//				diff *= -1;
		}
		
//		if(yt < t ) {
		if(diff < 0) {
			System.out.println("어제보다 온도가 높습니다");
			System.out.printf("어제보다 %d도 높습니다", diff);
		} else {
			System.out.println("어제보다 온도가 낮습니다");
			System.out.printf("어제보다 %d도 낮습니다", diff);
		}
		System.out.println(); */
			
			
			
			
		    
		    
			// 문제 3
			/*
			 * 어떤 수가 있을때
			 * 
			 * "입력한 수는 100보다 큰/작은 수이며
			 * 양수이고
			 * 홀수입니다"
			 */
		    
			//a    
			int A3 = -123;
			if (A3 > 100) {
				System.out.println(" 입력한 수는 100보다 큰 수이며 ");
			} else if (A3 < 100) {
			    System.out.println(" 입력한 수는 100보다 작은 수이며 ");
			} else {
				System.out.println(" 입력한 수는 100과 같은 수이며 ");
			}
			//b
			if(A3 >= 0) {
				System.out.println("양수이고");
			} else {
				System.out.println("음수이고");
			}	
			//c
		    if(A3 % 2 == 0) {
					System.out.println("짝수입니다");
		    } else { 
		    	
					System.out.println("홀수입니다");
		    }
		    
		    
		    
		    
			// 문제 4
			/*
			 * a, b 두 수가 있을때
			 * 둘중에 큰 값 출력
			 */
			      
			 int a = 5;
			 int b = 7; //임의의 값
			 
			boolean com = a > b;
			boolean comm = a < b;
			
			
			
			if(com) {
				System.out.println(a);
				} else {
				System.out.println(b);
				}
			
			// 값이 두개이면 else
			 
			
			
			
			
			
			// 문제 5
			/*
			 * 숫자가
			 * 1일때 "일"
			 * 2일때 "이"
			 * 
			 * 3일때 "삼"
			 * 다른 수일때 "그 외" // 숫자에 따라 변화
			 */
			 // 등호를 적극적으로 활용하자 < ,  >
			         
			
			int one = 1;  // 변수 하나만 이용해야
				 
			 //one = if 안됨
			 if(one < 2) {
				 System.out.println("일");
			 }  else if(one < 3) {
				 System.out.println("이");
			 }  else if(one < 4) {
			     System.out.println("삼");
			 }  else {
				 System.out.println("그 외");
			 }
			 
			  // 변수 하나만 이용해야(문제조건)
						 
				 
			 // = 가 아니라 ==임
			/*	 if(one == 1) {
					 System.out.println("일");
				 }  else if(one == 2 - 이 자체가 boolean) {
					 System.out.println("이");
				 }  else if(one == 3) {
				     System.out.println("삼");
				 }  else {
					 System.out.println("그 외");
				 } */
			 
			 //
			 
	       
	       
	        
	           
			
			// 문제 6
			/*
			 * 월에 따라서
			 * 4계절을 출력
			 * 봄 : 3,4,5    //다 조건: &&
			 * 
			 * 여름 : 6,7,8
			 * 가을 : 9, 10, 11
			 * 겨울 : 12, 1, 2
			 */
	         
			 /* int m = 11;
			 if (m >= 3 && m <=5) {
				 
			 }
	         
			 
			 int m = -1;
				
				if(m < 1) { m = 1; }
				if(m > 12) m = 12;
				
//				if(m < 1) 
//					if( m == -2 )
//						m = 0;
//					else	// else 어떤 if껀지 애매해 지니까
							// 가능하면 중괄호 쓰자
//						m = -1;
				
				
				if(m >= 1 && m <= 12) {
					
					if( m >= 3 && m <= 5 ) {
						System.out.println("봄");
					} else if( m >= 6 && m <= 8 ) {
						System.out.println("여름");
					} else if( m >= 9 && m <= 11 ) {
						System.out.println("가을");
					} else if( m == 12 || (m >= 1 && m <= 2)) {
//				} else if( m == 12 || m == 1 || m == 2) {
//				} else {
						System.out.println("겨울");
					}
					
				} else {
					System.out.println("정확한 월을 입력해주세요");
				}
				
				if( m >= 3 && m <= 5 ) {
					System.out.println("봄");
				} else {
					System.out.println("봄 아님");
				}
				String season = ( m >= 3 && m <= 5 ) ? "봄" : "봄 아님";
				System.out.println(season);
				System.out.println(( m >= 3 && m <= 5 ) ? "봄" : "봄 아님");
				
//				Scanner scan = new Scanner(System.in);
//				System.out.println("월을 입력하세요");
//				int month = scan.nextInt();   */
				
				
		
			 
			 
			// 수박과 볼링공
			String str1 = "수박";
		    String str2 = "볼링공";
		    
		    String str3 = str1;
		    str1 = str2;
		    str2 = str1;
		    
		    
		    
		    // 어려운 문제 2.
		    // 두 자리 정수 10의 자리와 1의 자리가 같은지 판단
		    // * 중요 - 예시를 들어야
		    
		    
		    
		    
		    
		    //주사위 추출
		    //가위바위보
		    int player = 1;
		    int npc = 1;
		    
		    // 내가 가위
		    if(player == npc) {
		    	System.out.println("비김");
		    	
		    } else if (player == 1 && npc == 3) {
		    	System.out.println("이김");
		    } else if (player == 1 && npc == 3) {
		    	System.out.println("짐");
		   
		    	// 내가 바위
			    } else if (player == 2 && npc == 1) {
			    	System.out.println("이김");
			    } else if (player == 2 && npc == 3) {
			    	System.out.println("짐");
		    		    
			    	// 내가 보
			   /* } else if (player ==  && npc == ) {
			    	System.out.println("이김");
			    } else if (player ==  && npc == ) {
			    	System.out.println("짐"); */
			    	
			    	
			    	
			    	
			    	
			    Scanner scan = new Scanner(System.in);
			    
			    
			    System.out.println((int)(Math.random()*45) + 1);
			    
			    
			    
			    
			    
			    
			    
			    //1129
			    int num = 2;
			    switch (num) {
			    case 1: 
			   	 System.out.println(("1입니다"));
			   	 break;
			    case 2: 
			        System.out.println(("2입니다"));
			        break;
			    default :
			        System.out.println(("1과 2가 아닙니다"));
			        break;
			    }
                
			    
			    int month = 11;
			    switch (month) {
			    case 1:
			    	System.out.println("겨울");
			    	break;
			    case 2:
			    	System.out.println(("겨울"));
			    	break;
			    case 9:
				    	System.out.println(("가을"));
				    	break;	
				case 10:
					    System.out.println(("가을"));
					    break;
				case 11:
						System.out.println(("가을"));
						break;
			    case 12:
					    System.out.println(("겨울"));
					    break;
			    }
			    
			    
			    
			  /*  switch (month) {
			    case 1 : 
			    case 2 : 
			    case 12 :
			    	System.out.println(("겨울"));
			    } break;
			    case 9 : 
			    case 10 :
			    case 11 :
			    	 System.out.println(("가을"));
			    	 break; */
			  
			    // 통장 잔액이 10000원
			    	 // 출금액을 입력 받아서
			    	// " 잔액이 부족합니다 "
			    	 // "얼마 출금했고 얼마 남았습니다"
			    	 // "정확히 입력해주세요"
			    	 
			    /* 10000원에서 N만큼 숫자를 빼서(출금)
			     * 잔액이 부족함 = 뺀 금액이 음수, money를 초과
			     * 뺀 금액만큼 출금하고 남은금액만큼 남았습니다.
			     * 
			     *  
			     */
			    
			    
			    
			    	 int money = 10000; //잔액
			    	 int diff = 5000; //인출금액
			    	 int account = money - diff;
			    	 // 10000 - 20000 = -10000
			    	 
			  /*  	 switch(account) {
			    	 
			    	 case -money : 
			    		 System.out.println(("잔액이 부족합니다"));
			    		 break;
			    	 case account  : 
			    		 System.out.println(("출금했고" + "남았습니다"));
			    		 break;
			    	 case - diff: 
			    		 System.out.println(("정확히 입력해주세요"));
			    		 break;
			    	 }    */
			    	 
			    	 // 잔액에서 출금액을 입력해서 음수가 떠야함
			    	 if(account < 0) {			    		
			    		 System.out.println(("잔액이 부족합니다"));
			    	 } else if(account > 0) {			    		 
			    		 System.out.println((diff + "출금했고" + account + "남았습니다"));
			    	 } else if(diff < 0){
			    		 System.out.println(("정확히 입력해주세요"));
			    	 } else {
			    		 System.out.println(("오류"));
			    	 }
			    	 
			    	 
			    	 /* if(money > diff) {			    		
			    		 System.out.println(("잔액이 부족합니다"));
			    	 } else if(diff <= money && diff >= 0) {			    		 
			    		 System.out.println((diff + "출금했고" + account + "남았습니다"));
			    	 } else if(diff < 0){
			    		 System.out.println(("정확히 입력해주세요"));
			    	 } else {
			    		 System.out.println(("오류"));
			    	 } */
			    	 
		/* money = money - diff; */
			    	 
			    	 
			    	 
			    	 
	}
		
	
		    for(int inty=1; inty<=5; inty++) {
				
				{
					//inty 1 2 3 4 5
				}
			for(int intyy=1; intyy < inty; intyy++) {
				System.out.println(inty); 
			}
	}
}
}
				
			

