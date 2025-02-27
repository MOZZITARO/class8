package sec04.exam3;

public class empTable {

//	Emp를 만들고
//	EmpTable 넣기
//	EmpTable의 Emp 정보 출력

	void empinfo () {  
		emp Emp = new emp();
		
		
		Emp.EMPNO = 7369;
		Emp.ENAME = "SMITH";
		Emp.SAL = 800;
		Emp.MGR = 7902;
		
		System.out.println(Emp.EMPNO + " " + Emp.ENAME + " " + Emp.SAL + " " + Emp.MGR);
		
} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}
	
	
	
}
