<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!--  파일첨부는 꼭post -->
<form 
method = "post"
action = "upload.do"
enctype ="multipart/form-data"
>
제목 : <input type="text" name="title">
<textarea name="content" cols=40 rows=10></textarea>
<input type="file" name="file1">
<input type="submit" value="등록">

</form>
</body>
</html>