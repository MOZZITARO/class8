package sec04.exam3;

public class CarExam {
    // main 메소드
	// 모든 것의 시작
	// java 실행 =  JVM에서 수행
	// java가 자동실행하는 유일한 메소드
	// alt ctrl 아랫방향키
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]:"  + args[i]);
		} 
		
		Car car = new Car();
		System.out.println(car.speed);
		
		car.setSpeed(200);
		System.out.println(car.speed);
			
		boolean gasState = car.isLeftGas();
		if(gasState) {
			// if(car.isLeftGas) {
			System.out.println("출발합니다");
			car.run();
		}
		
	
	}

}
