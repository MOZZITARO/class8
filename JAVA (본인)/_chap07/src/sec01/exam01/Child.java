package sec01.exam01;

public class Child extends Parents {

	
	
	
		int age;
	    // 부모 필드 가리기
	    // overshadow
	    String name = "Child의 name";
	    
	    
	    
	    
		
		// 상속 받았을때 기본 생성자
		// new 시 실행
		Child () {
		// 맨 윗줄(상속에선 그냥 안됨)
//		this(2);
//		System.out.println();
		
//		super(); // 생략가능 // 기본
		super(1); // 생략불가능
		// this와 같이 못씀
		System.out.println("Child 생성자 실행");
		

		}
	
	
	
		
		
		
		
		// 새 이름 문제
	Child (String a) {
		
		super(a);
		// 클래스(a)
		
	}
	
	
	
	
	
	
	
	
	
	void printName() {
		
		
		String pName = getName();
        System.out.println("pName:" + pName);
		System.out.println("name: " + name);
        System.out.println("this.name:" + this.name);
        
        
        
		
		
	}
	
	
	
	
	
	
	
	
	
	
	// 전달인자가 필드를 가리는 현상
    // shadow
    void setName (String name) {
    	
    	this.name = name; // 내 필드
    	
    }
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    //*
    // 골라받을수 없음
    String parentName () {
    	
    	String name = null; // 지역변수
    	String cName = this.name; // 내 필드
    	
    	
    	//필드 (나, 부모)
    	
    	
    	
    	
    	// 1을 돌려줌 2    // 여기먼저
    	String pName = super.name; // 부모 필드
    	
    	// 2를 돌려줌
    	return pName;
    	
    } 

   
    
    
    
}
