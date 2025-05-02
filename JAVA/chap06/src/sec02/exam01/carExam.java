package sec02.exam01;

public class carExam {
	
	// *메소드* 동작
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // !
		Car myCar= new Car();  // Scanner도 동일
		
		// !
		String m = myCar.model; 
		System.out.println(myCar.model);
		
		Car myCar2 = new Car();
		myCar2.model = "포르쉐";    /// myCar != myCar (형식만 동일)
		System.out.println(myCar2.model);
		
		System.out.println(myCar2.speed); // 초기값
		System.out.println(myCar2); // 값 없이 주소값만 있음
		
	}

}
