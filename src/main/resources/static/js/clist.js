	//모달창 on
	$("#company_submit").click(function(){
        $("#modal").attr("style", "display:block");
		
    });
   //모달창 off 및 값 초기화
     $("#modal_close_btn").click(function(){
        $("#modal").attr("style", "display:none");
  		$("#cname").val('');
  		$("#caddr").val('');
  		$("#cnumber").val('');
  		$("#number").val('');
  		$("#caddr_detail").val('');
  		$("#name").val('');
    });
	//+버튼 클릭시 부서 빈테이블 추가
	$(document).ready(function() {
	var i=1; // 변수설정은 함수의 바깥에 설정!
  		$("#team_submit").click(function() {
    
   		$(".team_board").append("<input type='text' name='team"+i+"'>");
    
    	i++; // 함수 내 하단에 증가문 설정
    

  		});
	});  
	$(document).ready(function() {
	$("#company_save").click(function() {
		
		// 회사 정보 입력 값 가져오기
		var name = $('#name').val();
		var cname = $('#cname').val();
		var address = $('#caddr').val() + ' ' + $('#caddr_detail').val();
		var cnumber = $('#cnumber').val();
		var number = $('#number').val();

		// 입력값이 빈 경우 알림창 띄우기
		if (cname.length === 0 || address.length === 0 || cnumber.length === 0 || number.length === 0) {
			alert('데이터를 입력하셔야 합니다.');
		} else {
			// ajax 요청
			$.ajax({
				url: '/clist/save',
				method: 'POST',
				contentType: 'application/json',
				data: JSON.stringify({
					name: name,
					cname: cname,
					address: address,
					cn: cnumber,
					number: number
				}),
				success: function(response) {
					console.log(response); // 저장된 회사 정보 출력
				},
				error: function(error) {
					console.log(error);
				}
			});
			
			// 회사 정보 목록에 추가하기
			//$("#postList").append("<tr>"+"<td>"+cname+"</td>"+"</tr>");
			
			// 입력값 초기화
			$("#cname, #caddr, #cnumber, #number, #caddr_detail, #name").val('');
			
			// 모달 닫기
			$("#modal").attr("style", "display:none");
				}
			});
		});
	//주소 api
	$(document).ready(function() {
		$("#caddr").click(function() {
			
			new daum.Postcode({
				oncomplete: function(data) {
				$("#caddr").val(data.address);
				$("input[name=caddr_detail]").focus();
				}
			}).open();
		});
	});

	$(document).ready(function() {
	  // 게시글 목록 조회
	  $.ajax({
	    url: '/posts',
	    method: 'GET',
	    success: function(company) {
	      // 게시글 목록 출력
	      for (let i = 0; i < company.length; i++) {
	        $('#postList').append('<tr>'+'<td>' + company[i].cname + '</td>'+'</tr>');
	      }
	    }
	  });
	});
	
		
	

		
	