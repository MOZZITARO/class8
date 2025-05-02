package sec01.exam01;

public class Array {

//	int[] a = new int[3];
//	Array() {
//		
//		
//		
//		System.out.println(a.length);

//		a.length  = 5;
	// 길이 변경 불가 (final)
//	}

	final int length;
	// 고정된 수의 변수
//
//	int x;
//	int index;
	int[] arr;
	int cursor = 0;
	// 배열 값 치환

	
	
	Array(int length) {
		this.length = length; 
		arr = new int[length];
		              // 배열 응용
	}

	
	
	
	void add(int x) {

//	this.x = index;
                      // 배열 index가 임의숫자보다 높을수 없음
		if (cursor > this.length) {

			System.out.println("에러 문구 출력");
		}

		arr[cursor] = x;
		cursor++; // 1씩 상승

		// add에 값을 넣음
		// 현재 index에 추가
		// 배열 목차에 넣음
		
		
		
		
		// index 이상이면
		// index > get 메소드의 매개변수.
		// "에러 문구 출력"

	}

	
	
	
	
	
	int get(int index) {

		if (index < this.length) {
			return arr[index];
			

		} else {
			
			
			System.out.println("범위를 초과했습니다");
			
		}

	

//    	  int[] b = new int[3];
//        b[0] = 100;
//        b[1] = 200;
//        
//        System.out.println(b[0]);

		return index;
	}

	
	
	
	
	
	
}

