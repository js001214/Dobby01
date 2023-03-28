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
	//회사 정보 등록 
	$(document).ready(function() {
	$("#company_save").click(function() {
		
		var name=$('#name').val();
		var cname=$('#cname').val();
		var address=$('#caddr'+'_'+'#caddr_detail').val();
		var cnumber=$('#cnumber').val();
		var number=$('#number').val();

		if(cname.length==0 || caddr.length==0 || cnumber.length==0 || number.length==0){
			alert('데이터를 입력하셔야 합니다.');
			
		}else{
        
        // ajax 요청
        $.ajax({
    		url: '/clist/save',
    		method: 'POST',
    		contentType: 'application/json',
    		data: JSON.stringify({
				name: $('#name').val(),//이름
        		cname: $('#cname').val(),//회사명
        		address: $('#caddr'+'_'+'#caddr_detail').val(),//주소
       			cn: $('#cnumber').val(), //사업자등록번호
       			number: $('#number').val() //전화번호
    		}),
    		success: function(response) {
        	console.log(response); // 저장된 회사 정보 출력
    		},
    		error: function(error) {
        		console.log(error);
    		}
			});

			
			
			$("#modal").attr("style", "display:none");
			$(".company_board").append("<div>"+cname+"</div>");
			$("#cname").val('');
  			$("#caddr").val('');
  			$("#cnumber").val('');
  			$("#number").val('');
  			$("#caddr_detail").val('');
  			$("#name").val('');
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
	
	