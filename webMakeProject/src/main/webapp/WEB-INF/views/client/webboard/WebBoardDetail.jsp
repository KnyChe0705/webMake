<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jspf"%>



<link href="/resources/include/css/wbDetail.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<form name="w_data" id="w_data">
			<input type="hidden" name="wbNo" value="${detail.wbNo}" />
		</form>
	
	
		<div class="title_area">
			<h2 class="title_text">${detail.wbTitle}</h2>
		</div>
		
		<div class="profile_area">
			<div class="nickname">
				<span>${detail.wbName}</span>
			</div>
			<div class="info">
				<span class="date">${detail.wbDate}</span> <span class="readcnt">조회수: ${detail.wbReadcnt}</span>
			</div>
		</div>
		
		<div class="content viewer">
			<div class="content-text">
				<span>${detail.wbContent}</span>
			</div>
		</div>
		
		<div class="left_start">
			<button type="button" id="writeFormBtn"	class="btn btn-outline-primary">등록</button>
			<button type="button" id="updateFormBtn" class="btn btn-outline-primary">수정</button>
			<button type="button" id="deleteBtn" class="btn btn-outline-primary">삭제</button>
			<button type="button" id="ListBtn" class="btn btn-outline-primary">목록</button>
		</div>
		
	</div>
	<script src="/resources/include/js/common.js"></script>
	<script src="/resources/include/js/jquery-3.7.1.min.js"></script>
	<script src="/resources/include/js/wbDetail.js"></script>
</body>
</html>