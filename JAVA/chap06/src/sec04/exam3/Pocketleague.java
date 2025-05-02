package sec04.exam3;

public class Pocketleague {

	String name = null;
	ArrayList list = new ArrayList();
	Pokemon[] arrPokemon
	
	PokemonLeague(String name) {
	
		System.out.println(name);
		this.name = name;		
		
	}
	
	void add(Pokemon p) {
		this.list.add(p);
	}
	
	void print() {
		
		for(int i=0; i<list.size(); i++) {
			pokemon p = (pokemon)list.get(i);
		}
	}
//	Arraylist list = new Arraylist;
	
//  포켓몬 포켓몬리그 포켓몬이그잼
//  포켓몬에는 이름과 타입만 저장
//  포켓몬리그에는 포켓몬들을 저장하는 어레이리스트
//  포켓몬추가메소드 전달인자로 포켓몬을 받는다
//  포켓몬 보기메소드는 저장되어있던 이름과 타입의 정보를 모두 보여준다
//  포켓몬 메인에서 
//  일단 포켓몬 리그 생성
//  포켓몬 생성하고 이름과 타입 지정
//  포켓몬 리그에 추가
//  포켓몬 보기메소드를 실행해서 내가 추가한거 다보기
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		 
		
	}

}
