package quiz;

public class SongExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//음원을 관리하는 song클래스를 제작
		//제목과 가수명을 넣고
		//제목, 가수명, 좋아요수 출력
	    
		Song song2 = new Song();
		
		song2.title= "APT";
		System.out.println(song2.title); //출력해야함
		song2.singer= "Jenny & 브루노마스";
		song2.like = 185169;
		
	    
			
//		SongExam names = new SongExam();
//		names.setTitle(null);
//			
			
		Song pluss = new Song();
		pluss.plus(7.5, 3.5);
		
		
	}

}
