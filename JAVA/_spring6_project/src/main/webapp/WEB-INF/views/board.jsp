<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.*" %>
<%@ page import="kr.or.human6.dto.*" %>
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
	<!DOCTYPE html>
<html lang="en">
<!--  이거 3차프로젝트 게시판 -->
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

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
	margin-bottom: 20px;
}

.post {
	margin-bottom: 15px;
	cursor: pointer;
	display: flex; /* Flexbox 사용 */
	justify-content: space-between; /* 양쪽 정렬 */
	align-items: center; /* 세로 중앙 정렬 */
	border-bottom: 1px solid #d9d9d9; /* 밑줄 추가 */
	padding-bottom: 10px; /* 아래 여백 추가 */
}

.post .date {
	font-size: 12px;
	color: #888;
	margin-left: 10px; /* 날짜와 제목 사이 여백 */
	margin-right: 10px;
}

.post .content {
	color: black; /* 내용 색상 */
	font-weight: bold; /* 내용 볼드체 */
	flex-grow: 1; /* 내용이 남은 공간을 채우도록 설정 */
	margin-right: 10px; /* 오른쪽 여백 */
}

.post .author {
	font-size: 12px; /* 작성자 글자 크기 */
	color: #555; /* 작성자 색상 */
}

.button-container {
	margin-top: 10px;
	text-align: right;
}

.button-container button {
	padding: 10px 15px;
	font-size: 16px;
	border: none;
	border-radius: 5px;
	background-color: #007bff;
	color: white;
	cursor: pointer;
}

.postbtn {
	margin-bottom: 10px; /* 글쓰기 버튼과 목록 간의 여백 */
	text-align: right; /* 오른쪽 정렬 */
}

.postbtn button {
	padding: 10px 15px; /* 여백 조정 */
	font-size: 10px; /* 글자 크기 조정 */
	border: none; /* 기본 테두리 제거 */
	border-radius: 5px; /* 둥근 모서리 */
	background-color: #007bff; /* 배경 색상 */
	color: white; /* 글자 색상 */
	cursor: pointer; /* 커서 모양 변경 */
}


.pagination {
	margin-top: 20px;
	text-align: center;
}

.pagination button {
	padding: 10px 15px;
	border: 1px solid #007BFF;
	background-color: #ccc; /* 기본 배경색: 회색 */
	cursor: pointer;
	border-radius: 5px;
}

 .pagination button.active {
	background-color: none; /* 활성화된 버튼: 파란색 */
} 

.pagination button:hover {
	background-color: #0056b3; /* 호버 시 색상 */
}






#move {

text-decoration : none;
color: inherit;

}

#now {



width : 20%;
position: absolute;
        top: 150px;
        left: -70px;


}

#font {

font-weight : bold;



}

</style>



<body>
	<div class="box">
		<h1>일반 게시판</h1>
		<div class="postbtn">

			<form method="post" action="write">
				<button type="submit" class="newpost">글 쓰기</button>
			</form>
		</div>

		



<c:if test="${ not empty map.list }">
    <c:forEach var="dto" items="${map.list}">
		<!-- 게시물 목록 -->                   <!--  id만 따오면 뒤에 따라온다 -->
		<div class="post" >        <!--  a태그 : get방식(파라미터 뒤에쓰기) form : post방식 -->
			<span class="content"><a href="Content?postid=${dto.postid}" id="move">${dto.title}</a></span>
			<span class="author">${dto.viewcount}</span> 
			<span class="date">${dto.postdate}</span>
			<span class="author">${dto.userid}</span> 
		</div>
	</c:forEach>	
		</c:if>
	<c:if test="${ empty map.list }">
									<tr>
										<td colspan=2>조회 내용이 없습니다</td>
									</tr>
						</c:if> 
    <div>

<%              
                // JAVA에서 써도 되고 xml에서 써도 된다
                // ??? 
				// model에 담은건 request에서 꺼낼 수 있다
				Map map = (Map)request.getAttribute("map");
                System.out.println("맵 : " + map); 
                
                	
                
				Prodto Prodto = (Prodto)request.getAttribute("dto");
				/* if (Prodto == null) {
					Prodto = new Prodto(); // 기본 객체라도 생성해서 NullPointerException 방지
					Prodto.setPage(1);
					Prodto.setPagecount(10);  // 기본값
				} */
				System.out.println("dto : " + Prodto); 
				
				
				int total = (Integer)map.get("total");
				System.out.println("토탈 : " + total);
				
				int pageNo = Prodto.getPage();
				System.out.println("현재 페이지 : " +  pageNo);
				int viewCount = Prodto.getPagecount();
				System.out.println("한번에 볼 페이지 개수 : " +  viewCount);
				// 1401 / 10 = 140.1 올림해서 141
				int lastPage = (int)Math.ceil((double)total / viewCount);
				
				int groupCount = 5;	// 한번에 보여줄 페이지 개수
				int groupPosition = (int)Math.ceil((double)pageNo / groupCount);
				int begin = ((groupPosition-1) * groupCount) + 1;
				if (begin < 1) begin = 1; 
