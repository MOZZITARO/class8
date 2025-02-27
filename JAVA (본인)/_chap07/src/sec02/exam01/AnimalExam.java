package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		// 쉬움 - 객체 생성
		// 타입 - 클래스
		Animal a1 = new Animal();
		a1.eat();
		a1.sound();
		
        // 여기에 담깁니다
		Cat cat = new Cat(); 
		Cat cat2 = new Cat();
		cat2.age = 5; // 초기화
		cat.eat();
		
		
		Dog dog = new Dog();
		Animal a4 = (Animal) new Dog();   // --- ? 형변환 
		a4.eat();
		a4.sound();
		
		
		
		
		
		
		Animal a2 = (Animal) cat; // 자식이 부모가 될 때
//		Animal a3 = cat;             // 형변환 연산자 생략 가능
		//  자식에서 부모만 빼온다
		Animal a6 = (Animal) cat; // 그래서 animal로 치환
		
		
		
		
		
		
		// 변환해야해요
        feed(a6); // 메소드 (animal)
        feed(dog);
        
        
        // 그냥 들어가요
        catMom(cat);
		
		
		
		
	}
	                    // Cat만 받아요
	static void catMom(Cat cat) {
		
		cat.eat();
		cat.sound();
		cat.push();
	}
	
	
	
	
	
	
	
	                  // animal만 받아요
    static void feed(Animal animal) {
		System.out.println("feed 실행");
		animal.eat();
		animal.sound();
		
	}

    
    
    
}
