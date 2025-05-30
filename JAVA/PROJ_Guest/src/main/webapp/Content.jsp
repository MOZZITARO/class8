<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../css/05_글내용.css"> -->
</head>
<style>

body {
    background-color: #f8f9fa;
    display: flex;
    flex-direction: column; /* 세로 방향으로 정렬 */
    align-items: center; /* 중앙 정렬 */
    padding: 20px;
}









.box {
    width: 100%; /* 너비 조정 */
    margin: 20px;
    border: 1px solid #d9d9d9;
    padding: 20px;
    border-radius: 5px;
    background-color: #ffffff;
}

h1 {
    text-align: center;
    margin-bottom: 30px;
}

.post-title {
    font-size: 24px;
    font-weight: bold;
    margin-bottom: 10px;
}

.post-info {
    font-size: 12px;
    color: #888;
    margin-bottom: 20px;
    border-bottom: 1px solid #d9d9d9;
}

.post-content {
    font-size: 16px;
    color: #333;
    margin-bottom: 20px;
}

.button-container {
    text-align: right;
    
}

.button-container button {
    
    padding: 10px 15px;
    font-size: 10px;
    border: none;
    border-radius: 5px;
    background-color: #007bff;
    color: white;
    cursor: pointer;
}
h2 {
    border-bottom: 1px solid #d9d9d9;
}
.comment-section {
    margin-top: 20px;
    padding-top: 10px;
}

.abc {
    display: flex;
    
}
.comment-section h2 {
    margin-bottom: 5px;
    font-size: 20px;
}

.comment-section textarea {
    width: 100%;
    height: 60px;
    border: 1px solid #d9d9d9;
    border-radius: 5px;
    padding: 10px;
    margin-bottom: 10px;
}

.comment-section button {
    padding: 10px 15px;
    font-size: 10px;
    border: none;
    border-radius: 5px;
    background-color: #007bff;
    color: white;
    cursor: pointer;
}
.comment {
    font-size: 14px;
    margin-bottom: 10px;
    padding: 5px;
    border-radius: 5px;
    border-bottom: 1px solid #d9d9d9;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
}

.comment .author {
    font-weight: bold;
}

.comment .date {
    font-size: 12px;
    color: #888;
}

.ok {
    width: 50px;
    height: 33px;
}


#attach {


border: 2px solid lightgray;
border-top-left-radius:5px;
border-top-right-radius:5px;
border-bottom-right-radius:5px;
border-bottom-left-radius:5px;

    padding-top: 10px;
    padding-right: 10px;
    padding-bottom: 10px;
    padding-left: 10px;

margin-top : 5%;

width: 30%;

}
</style>
<body>


<c:forEach var="doo" items="${idpost}">
    <div class="box">
        <div class="post-title">${doo.title}</div>
        <div class="post-info"> 작성자: 안혜리 | 날짜: ${doo.postdate} | 조회수: ${doo.viewcount}</div>
        <div class="post-content">
          ${doo.content}
         
        </div>
</c:forEach>
<br>
<br>
<br>
<br>
<c:forEach var="dolink" items="${linklist}">
	<div><a href=${dolink.link}>${dolink.link}</a></div>
</c:forEach>
<br>
<br>
<br>
<c:forEach var="filink" items="${filelist}">
<div id="attach">첨부된 파일 : <a href="download?filename=${filink.file_name}" id="href">${filink.file_name}</a></div>
</c:forEach>
      
      
      
      
      
        <div class="button-container">
        <!-- <form method ="post" action ="board"> -->
            <button type="submit" id="list"><a href="board">목록으로</a></button>
      <!--   </form> -->
        
        
        
     <c:forEach var="dyo" items="${idpost}">   
        <form method ="post" action ="Modify">
            <button type="submit" id="modify" name="mod" value="${dyo.postid}">수정</button>
        </form>
      </c:forEach>   
            
            
            
               <c:forEach var="dxo" items="${idpost}">    
                    <form method="post" action="Delete">
                    <button class="commentbtn" type="submit" name="del" value="${dxo.postid}">삭제</button>
                    </form>
               </c:forEach> 
            
   
            
            
            
        </div>
        
        <div class="comment-section">
            <h2>댓글</h2>
            
            
            
     <div id="comment-space">
            
            
            <c:forEach var="ddt" items="${comList}">
            
       <div class="comment">
            
                <div class="usercomment">
                    <span class="author">박혜성</span>
                    <span class="date">${ddt.commentdate}</span>
                    <p>${ddt.commenttext}</p>
                </div>
                <div class="cmtbtn">
                    <button class="commentbtn" type="submit">수정</button>
                    
                    
                    <form method="post" action="delcom"> 
                    <input type="hidden" name="comdel" value="${ddt.postid}">
                    <button class="commentbtndel" type="submit" name="delcom" value="${ddt.commentid}">삭제</button>
                    </form>
                    
                    
               </div>
                    
                    
            </div>
              </c:forEach>
       </div>
            
          
            
            
            <c:forEach var="dpo" items="${idpost}">        
         <form method="post" action="commentct"> 
            <div class="comment-section abc">
                <input type="hidden" value="${dpo.postid}" name="postid">
                <textarea placeholder="댓글을 입력하세요." name="com"></textarea>
                <button type="submit" class="ok">등록</button>
            </div>
         </form>       
           </c:forEach> 
            
         
         
         
    
        
         
         
            
         
        
        
        
        
      
        
        
        
        
        
        <script>
            const list = document.querySelector('#list');
            const iframe = parent.document.querySelector("iframe");

            list.addEventListener('click', function () {
                iframe.src = "../componant/03_사내복지.html";
            });

            // 권한 확인을 위한 변수
            const userRole = window.parent.localStorage.getItem("userRole");

            // 수정 버튼 클릭 시
            document.addEventListener("DOMContentLoaded", function () {
                const modifyButton = document.querySelector('#modify');

                // 권한이 'admin'인 경우에만 수정 가능
                if (userRole === 'admin') {
                    modifyButton.addEventListener('click', function () {
                        const title = document.querySelector('.post-title').textContent;
                        const content = document.querySelector('.post-content').textContent;

                        // localStorage에 저장
                        localStorage.setItem('postTitle', title);
                        localStorage.setItem('postContent', content);

                        // 글쓰기 페이지로 이동
                        iframe.src = "../componant/06_글쓰기.html";
                    });
                } else {
                    modifyButton.addEventListener('click', function () {
                        alert("권한이 없습니다."); // 권한이 없을 때 경고 메시지
                    });
                }
            });
            
            

        </script>
    </div>
</body>

</html>
