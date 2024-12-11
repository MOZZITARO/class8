package quiz;

public class FlimExam {

	public static void main(String[] args) {       //new Flim()이 안됨
			Flim Flims = new Flim();
		    Flims.discount(15000, 10);
		    
		    
		    Flim Comboes = new Flim(); // 생성자 옆에 리턴값있으면 돌려주고 아니면 말기
		    Comboes.combo(5000); // 생성자 안에서 선언할 수 없음
		    
	}
	
}