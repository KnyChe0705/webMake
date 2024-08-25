<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jspf"%>



<link href="/resources/include/css/wbWrite.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="writingWrap">
			<div class="writingHeader">
				<h2>게시판 글쓰기</h2>
			</div>

		</div>

		<form id="w_writeForm">
			<div class="text-end">
				<button type="button" id="InsertBtn" class="btn btn-outline-primary">저장</button>
			</div>
			<div class="writingContent">
				<div class="writingEditor">
					<div class="editer_wrap">
						<div class="row">
							<div class="TitleTextArea">
								<input type="text" id="wbTitle" name="wbTitle"
									class="form-control" placeholder="제목을 입력해주세요" />
							</div>
						</div>
					</div>
					<div id="editor" class="editor">
						<div class="se-dnd-wrap">
							<div class="name">
								<input type="text" id="wbName" name="wbName"
									class="form-control" placeholder="작성자를 입력해주세요" />
							</div>
							<div class="content">
								<textarea name="wbContent" id="wbContent" class="form-control"
									rows="10"></textarea>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="text-end">
				<button type="button" id="cancelBtn" class="btn btn-outline-primary">취소</button>
				<button type="button" id="ListBtn" class="btn btn-outline-primary">목록</button>
			</div>
		</form>

	</div>
	<script src="/resources/include/js/common.js"></script>
	<script src="/resources/include/js/jquery-3.7.1.min.js"></script>
	<script src="/resources/include/js/wbWrite.js"></script>
</body>
</html>