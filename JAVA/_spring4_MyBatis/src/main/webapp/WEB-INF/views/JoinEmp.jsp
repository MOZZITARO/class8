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
              
              
              
              
              

 <!-- 등록페이지 -->       
<table border="1">

     <tbody>

<tr>

    <th> empno </th>          <!--  파라미터 -->
    <td> <input id="empno" type="text" name="empno"> </td>
                <!-- id필수 -->
</tr>

<tr>

    <th> ename </th>
    <td> <input id="ename"  type="text"  name="ename">  </td>
    
</tr>

<tr>

    <th> sal </th>
    <td> <input id="sal"  type="text" name="sal"> </td>
    
</tr>




       </tbody>
</table>

<input type="submit" id="join" value="등록하기">

             
 <script>
 
 document.querySelector("#join").addEventListener("click", function(event) {
		 event.preventDefault();
	 
	 
	 
		 // 데이터
		 let param = {
	 
	         empno : document.querySelector("#empno").value,
	         ename: document.querySelector("#ename").value,
	         sal :  document.querySelector("#sal").value,
	         
	 
          }
 
		  console.log(param.ename.trim().length)
          if(param.empno.trim().length == 0) {
	         alert('empno는 필수입니다')
          }
          if(param.ename.trim().length == 0) {
        	  alert('이름은 필수입니다')
          }
          if(param.sal.trim().length == 0) {
        	  alert('sal은 필수입니다')
          }
          
          
          // 데이터 보내기
          fetch('joinEmp', {
        	  // JSON Parsing하여 배열로
        	method: 'POST',
        	headers: {
        		
        		'Content-Type': 'application/json'
        	},
        	body : JSON.stringify( param )  
        	       // json 오류 수정
          }).then(function(resp) {
        	return resp.json() 
        	
          }).then ( (data)=>{
        	console.log(data)  
        	
          }).catch( (err)=> {
          console.error('ERROR joinEmp fetch', err)
          })
          
          
      })       
 </script>             
              
              
              
              
              
</body>
</html>