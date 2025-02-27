package sec03.exam01;

public class Car {

	
	
	
	// 생성자
	// new 연산자로 생성
//	public Car() {
		
		
		
		// 한계점을 아는것이 중요
		String brand = "아반떼";
		String color = null;
		// color = "흰색"
		// 재할당(변수에 다시 집어넣기) 안됨
		int cc = 0;
		
		// 기본 생성자 - ()에 안써도 됨. 쓰는 순간 기본 생성자 안됨
		//클래스를 new로 생성할때
		//무조건 new로 실행
		//입구차단. Class > method
		//1. *필드 먼저* 실행
		//2. 그 후 *생성자* 실행
		Car(int c) {
			cc = c;
			color ="흰색";
			System.out.println("Car 생성"); 
			test();
			} // 메소드의 일종
			
		Car(String b) {
			this("아반떼", "흰색", 1300); // 선 실행
			brand = b;
		}
		
		
		
		
		//return값을 못써서 안에 syso를 써야함
		Car(String b, String c, int cc2) {
			brand = b;
			color = c;
			cc = cc2;
			System.out.println();
		} // new가 생성될때 한번 호출
		// 양식을 지켜야
		
		// Car() 호출
		// this();
		// 다른 생성자 호출
		// 무조건 첫번째 줄에서 호출해야함
        		
		Car(String brand, int cc) {
			
			brand = brand;
			cc = cc;
			
			int a = 10;
			
			String color = "파랑";
			System.out.println(color); //null
			System.out.println(this.color); // 필드의 color
			// this -> 필드
			// 필드명과 지역변수가 같으면 this 필요없지만 
			// 아니면 this는 지역변수에 넣는것(다를시에)
		}
		
		
		
		
		void setBrand(String brand) {
			this.brand = brand;
			// 필드명 != 변수
			// main : 자바의 유일한 자체 메소드
		}
		
			void test( ) {
				System.out.println("test() 실행");}
			
			void init() {
				brand = "아반떼";
				color = "흰색";}
				
			
			
	}
