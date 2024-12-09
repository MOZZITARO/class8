package sec04.exam04.overload;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 클래스
		CalC calc = new CalC();
		calc.execute();
		
		//메소드 리턴 사용은 자유
		calc.plus(1,2); // 변수에 담지 않아서 청소됨 다음줄
		
		
		
	}

}
