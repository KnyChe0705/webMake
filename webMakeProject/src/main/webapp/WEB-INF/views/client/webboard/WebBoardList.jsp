<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/common.jspf"%>



<link href="/resources/include/css/wbList.css" rel="stylesheet">
</head>

<body marginwidth="0" marginheight="0">
	<div id="container">
		<div class="text-center">
			<h1> 게시판 리스트 </h1>
		</div>
		
		<form id="detailForm">
			<input type="hidden" id="wbNo" name="wbNo" />
		</form>
		
		<div id="WebBoardList">
			<table summary="게시판 리스트" class="table">
				<thead>
					<tr class="text-center">
						<th></th>
						<th scope="col"><span class="acticle_title">제목</span></th>
						<th scope="col" class="wbName">작성자</th>
						<th scope="col">작성일</th>
						<th scope="col">조회수</th>
					</tr>
				</thead>
				<tbody id="list" class="table-group-divider">
					<c:choose>
						<c:when test="${not empty WebBoardList}">
							<c:forEach var="webboard" items="${WebBoardList}" varStatus="status">
								<tr class="text-center" data-num="${webboard.wbNo}">
									<td col style="width:60px">${webboard.wbNo}</td>
									<td class="goDetail text-center">${webboard.wbTitle}</td>
									<td class="name" col style="width:150px">${webboard.wbName}</td>
									<td class="text-center" col style="width:110px">${webboard.wbDate}</td>
									<td class="text-center" col style="width:90px">${webboard.wbReadcnt}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="5" class="text-center"> 등록된 게시물이 존재하지 않습니다. </td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
			<div class="text-end">
				<button type="button" id="writeFormBtn" class="btn btn-outline-primary">등록</button>
			</div>
		</div>
	</div>
	<script src="/resources/include/js/common.js"></script>
	<script src="/resources/include/js/jquery-3.7.1.min.js"></script>
	<script src="/resources/include/js/wbList.js"></script>
</body>
</html>