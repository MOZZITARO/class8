<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  ${list} </P>

<table border="1">
    <tr>
        <th>empno</th>
        <th>empname</th>
        <th>job</th>
        <th>hiredate</th>
        <th>deptno</th>
    </tr>
    <c:forEach var="emp" items="${list}">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.deptno}</td>
        </tr>
    </c:forEach>
</table>

<table border="1">
      <tr>
        <th>empno</th>
        <th>empname</th>
        <th>job</th>
        <th>hiredate</th>
        <th>deptno</th>
    </tr>
    
        <tr>
            <td>${list2.empno}</td>
            <td>${list2.ename}</td>
            <td>${list2.job}</td>
            <td>${list2.hiredate}</td>
            <td>${list2.deptno}</td>
        </tr>
    
</table>

<table border="1">
     <tr>
        <th>empno</th>
        <th>empname</th>
        <th>job</th>
        <th>hiredate</th>
        <th>deptno</th>
    </tr>
    
        <tr>
            <td>${list3.empno}</td>
            <td>${list3.ename}</td>
            <td>${list3.job}</td>
            <td>${list3.hiredate}</td>
            <td>${list3.deptno}</td>
        </tr>
    
</table>

</body>
</html>
