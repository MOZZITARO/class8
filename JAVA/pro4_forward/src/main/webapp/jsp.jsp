<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.List"
    import = "java.util.ArrayList"
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 스크립틀릿 scriptlet -->

<%
// 여기는 java 땅입니다
// html 아님
System.out.println("java");
%>


<%
//html과 자바를 넘나듬
for(int i=1; i<=9; i++) {
%>
	<h1><% out.write(""+i) %></h1>
<%
}
%>

<div><% out.println(a); %></div>
<div><%= a %></div>

<%!

//선언문
//필드 선언
String str = "글씨";
//메소드 선언
String getStr() {
	return this.str;
}


%>

 <!--
   파일 자체를 가져옴 
 -->
<%@ include file= "header.jsp" %>








 <!--
 jsp에 직접 text에 1234라는 값을 보내고 
 jsp에서 html로 그 값을 출력하시오 
 -->
 
 <%@ String text = request.getParameter("text");
	    out.println(text); %>
	    
	    <hr>
	    <!-- 액션 태그 -->
	    <jsp:include page= "header.jsp" />
	         <jsp:param value="minsu" name="id">
	    </jsp:include>
	    <script />
 

<script>
let a = '<%= a %>'
let b = 30;

"1234";
</script>
</body>
</html>