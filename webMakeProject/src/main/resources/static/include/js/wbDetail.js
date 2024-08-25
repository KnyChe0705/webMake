$(function(){
	$("#writeFormBtn").on("click", () => {
		location.href="/webboard/WebBoardWriteForm";
	});
	
	$("#updateFormBtn").on("click", () => {
		("#w_data").attr({
			"method":"get",
			"action":"/client/webboard/WebBoardUpdateForm"
		});
		$("#w_data").submit();
	});
	
	$("#deleteBtn").on("click", () => {
		$("#w_data").attr({
			"method":"post",
			"action":"/webboard/WebBoardDelete"
		});
		$("#w_data").submit();
	});
	
	$("#ListBtn").click(function(){
		location.href="/webboard/WebBoardList";
	});
	
	function actionProcess(method, goUrl){
		$("#w_data").attr({
			"method":method,
			"action":goUrl
		});
		$("#w_data").submit();
	}
})