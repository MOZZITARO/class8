package kr.or.human.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.human.dao.empDAO;
import kr.or.human.view.EmpView;


@WebServlet("/emp")
public class EmpController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		empDAO EmpDAO = new empDAO();
		List list = EmpDAO.selectEmpList();
		
		EmpView empView = new EmpView();
		empView.viewEmp(list, response);
		
		
	}


}
