package kr.or.human.filter;



import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.human5.dto.MemberDTO;


               // 어느 주소든 가능
	@WebFilter("/host")
	public class Checkfilter implements Filter {
	
		
		// 서버 켜질때
	   @Override
	   public void init(FilterConfig filterConfig) throws ServletException {
	
		   
	   }
	   
	   
	@Override             // http서블릿의 부모
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException, ServletException {
	
	// utf-8 세팅 (xml세팅)
	request.setCharacterEncoding("utf-8");
	
	
	
	
	
	
	// 1. ServletRequest를 형변환
	HttpServletRequest req = (HttpServletRequest) request;
	HttpServletResponse resp = (HttpServletResponse) response;
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 2. 서블릿 매핑에 해당하는 경로를 반환
	// 모든 접속 시도 확인가능
	String servletPath= req.getServletPath();
	System.out.println("servletPath : " + servletPath);
//	                                       /human5
	    // isExclude // 허용된 곳
	if("/login".equals(servletPath)) {
		System.out.println("세션X");
		
		// 기존의 흐름
		chain.doFilter(request, response);
		
		
	} else {
		HttpSession session = req.getSession();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("dto");
		
		// if2 // 허용이 되지않은곳은 로그인으로
		if(memberDTO != null) {
			System.out.println("로그인되어 통과");
			// 세션있을때만 통과
			chain.doFilter(request, response);
		} else {
			System.out.println("로그인 필수");
			resp.sendRedirect(req.getContextPath() + "login");
		}
		
	  }	
		
	}
	
	
	
	// 서버 꺼질때 
	@Override
	public void destroy() {
		
	}
	
	
	
	// 무조건 통과 시켜야하나?
//	private boolean isExclude(String servletPath) {
//		
//		if( "/login".equals(servletPath)
//				|| "/loginCheck".equals(servletPath)
//				
//				|| servletPath.indexOf("/resources") != -1
//		        || servletPath.startsWith("/resources/")
//		        
//		        ) {
//			return true;
//		} else {
//			return false;
//		}	
//		
//		
//	}
//	
//	
	
	
	
	
}
