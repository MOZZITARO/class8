<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <%
       
       int a = 10;
       pageContext.setAttribute("a", a);
       
       int b = 20;
       
       %>
       
       
       
       \${ a } : ${ a }<br>
         \${ a1 } : ${ a1 }<br> <!-- null  --> 
         
         
         
         
             <!-- 파라미터  -->   <!-- 나타날 값  -->
         <c:set var="b1" value="<%= b %>" scope="page"></c:set>
          \${ b1 } : ${ b1 }
                    
          <c:set var="id" value="idid" scope="page"></c:set>
           <c:set var="id2" value="${id }" scope="page"></c:set>
           
           <%
             System.out.println( pageContext.getAttribute("id2") );
           %>
          
          <c:set var="game" value="lol" scope="page"></c:set>
           <c:set var="game" value="overwatch" scope="request"></c:set>
          <c:set var="game" value="SuddenAttack" scope="session"></c:set>
           <c:set var="game" value="LostArk" scope="application"></c:set>
          
          <br>
          <!-- el > null  -->
          \${ game } : ${ game }
          pageScope : ${ pageScope.game }<br>
          requestScope : ${ requestScope.game }<br>
          sessionScope : ${ sessionScope.game }<br>
          applicationScope : ${ applicationScope.game }<br>
          <hr>
                
          <c:if test="true">
                <string>항상 참</string>
          </c:if>
          
          <c:if test=" ${game eq 'LOL'}" >
                <string>LOL</string>
          </c:if>
          
          
          
          
          <c:choose>
          <c:when test=" ${Game eq 'LOL'} ">
          롤 유저
          </c:when>
          <c:when test=" ${Game eq 'Overwatch'} ">
          옵치 유저
          </c:when>
          <c:otherwise>
          게임하기
          </c:otherwise>
          </c:choose>
          <hr>
          
          <%
          List list = new ArrayList();
          for(int i=0; i<4; i++) {
        	  Map map = new HashMap();
        	  map.put("사번", 100 + (i*i) );
        	  map.put("이름", "이름" + i );
        	  map.put("나이", 20 + i );
        	  
        	  list.add(map);
        	 
          }
          %>  
          
          
          <c:forEach var="emp" items="<%= list %>" >
          </c:forEach>
          
          <c:set var="list2" value="<%= list %>" />
          <c:forEach var="emp" items="${list2}">
          ${emp.사번}<br>
           ${emp.이름}<br>
            ${emp.나이}<br>
            <br>
          </c:forEach>
          <c:forEach var="i" begin="0" end="10">
          i : ${  i  }<br>
          </c:forEach>
           <c:forEach var="i" begin="0" end="10" step="3" varStatus="loop">
          i : ${  i  }<br>
          loop.index : ${loop.index }<br>
           loop.count : ${loop.count }<br>
            loop.first : ${loop.first }<br>
             loop.last : ${loop.last }<br>
          </c:forEach>
          items랑 begin, end 같이 사용 가능<br>
          end가 items 개수보다 커도 items만큼만 돌고 오류 없음<br>
          <c:forEach var="map" items="${list2}" begin="0" end="10" step="3">
          </c:forEach>
          <hr>
          <a href="jstl.jsp?name=한글">클릭</a>
          param.name : ${param.name}<br>
          
          <c:url var="url2" value="/jstl.jsp" >
               <c:param name="name" value="한글" />
          </c:url> 
          <a href="${url 2}">url2</a>
          <br>
          c:url을 사용하는 이유<br>
          1. 영어나 숫자 외의 한글이나 특수문자를 encode 해줌<br>
          2. context path 자동 추가 (/)                 
</body>
</html>