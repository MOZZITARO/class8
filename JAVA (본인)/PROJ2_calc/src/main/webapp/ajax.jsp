<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <button id="doGet"> doGet </button>
         <button id="doPost"> doPost </button>
         
         <script>
         document.querySelector("#doGet").addEventLister("click", function(){
        	  ajax('get'); 
        	  
         });
         
         document.querySelector("#doGet").addEventLister("click", function(){
       	  ajax('post'); 
       	  
         });
         
         // ajax 방식
         function ajax(method) {
        	  // 기본값
        	 if(!method) method = "get";
        		
        	  
        	  let url = "req"
        	  if(method == 'get') {
        		                // name
        		  url += "?num1=123&num2=abc"
        	  }
        	   
        	  const url = "req"
        	  const xhr = new XMLHttpRequest();
        	  //form 태그와 동일 = AJAX
        	           // 선불. 착불
        	  xhr.open(method, url);
        	  
        	  if(method == 'get') {
        		  xhr.send();
        	  } else {
        		  xhr.setRequestHeader("Content-Type", "application/x-www-form-urlcoded");
        		  xhr.send("num1=123&num2=abc");
        	  }
        	          // form 페이지이동 // AJAX 갔다옴 //load이벤트
        	      xhr.onload = function() {
        		  console.log( xhr. responseText )
        		  
        		  
        		  
        		  try {
        			  const json = JSON.parse(xhr.responseText)
        			  console.log(json)
        			  // 
        		  } catch(e) {
        			  console.log(e)
        		  }
        		  
        		  
        	  }
        	  
        	  
        	  
         }
         </script>
</body>
</html>