function daumPost() {
    new daum.Postcode({
        oncomplete: function(data) { // 클릭한 주소 정보가 인자값 data로 들어간 후 메서드 실행
            console.log(data);
        	const addr1 = document.getElementById("addr1");
        	const addr2 = document.getElementById("addr2");
        	const addr3 = document.getElementById("addr3");
			        	
        	let addr = "";
        	if (data.userSelectedType == "R") { // 사용자가 선택한 값이 도로명 또는 지번인지 판별(R, J)
        		addr = data.roadAddress;
        	} else {
        		addr = data.jibunAddress;
        	}
			        	
        	addr1.value = data.zonecode; // 우편 번호
        	addr2.value = addr;
        	addr3.focus(); // 상세 정보 포커스
        }
    }).open();
}