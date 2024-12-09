package sec04.exam04.overload;

public class CalC {
        int plus (int x, int y) {
        	return x+y;
        }
        
//        int plus (int x, int y) {
//        	return x+y;
//        } // int int로 오버로딩이 안됨
        
        //오버로딩
        //1. 전달인자를 신경쓰지 않고 비슷한 수행을 할 수 있게 해줌
        //2. 전달인자의 우선순위
        //2-1 정확한 타입
        //2-1 형변환 가능한 타입
        //메소드 이름이 같아도 전달인자가 다르면 사용가능
        
        
        double avg(int x, int y) {
        	double sum = plus(x,y);
        	double result = sum/2;
        	return result;
        }
        
        // 미리 선언된 메소드 위치를 따지지 않는다
        void execute() {
        	double result = avg(7,10);
        	p("평균" + result);
        	System.out.println("끝");
        }
        
        void p(String msg) {
        	System.out.println(" 결과 ");
        	System.out.println(msg);
        }
        
        void method1 (String classdept, int classnum) {
        	System.out.println(classdept + "," + classnum);
        } 
}
