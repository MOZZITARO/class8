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
<style>



</style>
<script>

          


</script>
</head>
<body>
          <c:forEach var="web" items="${list}">
          <table border="1">
    <thead>
      <tr>
           <th><img src="${web.link}"></img></th>
      </tr>
    </thead>
    <tbody>
   
        <tr>
            <td>
            <strong>${web.title}</strong>
            </td>
            <td>
            <strong>${web.author}</strong>
            </td>
             <td>
            <strong>${web.descript}</strong>
            </td>
        </tr>
       
        
    </tbody>
</table>
      </c:forEach>     
          
 
          
      
          
          
               
</body>
</html>