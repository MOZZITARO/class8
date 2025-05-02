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
              
              
<table border="1">
    


<tr>
    <th> empno </th>
    <td> ${dto.empno} </td>
</tr>
<tr>
    <th> ename </th>
    <td> ${dto.ename} </td>
</tr>
<tr>
    <th> sal </th>
    <td> ${dto.sal} </td>
</tr>



     </tbody>
</table>

<button type="button"><a href="modifyemp?empno=${dto.empno}">수정하기</a></button>     
<button type="button"><a href="delemp?empno=${dto.empno}">삭제하기</a></button>     

              
              
              
              
              
</body>
</html>