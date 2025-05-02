<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

.hide {
      display : none;
}

</style>
</head>
<body>
<div style=" border: 1px solid red; " >
      공지사항 <br>
      <input type = "checkbox" id="pop"> 10초 동안 안보이기
 
      <script>
                  document.querySelector("#pop").addEventListener("click", function(event) {
                	
                	  let checked = event.target.checked
                	  if(checked) { 
                		  
                		  // 10초 뒤 설정
                		  const now = new Date();
                		  const after = now.getSeconds() + 10;
                		  now.setSeconds(after)
                		  console.log(now.toGMTString())
                		  
                		  //js로 쿠키 설정 
                		  document.cookie = "show=true;expires="+ now.toGMTString();
                		  
                	  }
                	  
                	  
                	  
                  })   
                  
                  // 쿠키 보는 법
                  console.log(document.cookie)
                  const cookies = document.cookie.split("; ")
                  for(let i=0; i<cookies.length; i++) {
                	  const c = cookies[i].split("=")
                	  const name = c[0]
                	  const value = c[1]
                	  
                	  if(name == "show" && value == "true") {
                		  document.querySelector("div").classList.add("hide")
                	  }
                	  
                  }
      </script>
</div>
</body>
</html>