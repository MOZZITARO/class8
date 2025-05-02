package sec02.exam01;

public class Cat extends Animal {

	
	
	int age;
	//필드는 섀도우, overriding없음
	
	
	@Override
	void sound() {
		
		System.out.println("미야옹");
	}
	
	@Override // 덮어씌우기 // 부모꺼 판단하고 가리기
void eat() {
		
		System.out.println("츄르릅");
	}
	
//  없으면 override 못씀
void push() {
	
	System.out.println("꾹꾹이");
}

	
	
	
	
	
}
