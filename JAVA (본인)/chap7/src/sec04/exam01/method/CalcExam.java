package sec04.exam01.method;

public class CalcExam {
    
	// 전달인자 선언의 ()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Calc calc = new Calc();
		calc.powerOn (); //실행의 () != 출력
		System.out.println(calc);
	
		calc.powerOff();
		System.out.println(calc);
		
		int b = 7;
		int a = calc.plus(b, 10);
		System.out.println(a);
		
		double c = 10;
		double d = calc.minus(c, 2.5);
		int e = (int) d;
		System.out.println(e);
		
//		Calc[] f = new Calc[10];
//		d[0] = new Calc();
//		
//		Calc[] e = {new Calc(), new Calc()};
//		
//		boolean d0 = d[0].isOn;

		// 배열을 전달할때 얕은 복사에 관하여
		// 변수명 != 메소드명
		int sum1(int[] values) {
			int
		}
		
		
	}

}
