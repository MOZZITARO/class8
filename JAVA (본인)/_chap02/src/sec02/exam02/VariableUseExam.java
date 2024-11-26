package sec02.exam02;

public class VariableUseExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hour = 3;
		int minute = 5;
		System.out.println(hour + " 시간 " + minute + " 분 ");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println(totalMinute);	
		
		int totalSec = totalMinute * 60;
		System.out.println(totalSec);
		
		int x = 10;
		int y = 20;
		System.out.println("x의 값 : "+ x);
		System.out.println("x+y의 값 :"+ (x+y));
		

	    x = y; // y의 값이 x로
	    System.out.println("x의 값 : "+ x);
	    
	    // System.out.println( j );
	    int j = 1;
	    System.out.println("j "+ j);
	}
	
	{// 변수는 {가 사라지면 없는것 
		int i = 0;
		System.out.println("i : "+ i);
		
		// 중괄호 안에서 같은 변수명으로 또 선언은 안된다
		/* int i = 10;
		int j = 100; */
		i = 100;
		j = 10;
	}
	//System.out.println("i : "+ i);
	//i는 이미 사라진 상태
	//i는 다시 선언 가능
	int i = 100;
}
