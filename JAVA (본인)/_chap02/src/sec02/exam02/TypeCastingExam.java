package sec02.exam02;

public class TypeCastingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 작은 컵 - 큰 컵 (생략 가능)
		// 큰 컵 - 작은 컵 (생략 불가능)
		// 여기서 ()는 우선순위
		int a = 2 + (3*4);
		
		 // 1. 형변환 연산자 ()
		     long b = (long)a;
		     // int가 long보다 작으니까 형 변환해도 손해없음
		// 형 변환 연산자 생략 가능
		      long c = a;
		     
		     long d = 3000000000L;
		     int e = (int)d;
		     System.out.println("e : "+ e);
		     // long을 int로 변환하는 경우
		     // 8bite 중에서 상위 4bite만 남기기 때문에
		     // 예측하지 못한 값이 나올수 있어서
		     // [생략 불가능]
		     
		     
		     long f = 10;
		     /* 
		      * int ii = 10;
		      * long f = (long)ii;;
		      * long f = ii;
		      */
		     
		     
		     int g = 3;
		     long h = 4L;
		     
		     long i = (long)g + h;
		     long i2 = g + h ;
		    // int가 long보다 작아서 자동 long이 됨 (자동 형변환)
		    		 
		     
		     
		     
		     double j = 3.3;
		     double k = (double)g + j;
		     double k2 = g + j;
		     System.out.println("(double) g : "+  (double)g);
		     
		     int g2 = (int)j; //// double인 j가 int로 됨(생략X)
		     System.out.println("(int)j : "+  (int)j);
		     
		     
		     
		     
		     ///// 퀴즈 
		     
		     
		     
		     double total = 4.3;
		     int count = 4;
		     // total(단위 만원)은 회식비
		     // count는 참석인원입니다.
		     // 주최자가 만원 이하는 쏘기로 했습니다
		     // 1. 인당 얼마를 내야할까?
		     
		     //int서 double로 변환
		     double d_result = total / (double)count;
		     System.out.println(total / (double)count);
		     // double서 int로 변환 (한번에. 손실ㅇ)
		     int i_result2 = (int)total / count;
		     System.out.println((int)total / count);
		     
		    
		     	    
		  	// 2. 주최자는 얼마를 내야하는가? (깜짝)
		       double e2 = (total / count);
		       System.out.println(total / count);
		       int g21 = (int)total / count;
		       float h2 = (float)((e2-(double)g21)* count);
		       float f2 = (float) h2 + g21; // 생략가능
		       System.out.println(" 총 금액은" + f2 + "만원");
		       // ?
		       
		       
		       
		       
		       
		       
		      String A = "수박";
		      String B = "볼링공";
		      /* 
		      * System.out.println( A ); // "볼링공"
		      * System.out.println( B ); // "수박"
		      * 
		      */
		                
		     /* 수박을 볼링공으로 변환
		      * 볼링공을 수박으로 변환
		      */
		      
		      
		      
		      
		      
		
		      
	}

}



/* 1127 변수(종류) 선언 (=) 
// 1. 내 나이: int
 * 2. 운전면허 보유 여부 : boolean
 * 3. 우리집 스마트폰 갯수 : int
 * 4. 내 이름: string
 * 5. 소수점 까지의 온도: double
 */
