<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="kr.or.human.dto.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



         <!--  서버로 -->
<a href="joinEmp2">등록</a>


                    <!-- 들어갈 서버 -->
		<form method="post" action="whereEmp">		                  		                   
		                    <!-- 받을 수 있는 파라미터(DTO를 받아서 안에 넣어도됨) -->
		<input type="text" name="ename">
		<button type="submit" >검색</button>
		</form>
		
<section>
<article>
	 
	 
	 
	 
	 
	 
	  <%--  <table border="1">
						<thead>
			    			<tr>
								<th> no. </th>
								<th> empno </th>
								<th> ename </th>
								<th> hiredate </th>
								<th> sal </th>
						    </tr>
						</thead>
							
			    <tbody>
						
										<c:forEach var="dto" items="${map.list}">
                                         <tr>
											<td>
												<input type="checkbox" name="empnos" >
											</td>
											<td>${whdto.empno}</td>
											<td><a href="detailEmp?empno=${whdto.empno}">${whdto.ename}</a></td>
											<td>${whdto.hiredate}</td>
											<td>${whdto.sal}</td>
										</tr>
		                                </c:forEach>
								
								
								
						 

     			</tbody>
			</table>
			 --%>
			
					 











            <article>
			<!-- <form method="get" action="emp"> -->
				<input type="submit" value="선택된 것만 조회">
	                <table border="1">
						
				
						
						
						<thead>
			    			<tr>
								<th> no. </th>
								<th> empno </th>
								<th> ename </th>
								<th> hiredate </th>
								<th> sal </th>
						    </tr>
						</thead>
							
			    <tbody>
						     <!-- 값이 있다면 -->
						<c:if test="${ not empty map.list }">
									<c:forEach var="dto" items="${map.list}">
										<tr>
											<td>
												<input type="checkbox" name="empnos" value="${dto.empno}">
											</td>
											<td>${dto.empno}</td>
											<td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
											<td>${dto.hiredate}</td>
											<td>${dto.sal}</td>
										</tr>
									</c:forEach>
								</c:if>
								
								
						<!-- list가 비어있어요 -->
		                <c:if test="${ empty map.list }">
									<tr>
										<td colspan=2>조회 내용이 없습니다</td>
									</tr>
						</c:if>    

     			</tbody>
			</table>
		
		</article>
</section>
<%-- <button type="button"><a href="Intemp?empno=${dto.empno}">생성</a></button>  --%>                 




<%-- <%
// model에 담은건 request에서 꺼낼 수 있다
Map map = (Map) request.getAttribute("map");
System.out.println(map);
int total = (Integer)map.get("total");
int pageNo = empDTO.getPage();
int viewcount = empDTO.getViewCount();

double lastPage = (int) Math.ceil((double)total / viewCount);

int groupCount = 5;
int groupPosition = (int)Math.ceil((double)PageNo / groupCount);
int begin = ((groupPosition-1) * groupCount) + 1;
int end = groupPostion * groupCount;

%>

<c:forEach var="i" begin="<%= begin %>" end="<%= end %>">

</c:forEach> --%>



 <div>

<%              
                // JAVA에서 써도 되고 xml에서 써도 된다
                // ??? 
				// model에 담은건 request에서 꺼낼 수 있다
				Map map = (Map)request.getAttribute("map");
                System.out.println("맵 : " + map);  
				EmpDTO empDTO = (EmpDTO)request.getAttribute("dto");
				System.out.println("dto : " + empDTO); 
				List<EmpDTO> whdto = (List<EmpDTO>)request.getAttribute("whdto");
				System.out.println("jsp종새 자바 : " + whdto); 
				
				int total = (Integer)map.get("total");
				System.out.println("토탈 : " + total);
				
				int pageNo = empDTO.getPage();
				int viewCount = empDTO.getViewCount();
				
				// 1401 / 10 = 140.1 올림해서 141
				int lastPage = (int)Math.ceil((double)total / viewCount);
				
				int groupCount = 5;	// 한번에 보여줄 페이지 개수
				int groupPosition = (int)Math.ceil((double)pageNo / groupCount);
				int begin = ((groupPosition-1) * groupCount) + 1;
// 				int end = begin + groupCount - 1;
				int end = groupPosition * groupCount;
				if(end > lastPage) end = lastPage;
			%>
			
			<c:if test="<%= begin == 1 %>">
				[이전]
			</c:if>
			<c:if test="<%= begin != 1 %>">			                     
				<a href="emp?page=<%= begin-1 %>">[이전]</a>
			</c:if>
			
			<c:forEach var="i" begin="<%= begin %>" end="<%= end %>">
				<c:if test="${i == dto.page }">
					<c:set var="clazz" value="bold" />
				</c:if>
				<c:if test="${ not (i == dto.page) }">
					<c:set var="clazz" value="" />
				</c:if>
				
				<a href="emp?page=${ i }" class="${clazz }">${ i }</a>
			</c:forEach>
			
			<c:if test="<%= end == lastPage %>">
				[다음]
			</c:if>
			<c:if test="<%= end != lastPage %>">
				<a href="emp?page=<%= end+1 %>">[다음]</a>
			</c:if>

</div> 


















<br>
<br>
<br>
<br>

<button type="button" id="btn">진동</button>

<!-- <style>

#popup {
     border: 1px solid red;
     border-radius : 10px;
     width : 100px;
     height: 200px;

     position: absolute;
     top: 50px;
     left: 10px;
}
#popup .title {
     background: blue;
     color: white;

}
#popup.content {

background: white

}

#dim {

position: absolute;
top: 0;
left: 0;



}
</style>


<div id='view'>


</div> -->





<script>
document.querySelector("#btn").addEventListener('click', ()=> {
	
	navigator.vibrate(500) //ms
	
	
})
</script>




</body>
</html>