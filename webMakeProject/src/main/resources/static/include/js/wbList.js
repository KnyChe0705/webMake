$(function(){
	$(".goDetail").on("click", function(){
		let wbNo = $(this).parents("tr").attr("data-num");
		$("#wbNo").val(wbNo);
		
		$("#detailForm").attr({
			"method":"get",
			"action":"/webboard/WebBoardDetail"
		});
		$("#detailForm").submit();
	});
	
	$("#writeFormBtn").on("click", () => {
		location.href="/webboard/WebBoardWriteForm";
	});
});