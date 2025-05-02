<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO서비스</title>
</head>
<body>   


        <!--  서블릿과 연결 -->
        <form method="post" action="TodoController" name="todo"> 
        할일 : <input type="text" name="todo">
        <input type="submit" value="추가">
        </form>
        
        
        
        
        <hr>
        
        
        
     
        
</body>
</html>