package sec01.exam03.override;

public class Phone {

	
	
	
	
	boolean power;
	void call(String number) {
		System.out.println(number + "로 전화 거는중....");
	}
	
	
	void onOff() {
		
//		if(this.power) {
//			this.power = false;
//		} else {
//			this.power = true;
//		}
		
		this.power = !this.power;
		
		
	}
	
	
	
	
}
