package quiz;

public class warmerExam {

	
	
	
	public static void main(String[] args) {
	
	
	warmer feature = new warmer();
	
//	feature.ON = "up";
//	System.out.println(feature.ON);
//	feature.OFF = "down";
//	System.out.println(feature.OFF);
	feature.display(); // turnon 이전 마지막
	feature.turnon();
	feature.display();
	//변수(공통). 밖에 있는 변수, 메소드 끌어다씀
	feature.low();
	feature.turnoff();
	feature.low();  // 순서대로 출력
	
	feature.low();
	feature.high();
	
	}
	
}
