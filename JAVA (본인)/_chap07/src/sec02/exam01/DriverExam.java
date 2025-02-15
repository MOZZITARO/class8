package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		coupe coupe = new coupe();
		
		Driver driver = new Driver();
		
		

		           // 차가 쿠페가 되기위한 형변환
		car car = (car) coupe;
		driver.run(car);
		
		
		
	}

	
	
}
