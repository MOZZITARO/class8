package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// c 변수이름
		// Child > Child 클래스 타입
		// new Child() ; Child 클래스를 생성하는 객체
		Child c = new Child();
		
		
		
		
//		c.printName();
		String cName = c.parentName();      // - ?
		System.out.println("cName:" + cName); // 지역변수
		System.out.println("c.name:" + c.name); // 필드
		
		
		
		
		
		
		
		// 3 최종
		// String에 담을 수도 있고 클래스에 담을 수도 있다(형변환)
		String pName = c.parentName();   //*
		System.out.println("정답이야:" + pName);
		
		
		
//		String eName = c.getName();
//		System.out.println("정답:" + eName);
		
		
	}
	
	
	
	
	
	
	
	
	    // 새 이름 문제
		ExtendsExam () {  
		
		
		Child c2 = new Child("새로운 이름");
		
		 
		String pName2 = c2.parentName();
		System.out.println("새로운 이름:" + pName2);
		
	
		
	    }

	
}