// 				int end = begin + groupCount - 1;
				int end = groupPosition * groupCount;
				if(end > lastPage) end = lastPage;
				
			%>
			
			<span id="font"><%= total %></span>개의 글
			
			
			<div class="pagination">
			
			
			<c:if test="<%= begin == 1 %>">
				<button onclick="changePage(currentPage - 1)" id="prevButton">이전</button>
			</c:if>
			<c:if test="<%= begin != 1 %>">			                     
				<a href="select?page=<%= begin-1 %>"><button onclick="changePage(currentPage - 1)" id="prevButton">이전</button></a>
			</c:if>
			
			
			<c:forEach var="i" begin="<%= begin %>" end="<%= end %>">
			<!--  서식 적용 -->
				<c:if test="${i == dto.page }">
				    <div id="now"><span id="font">${ i }</span>페이지</div>
					<c:set var="clazz" value="bold" />
				</c:if>
				<c:if test="${ not (i == dto.page) }">
					<c:set var="clazz" value="" />
				</c:if>
				<a href="select?page=${ i }" class="${clazz }"><button onclick="changePage(1)">${ i }</button></a>
		
			</c:forEach>
			
			
			<c:if test="<%= end == lastPage %>">
				<button onclick="changePage(currentPage + 1)" id="nextButton">다음</button>
			</c:if>
			<c:if test="<%= end != lastPage %>">
				<a href="select?page=<%= end+1 %>"><button onclick="changePage(currentPage + 1)" id="nextButton">다음</button></a>
			</c:if>
     	</div>
</div> 
	
		
		<!-- </div>
		<div class="post">
			<span class="content">팀워크 향상을 위한 아이디어 모집</span> <span class="date">2025-02-01</span>
			<span class="author">김경민</span>
		</div>
		<div class="post">
			<span class="content">사내 복지 제도에 대한 의견 나누기</span> <span class="date">2025-01-15</span>
			<span class="author">채민병</span>
		</div>
		<div class="post">
			<span class="content">겨울 휴가 계획 및 공유</span> <span class="date">2025-01-13</span>
			<span class="author">서영석</span>
		</div>
		<div class="post">
			<span class="content">사내 점심 메뉴 추천 및 후기</span> <span class="date">2025-01-05</span>
			<span class="author">안혜리</span>
		</div> -->
		
		
		<!--  <div class="pagination">
			<button onclick="changePage(currentPage - 1)" id="prevButton">이전</button>
			<button onclick="changePage(1)">1</button>
			<button onclick="changePage(2)">2</button>
			<button onclick="changePage(3)">3</button>
			<button onclick="changePage(4)">4</button>
			<button onclick="changePage(5)">5</button>
			<button onclick="changePage(currentPage + 1)" id="nextButton">다음</button>
		</div> -->

	</div> 
	
	
	
	
	
	
	
	<script>
	
	   
	   
         let currentPage = 1; // 현재 페이지를 추적하는 변수

        function changePage(page) {
            // 페이지 범위 체크
            if (page < 1 || page > 5) return;

            // 현재 페이지 업데이트
            currentPage = page;

            // 모든 버튼에서 'active' 클래스 제거
            const buttons = document.querySelectorAll('.pagination button');
            buttons.forEach(button => {
                button.classList.remove('active');
            });

            // 현재 페이지 버튼에 'active' 클래스 추가
            const activeButton = document.querySelector(`.pagination button:nth-child(${page + 1})`);
            if (activeButton) {
                activeButton.classList.add('active');
            }

        }

        // 페이지 로드 시 활성화된 버튼 설정
        document.addEventListener("DOMContentLoaded", function () {
            changePage(currentPage); // 초기 페이지 설정

            const NewWorkorderbutton = document.querySelector(".newpost");
            NewWorkorderbutton.addEventListener("click", function () {
                const iframe = parent.document.querySelector("iframe");
                iframe.src = "componant/06_글쓰기.html";
            });
        }); 
    </script>
</body>

</html>
</body>
</html>