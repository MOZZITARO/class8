package quiz;

public class MovieExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		     // 메소드(원할때) >>>>>>>>>>>>>>>>> 생성자(특별한 메소드) _ 생성할때 무조건 실행시킴
//		     new Movie("무파사"); // 제목을 넣어야 생성되게
		//객체는 한번만 만들어도됨
			 Movie Flims = new Movie("무파사",2025); // 객체 생성시 값 넣어야
			 
			 // 변수는 고정 //값을 넣는가 안 넣는가
			 Flims.movies("무파사",2025); // 메소드 값 입력시
//			 System.out.println(Flims.movies("무파사",2025)); 
			 // 리턴 값이 없으면 메소드를 끌고 올수 없음 // 다시 참고
			 System.out.println(Flims.title); // 다른 변수를 끌고 올 수 있음
			 // 리턴값대신 변수를 끌고 와야함
			 
			 // 필드명 바꾸기
			 Flims.title = "여인의 음모";
			 System.out.println(Flims.title);
			 
			 Flims.print();
		}
	
	
	
	
	

}
