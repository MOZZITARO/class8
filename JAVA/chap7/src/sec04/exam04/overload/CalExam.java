package sec04.exam04.overload;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 클래스
		CalC calc = new CalC();
		calc.execute();
		
		//메소드 리턴 사용은 자유
		calc.plus(1,2); // 변수에 담지 않아서 청소됨 다음줄
		
		
		// 무조건 클래스명이기에 구분방법은 매개변수뿐.
		Car c1 = new Car(1300);
		Car c2 = new Car("스파크");
		Car c3 = new Car();
		c3.brand = "쉐보레";
		c3.setBrand(null);
	}

}
