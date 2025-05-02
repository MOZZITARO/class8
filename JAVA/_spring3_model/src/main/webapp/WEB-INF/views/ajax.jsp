<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
window.addEventListener('load', function() {
	
	const btn = document.querySelector("#btn")
	btn.addEventListener('click', function () {
		console.log('click!')
		
		let data = {
			
			
			'id' : 'abcd'
			
			
		}
		
		
		const xhr = new XMLHttpRequest()
		/* xhr.open('post', 'ajax1') */
	/* 	 xhr.open('post', 'ajax2') */
	   xhr.open('post', 'ajax3') // 출력 : 개발자 도구 차이
	//    xhr.open('post', 'ajax4')
		xhr.setRequestHeader('content-Type', 'application/json')
		xhr.send( JSON.stringify(data) )
		
		
		xhr.onload = function() {
			
			console.log(xhr.responseText)
		}
		
		
		
		
	})
	
})


</script>
</head>
<body>
               ajax.jsp<br>
               <button type="button" id="btn"> ajax 실행 </button>
</body>
</html>