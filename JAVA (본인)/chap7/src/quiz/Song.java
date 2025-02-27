package quiz;

public class Song {

	
	
	
	
	
	/**
	 * 
	 * title 변경 메소드
	 * setTitle
	 * 
	 * @param
	 * @return
	 */
	
	// String 비교는  == 
	// this 빼도 무방
//	String setTitle (String title){
//		if (title.equals(null)) {
//			System.out.println(this.title = "뀨뀨");
//		} 	
//		String filter = this.title; 
//	    return filter;	
//	    }
//	
	
	String title; //제목
	String singer; //가수명
	int like; // 좋아요
	
     void setTitle(String t) {
        title = t;
        return; //필드의 내용을 바꾸는
	} 
	
   //double 두개를 더하기 한 결과를 돌려주는 plus
	    double plus (double w, double o) {
	    	double resultt = w + o; 
	    	return resultt;
	        }
	// 클래스 생성
	// 생성자
	// 메소드
	// = 알고리즘 (일련의 과정)
	
	
	
	// 메소드 선언
	// 리턴타입 메소드명 (전달인자들) {}
}
