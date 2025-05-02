<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
              
              
              
              
              
<form method="post" action="upemp">
           
<table border="1">

     <tbody>

<tr>

    <th> empno </th>
    <td> <input type="text" name="empno" value="${dtomodi.empno}"> </td>
    
</tr>

<tr>

    <th> ename </th>
    <td> <input type="text"  name="ename" value="${dtomodi.ename}">  </td>
    
</tr>

<tr>

    <th> sal </th>
    <td> <input type="text" name="sal" value="${dtomodi.sal}"> </td>
    
</tr>




       </tbody>
</table>
        
         <input type="hidden" name="empno" value="${dtomodi.empno}">
         <input type="submit" value="수정하기">
         
</form>           
              
              
              
              
              
              
</body>
</html>