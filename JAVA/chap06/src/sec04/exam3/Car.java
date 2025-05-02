package sec04.exam3;

public class Car {
	
	
	
	int gas = 5;
	//필드
	// = 멤버 변수
	// 클래스를 생성(new)과 함께 만들어짐
	// 클래스 소멸(GC 동작 전)까지 생존
	// 그 동안 메모리를 차지하면서 저장된 값이 유지됨
	// 가능하면 지역변수로 먼저 해결 (남의 꺼X)
	// 클래스 자체에 값을 저장
	// 메소드끼리 공유하는 목적
	
	int speed;
	// 값을 선언하지 않으면 
	// 0, false, null로 초기화
	
	void setSpeed(int s) {
		speed = s;
	}
	// Car speed2 = setspeed (10) {
   	
	}
	
	//메소드는 무조건 리턴을 해야함
	//단 Void는 생략가능
    void setGas(int g) {
    	gas = g;
    	// return(생략)
    	
    }
    
    //만약 주석을 단다면
    //gas의 값이 0이면 false를
    //그렇지 않으면 true를 돌려주는 함수
    boolean isLeftGas() {
    	boolean result = false;
    	if(gas==0) {
    		System.out.println("Gas가 없어요");
    		return false;  //return시 메소드 종료
//    		result = false; !
    	} else {
    		//else가 있는 if분기는 무조건
    		//하나 이상의 return보장
    		System.out.println("gas가 있습니다");
    		return true;
//    		result = true; !
    	}
//    	    return = result; !
    	
    	
//    System.out.println("gas가 있습니다");
//    return true;
    }
    boolean isLeftGas3() {
    	return gas !=0; //gas가 0일때 false
    	//0이 아닐
    }
    void run() {
    	while(true) {
    		if(gas > 0) {
    			System.out.println("주행중.. .잔량");
    			setSpeed(gas);
    		}
    	}
    }
}
