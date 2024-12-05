package sec01.exam01;

import java.util.ArrayList;

public class arraycopyexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1호점 판매 메뉴
String[] menu1 = new String[3];
menu1[0] = "따아";
menu1[1] = "아인슈페너";
menu1[2] = "유자스무디";
menu1[3] = "콩국수스무디";

//2호점에서 똑같은 메뉴
/* 얕은 복사
 * shallow copy, thin copy, call by reference(C언어)
 * stack영역(주소)만 복사
 * 값이 아니어서 배열이 다른 배열에 못들어감
 * 값을 변경하면 원본이 바뀜
 * 
 * 
 * 
 * */
String[] menu2 = menu1;
// 얕은 복사로 연결되어있어서
// 복사본을 바꿔도(주소값만) 공유하는 거라서
// 원본이 변경됨
menu2[2] = "바나나라떼";
System.out.print(menu1[2]); 

/* 깊은 복사
* deep copy, deep clone, call by value(C언어)
* stack영역(주소)만 복사
* 값이 아니어서 배열이 다른 배열에 못들어감
* 값을 변경하면 원본이 바뀜
* 
* */
String[] menu3 = new String[menu1.length];
for(int i=0; i<menu1.length; i++) {
	//menu[3] = menu[1];
}
menu3[2] = "연유라떼";
System.out.print(menu1[2]); 
System.out.print(menu3[2]); 

//3호점에서만 "사라다빵"을 추가로 팔고 싶다
/* 
 * 전략
 * menu3보다 크기가 1개 많은 새로운 배열을만들자
 * 앞부분은 깊은 복사
 * 마지막에 "사라다빵"을 수동으로 추가
 * 
 * 
 * 
 * 
 */
 menu3 = new String[menu3.length + 1];
 for(int i=0; i<menu1.length; i++) {
	 menu3[i] = menu1[i];
	 
	}

    menu3[menu3.length - 1] = "사라다빵";
    
    for(int i=0; i<menu3.length; i++) {
    	System.out.print(menu3[i]);
    }
    
//    //Arraylist 사용법
//    ArrayList<> list = new ArrayList();
//    //추가
//    list.add(1);
//    list.add("문자");
//    list.add(false); // 자기가 알아서 동작
//    
//    //사용
//    System.out.println(list.get(0));
//    System.out.println(list.get(1));
//    System.out.println(list.get(2));
//    
//    //사이즈
//    System.out.println(list.size());
    
    
    
    // 향상된 for문
    // for(int i=0; i<menu3.length; i++) {
    // String menu = menu3[i];
    // system.out.println(menu);
    
    for(String menu : menu3 ) {
    	System.out.println(menu);
    }
    
    
    
    //문제 5번
    //합
    //평균 : 합/ 개수
    //최대값
    
    
    
    
    }
    
    
    
	

}

