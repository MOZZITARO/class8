package sec02.exam01;

public class AnimalExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		Cat cat = new Cat();
		Animal a1 = (Animal) cat; //메소드에 강제로 들어가기
		// Anima al = cat;
		feed(a1);
		// 줄여쓰기 
	    // feed(new Cat());
		
		
		
		
		
		
		Animal a2 = (Animal) new Dog();
		feed(a2);
		
		
	}
	
	
	
	
	
	
	       // 주소를 갖고있는 변수명
		static void feed(Animal animal) {
			
			
			
			animal.eat();
			animal.sound();
			
			
		}
			
	
	

}
