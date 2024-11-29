package sec02.exam02;

import java.util.Scanner; /// 차후에 배울 예정

public class KeyCodeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//		keyCode = System.in.read();
//		System.out.println(keyCode);
//
//		keyCode = System.in.read();
//		System.out.println(keyCode); // 한 글자
//		
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace(); //?
//	}
		
		
		
		
		// 오류 : Scanner가 뭔지 모름 //중요
		Scanner scan = new Scanner(System.in);
		String inputData = scan.nextLine();
		System.out.println(inputData); // 데이터 출력
		
		int input = scan.nextInt();
		System.out.println(input); // 숫자 (글자쓰면 에러)
		
		
	}

}
