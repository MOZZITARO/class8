package quiz;

public class Movie {

	// 클래스만 있을때
	// 생성자
	// 생성자 선언: 클래스명 (전달인자들) {}
	
	// 생성자가 없으면
	// 기본생성자: 클래스명 () {}
	
	
	
	
	
	 // 메소드
	 String movie(String A) {
  	   
  	   String flim = A;
  	   return flim;
  	   
     }
	 
	
	 //생성하지 않아도 기본 생성자 만들어지지만 값을 넣는것과 아닌것의 차이
	 // 값을 넣으려면 생성자를 따로 만들어야해?
	// 생성자 // 객체 생성시 제한
	Movie(String title, int number) {
		
		System.out.println(title);
		System.out.println(number);
		
	}
	
	
	
//	// 기본 메소드
//	public static void main(String[] args) { 
//		
//		
//	     }
	String title;
	int number;
	//리턴타입            // 입력시에
	void movies(String C, int D) {
//		  String A = "무파사";
//		  int B = 2024;		
		  title = C; // 필드에 쓴 변수인자를 입력받아 변경
		  number = D;
		  // 타자로 입력하는 방법도 사용해보자!
		  
		  
		  
	}
	
	
//	//title의 값을 바꿀수 있다
//	  void SetTitle(String Title) {
//		  this.title = Title; // 겹칠 경우
//	  }
	
	// 글로 써야함
	// *뭐할건지 알아야* 필요에 따라 리턴을 넣고 값을 넣음
	void print () {
		System.out.println(this.title); // (flim.title)
		System.out.println(this.number); // (flim.number)
	}
	
	
	
	
	
	
	
	
}
