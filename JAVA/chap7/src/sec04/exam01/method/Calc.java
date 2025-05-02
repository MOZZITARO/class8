package sec04.exam01.method;

public class Calc {

	boolean isOn = false; //전원, false: 꺼짐
	// 불리언 타입 : =은 진실이다.
	
	//전원을 켜는
	//isOn = true 바꿔주는
	//메소드 선언
	void powerOn() {
	//어떤 타입	
		       isOn = true; // 어떤 변수든 올 수 있음. 돌려줄 값이 없는것
		       System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		isOn = false;
		System.out.println("전원을 끕니다");
	}
	
	
	/*
	 * 더하기
	 * 입력받아 결과를 돌려줌
	 * 
	 * 메소드명 : plus
	 * 전달인자 : int, int
	 * 리턴타입 : int (두 수의 합)
	 * 
	 * @param : int x, int y
	 * @return : int
	 * @author : todair@naver.com
	 * 
	 */
	 int plus(int x, int y) {
	 
	 int result = x + y;
	 return result; 
	 }
	 
	 double minus(double x, double y) {
		 
		 double result = x / y;
		 return result; 
		 }

	 /// 모든 변수는 전달인자 가능
	
//	void poweron(매개) {}
//	int power = poweron(전달)
}
