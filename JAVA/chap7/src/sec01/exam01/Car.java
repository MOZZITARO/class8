package sec01.exam01;

public class Car {
	
	
	String model;
	int speed;
	

	
	Car(String model) {
		this.model  = model;
		// 필드임을 가리킴
	}
	
	
	// 메소드명 : printModel
	// 전달인자 : 없음
	// 리턴타입 : 없음
	// 필드의 model을 출력
	
	void printModel () {
		
		System.out.println(model);
		
		
	}
	
	
}
