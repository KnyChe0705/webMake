/*
함수명 : chkData(유효성 체크 대상, 메시지 내용)
출력 영역 : alert으로.
예시 : if(!chkData("#keyword","검색어를"))return;
*/

function chkData(item, msg) {
	if ($(item).val().replace(/\s/g, "") == "") {
		alert(msg + " 입력해 주세요.");
		$(item).val("");
		$(item).focus();
		return false;
	} else {
		return true;
	}
}

function checkForm(item, msg){
	let message = "";
	if($(item).val().replace(/\s/g,"")==""){
		message = msg + " 입력해 주세요.";
		$(item).attr("placeholder", message);
		return false;
	} else {
		return true;
	}
}


/* 함수명 : dataCheck(유효성 체크 대상, 출력 영역, 메시지 내용) */
function dataCheck(item, out, msg) {
	if ($(item).val().replace(/\s/g, "") == "") {
		$(out).html(msg + " 입력해 주세요");
		$(item).val("");
		return false;
	} else {
		return true;
	}
}


/*
함수명 : chkFile(파일명 객체)
설명 : 이미지 파일 여부를 확인하기 위해 확장자 확인 함수.
if (!chkFile($("#file"))) return*/
function chkFile(item){
	let ext = item.val().split(".").pop().toLowerCase();
	if(jQuery.inArray(ext, ['gif','png','jpg']) == -1){
		alert('gif, png, jpg 파일만 업로드 할 수 있습니다.');
		return false;
	} else {
		return true;
	}
}