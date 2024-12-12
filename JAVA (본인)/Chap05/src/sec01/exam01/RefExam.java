//<<<<<<< HEAD
//package sec01.exam01;
//
//public class RefExam {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		
//		   int a = 10;
//		   int b = a;
//		   System.out.println(a+", "+b);
//		   b=12;
//		   System.out.println(a+", "+b); // 따로 관리
//		   
//		   String c = "채민병"; // 특별대우
//		   // =을 기준으로 오른쪽이 먼저 실행된다
//		   // "채민병"을 hip의 비어있는 번지에 할당하고 그 주소를
//		   // 스택 영역의 변수C에 번지가 기록됨 
//		   System.out.println("c : "+c);
//		   
//		   
//		   // 주소를 직접 볼 수 없음 *C언어는 가능
//		   
//		   System.out.println(a == b);
//		   // == 무조건 stack의 값을 비교한다
//		   
//		   // 무조건 힙영역의 새로운 번지에 할당하는 방법
//		   String d = new String("최민수");
//		   System.out.println(d);
//		   System.out.println(c == d);
//		   // == 무조건 stack의 값을 비교한다 (주소)
//		   System.out.println(c.equals(d));
//		   // String 값의 비교는 equals()를 사용 (한 글자씩. Char타입 쪼개서 비교)
//		   
//		   String e = "최민수";
//		   String e2 = "최민" + "수";
//		   System.out.println(c == e2);
//		  
//				  // a = null;
//		          // null은 번지가 없어짐. heap과의 값을 끊어버림
//				   String f = "휴먼";
//				   System.out.println(f == null);
//				   System.out.println(f != null); 
//				   
//				   // null 선택은 언제나 비교가능
//				   //기본 타입은 null을 넣을 수 없다
//				   //대문자가 아닌 참조타입 : 배열
//				   f = null;
//				   System.out.println(f == null);
//				   System.out.println(f != null);
//				   
//				   // 초기화 혹은 값이 할당되지 않으면 못씀
//				   // String g;
//				   String g = null;
//				   System.out.println(g == null);
//				   
//				   if ( )
//				   System.out.println(g.equals(c));
//				   
//				   
//				   
//	}
//
//}
//=======
package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		   int a = 10;
		   int b = a;
		   System.out.println(a+", "+b);
		   b=12;
		   System.out.println(a+", "+b); // 따로 관리
		   
		   String c = "채민병"; // 특별대우
		   // =을 기준으로 오른쪽이 먼저 실행된다
		   // "채민병"을 hip의 비어있는 번지에 할당하고 그 주소를
		   // 스택 영역의 변수C에 번지가 기록됨 
		   System.out.println("c : "+c);
		   
		   
		   // 주소를 직접 볼 수 없음 *C언어는 가능
		   
		   System.out.println(a == b);
		   // == 무조건 stack의 값을 비교한다
		   
		   // 무조건 힙영역의 새로운 번지에 할당하는 방법
		   String d = new String("최민수");
		   System.out.println(d);
		   System.out.println(c == d);
		   // == 무조건 stack의 값을 비교한다 (주소)
		   System.out.println(c.equals(d));
		   // String 값의 비교는 equals()를 사용 (한 글자씩. Char타입 쪼개서 비교)
		   
		   String e = "최민수";
		   String e2 = "최민" + "수";
		   System.out.println(c == e2);
		  
				  // a = null;
		          // null은 번지가 없어짐. heap과의 값을 끊어버림
				   String f = "휴먼";
				   System.out.println(f == null);
				   System.out.println(f != null); 
				   
				   // null 선택은 언제나 비교가능
				   //기본 타입은 null을 넣을 수 없다
				   //대문자가 아닌 참조타입 : 배열
				   f = null;
				   System.out.println(f == null);
				   System.out.println(f != null);
				   
				   // 초기화 혹은 값이 할당되지 않으면 못씀
				   // String g;
				   String g = null;
				   System.out.println(g == null);
				   
				   if ( )
				   System.out.println(g.equals(c));
				   
				   
				   
	}

}
>>>>>>> 2928a83cab14eb1e10c6db121b0eed52292e5ec4
