<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

pageContext.setAttribute("dto2", new kr.or.human.a.MemberDTO());
pageContext.setAttribute("dto3", new kr.or.human.a.MemberDTO());

dto2.setId("idid");



%>
<!-- 액션 태그 // --> 
<!-- 
     class의 클래스를 생성해서 
     id의 key로
     scope에 setAttribute 해줌
     scope 속성을 생략하면 page가 기본값임
 -->
<jsp:useBean id ="dto4" class="kr.or.human.a.MemberDTO" scope="page"></jsp:useBean>
<jsp:setProperty name="dto4" property="*" />
/${ dto.id } : ${ dto.id }<br>
/${ "dto.id" } : ${ "dto.id" }<br>







</body>
</html>