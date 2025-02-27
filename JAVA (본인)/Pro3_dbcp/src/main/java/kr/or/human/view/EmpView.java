package kr.or.human.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

public class EmpView {

	
	public void viewEmp (List list, HttpServletResponse response) {
		
		PrintWriter out = null;
		try {
			PrintWriter out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
