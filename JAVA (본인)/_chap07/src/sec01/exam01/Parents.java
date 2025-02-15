package sec01.exam01;



public class Parents {
	
	
	
	
	
	
	
	
	
	
	
	// 이걸 1
	String name = "안녕안녕";
//    String newname;
	
	
	
	
	Parents(int a) {
			
		
		
		System.out.println("Parents 생성자 실행");
	}
	
	

	
	
	
	
	
    // 1 // new할때 name넣어야
	Parents (String name) {
	
	this.name = name;
	
	
	
	}







    // 쓸때 .getName
	String getName()  {
		
		System.out.println("상속문제");
		
		// 돌려줌
		return this.name; // 필드
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
