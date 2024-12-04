package sec01.exam01;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 배 열
	 * 한번에 여러 변수를 만드는 방법

	같은 타입만 선언 가능

	생성할때 전체 크기를 지정해줘야 함

	생성된 여러 변수들은 index로 관리 (0번부터 시작) */




	     //변수 앞이 무조건 타입이라고 읽는 경우
		// int [] s수는 int로 구성된 배열이다
		//int [] score; /core3; //java 스타일
		//int score2[]; //c 스타일
		
		
		
		// 배열은 참조타입
       //  score = null;
	
	
		//////////////////////////////
//		int score_0 = 90;
//		int score_1 = 60;
//		int score_2 = 70;
		    // 덩어리
		
		
		
		
		
		
	
//	배열을 생성할때 크기[3]를 알려줘야 합니다.
//	첫번째 [ ] (int[]) : int로 이루어진 배열이다
//	**두번째** [ ] (new int[3]) : 배열의 **크기**, 즉 한번에 만들 **변수의 개수**
//	타입의 크기만큼 연달아서 메모리를 할당
//	첫번째 주소를 변수에 저장
//	**index  0 부터** 시작한다
//	세번째 [ ] (intArray[0]) : 만들어진 변수 중에서 첫번째 변수를 뜻함
	
		int[] array = new int[3]; 
		// 변수 1
		// int 값
		array[0] = 90;
		array[1] = 60;
//		array[2] = 70; --- 기본값 0으로 나옴(안넣음)
		System.out.println(array[0]);
		
		// 기본값은 0, false, null로 초기화
		System.out.println(array[2]); // 방은 있는데 선언을 안해서 기본값
//		System.out.println(array[3]); //OUTOFBOUND 방이 모자름



		











//		//int [] intArray = new int[3]; // 3칸
//		intArray [0] = 90;
//		intArray [1] = 60;	
//		System.out.println(intArray [0]);
//		System.out.println(intArray [2]);  
		
		
		
		
		
		
		
		
		// 방법2
		// 넣을 값을 아는 경우 ----- ?
		int[] intArray2 = new int[] {90, 60, 70}; // 방3개 자동으로 채워짐
		
		int[] intArray23 = null; // 참조값이라 null 가능}
		intArray23 = new int[] {90, 50, 70};
		System.out.println(intArray2[2]);
		// 초기화(값을 설정)로 값을 !변경!가능 (생략불가)
		
		 


        //방법3 
        //방법2와 같으나 new int[] 해당하는 걸 생략가능
        // 선언(변수 설정)과 동시에 초기화(값 정하기) 해야만 생략가능
        int[] intArray4 = /*생략됨*/ {90, 60, 70, 22};
//        intArray4 = {90, 60, 70, 22}; 불가능
        // 선언            //초기화
        // 선언 필수
        System.out.println(intArray4.length); 
        
	}
	
	

}


		

		
		
		
		
		
//		// 배열 길이
//		String[] sArr = new String[14];
//		sArr[0] = "이름1";
//		sArr[1] = "이름2";
//		
//		int k = 1;   
		
		
//		sArr[2] = "이름3"
//		
//		K++;
//		sArr[k] = "이름"+ (k+1);
//		
//	    for(int i=0; i<14; i++) {
//	    	sArr[i] = "이름" + (i+1);
//	    	
//	    }
//	    
//	    int[i] = new int[10];
//	    int sum = 0;
//	   for(int i=1; i< i++) {
//		   System.out.println();
//	   
//	}
//
//
//	}
//}
