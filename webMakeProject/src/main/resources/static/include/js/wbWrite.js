$(function() {
	$("#InsertBtn").on("click", () => {
		if (!chkData("#wbTitle", "제목을")) return;
		else if (!chkData("#wbName", "작성자를")) return;
		else if (!chkData("#wbContent", "내용을")) return;
		else {
			$("#w_writeForm").attr({
				"method": "post",
				"enctype": "multipart/form-data",
				"action": "/webboard/WebBoardInsert"
			});
			$("#w_writeForm").submit();
		}
	});

	$("#cancelBtn").on("click", function() {
		$("#w_writeForm").each(function() {
			this.reset();
		});
	});

	
	$("#ListBtn").click(function() {
		location.href = "/webboard/WebBoardList";
	});
})