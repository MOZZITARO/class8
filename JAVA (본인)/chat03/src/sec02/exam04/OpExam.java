package sec02.exam04;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean a = false; //키워드 (or true)
		System.out.println("a : "+ a);
		
		a = !a; // 위 내용 덮어쓰기 (위 내용 부정)
		System.out.println("a : "+ a);
		
		
		
		double b = 7.0;
		System.out.println(b / 3);
		
		System.out.println(b / 0);
		// double을 0으로 나누면 infinity 에러
		
		//System.out.println(3 / 0);
		//int를 0으로 나누면 by zero 에러
		
		int c = 9684321;
		int d = 5;
		System.out.println("몫 : "+ (c / d));
		System.out.println("나머지 : "+ (c % d));
		
		int money = 1000;
	    int cost = 4500;	
		/// 1000원 4500원 커피 몇잔?
		System.out.println("몫 : "+ (cost / money));
		System.out.println("나머지 : "+ (cost % money));
		
		/*
		//1. 올리브영 전품목 세일 15% (본인풀이)
				// 꿀홍차(5000)을 샀을때 얼마를 내야 하나?
				//  꿀홍차(5000)와 립스틱(30000)을 하나씩 사면?
		        double sale = 0.85;
				int honey = 5000;
				int ripstick = 30000;
				int newcost = (int) ((int)honey * sale);
				// double result = honey*1 - (honey * 0.15);
				// result = honey * (1 - 0.15);
				System.out.println(newcost);
				System.out.println(honey + ripstick) * (1 - 0.15);
				// 변수에 저장하고 컴퓨터에게 맡기기.
				
				
				// 2. 7234원이 있어요
		        // 5000, 1000, 500, 100, 50, 10, 1원
		        // 각각 최대 몇개까지로 표현할 수 있나요?
				int all = 7234;
		        int first = (all / 5000);
		        System.out.println(first);
		        
		        int thousand = (all - 5000);
		        /*int second = (thousand / 1000);
		        System.out.println(second);
		        
		        
		        int third = ( / 500);
		        System.out.println(third);
		        
		        int fourth = ( / 100);
		        System.out.println(fourth);
		        
		        int fifth = ( / 50);
		        System.out.println(fifth);
		        
		        int sixth = ( / 10);
		        System.out.println(sixth);
		        
		        int seventh = ( / 1);
		        System.out.println(seventh);*/
				
		        
		        /*
		        // 강사님 풀이
		        int money1 = 7234;
		        
		        int cnt5000 = money1 / 5000;
		        System.out.println(+ cnt5000);
		        // money1 = money1 - cnt5000;
		        // int money2 = money1 - (cnt5000 * 5000);
		        int money2 = money1 % 5000;
		        
		        int 천원 = money2 / 1000;
		        System.out.println(+ 천원);
		        money = money2 % 1000;
		        
		        int m500 = money2 / 500;
		        System.out.println(+ m500);
		        money2 = money2 % 500;
		        
		        System.out.println(+ money2); */
		
		
		
		
		
		
		        /// 숫자 <> 문자 변환
		        char c1 = 'A';
		        c1 = (char)(c1 + 1); // 유니코드
		        System.out.println(c1);		        
		        System.out.println("" + 3 + 3.0);
		        // 숫자를 문자로 바꾸는 가장 간단한 ""

		        
		        /*문자열*/ String c2 = "100";
		        int c3 = Integer.parseInt(c2);
		        //long b = Long.parseLong(c2) 
		        System.out.println(c3 + 3);
		        
		        
		        // 문자를 숫자로 바꾸는 방법
		        
		        
		        
		        // boolean
		        boolean bool = 3 > 5;
		        System.out.println(bool);
		        
		        
		        System.out.println(1 == 1);
		        System.out.println(1 == 1.0);
		        //예외
		        System.out.println(0.1 == 0.1f);
		        // 소수점 이하는 정확하지 않아서
		        // 0.1을 근사값으로 처리할수 있으므로 변환필요
		        System.out.println((float)0.1 == 0.1f);
		        
		        System.out.println('C' < 'J'); //// Error
		      //  System.out.println("ab" < "ac");
		        
		        String s1 = "최민수";
		        String s2 = "최민수";
		        System.out.println(s1 == s2);
		        // ㄴ 절대 사용 금지
		        System.out.println(s1.equals(s2));
		        System.out.println(!s1.equals(s2)); // 같지 않다.
		        // String 변수 또는 "글씨".equals(비교값)
		        
		        int i1 = 87;
		        System.out.println(i1 + "은 B학점인가?");
		        int il = 0;
				System.out.println((i1 >= 80) && (il < 90));
				// and
				System.out.println((i1 >= 80) || (il < 90));
				// or
				
				    int k1 = 7;
		            int k2 = 15;
		            int k3 = 17;
		            System.out.println("k3이 가장 큰 값인가?");
		            // k3이 k2와 k1보다 크다는 것
		            // 수정 : K3가 K1보다 크고 K3가 K2보다도 크면
		            // K3는 가장 크다.
		            System.out.println(
		            		(k3 >= k2) && (k3 >= k1));
		            
		            
		            
		            
		            // 대입 연산자 ------??
		            int m1 = 5;
		            m1 = m1 + 2;
		            m1 += 2;
		            System.out.println( m1 );
		          
		            int n1 = 10;
		            n1 = n1 + 1;
		            n1 += 1;
		            n1++; //
		            System.out.println( n1 );
		            
		            n1 = n1 - 1;
		            n1 -= 1;
		            n1--;
		            
		            int n2 = 10;
		          
		            System.out.println(+ (n2++)); // 10출력이후 11로 늘어남
		            System.out.println(+ (+n2));
		            System.out.println(+ (n2));
		            
		            System.out.println(+ (+n2)); 
		            System.out.println(+ (n2++));
		            System.out.println(+ (n2));
		            
		            int x = 1;
		            int y = 1;
		            int result1 = ++x + 10; // 1 두번 더하기
		            int result2 = y++ + 10; // +++ 나중에 쓰임
		            System.out.println(+ (result1)); 
		            System.out.println(+ (result2));
		            
		            
		            
		            
		            
		            
		            
		            
		           // 삼항 연산자
		            int score = 95;
		            char grade = (score > 90) ? 'A' : 'B';
		            System.out.println(grade);
		            
		            // 문제 5
		            // 4가 나오는 대신 5가 나오도록 수정
		            int var1 = 5;
		            int var2 = 2;
		            double var3 = (double) var1 / var2;
		            System.out.println(var3);
		            int var4 = (int)(var3 * var2);
		            System.out.println(var4);
		            
		            
		            
		            
		            //1128
		            
		            // v1 / v2의 값을 소수점 3자리 까지만 출력
		            double v1 = 1000;
		            double v2 = 457;
		            
	                // 3자리까지 정수로 건져내고 뒷자리는 버린다음 다시 소수로
		            double v3 = (v1 / v2) * 1000;
		            int v4 = (int)v3;
		            double v5 = (double)v4 / 1000;
		            
		            System.out.println(v5);
		            
		           
		            
		   

		    		int num = (int)(Math.random()*45);
		    		System.out.println(num);
		    		
		            
//		    		int rand = (int) Math.random();
//		    		double temp15 =rand*45;
//		    		int temp25 = (int)temp15;
//		    		int rotto = (int)(temp15 + 1);
		            
		            
	
	}           
	            
	                                  
}
