<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导出excel</title>
<script type="text/javascript" src="../static/js/jquery.js"></script>

<script type="text/javascript">
$(function() {
	$("#export").click(function() {
		// $("#exportF").submit();
		var id = $("#id").val();
		var username = $("#username").val();
		var remark = $("#remark").val();
		
		var obj = {
				"id" : id,
				"username" : username,
				"remark" : remark
		}
		
		var json = JSON.stringify(obj);
		location.href = "user/view?json=" + json;
		
		/* $.ajax({
			type: 'get',
            url: 'user/view',
            data: JSON.stringify(obj),
            cache: false,
            contentType: 'application/json',
            dataType: 'json',
            success: function (o) {
                alert(o);
            },
            error:function(){
            	alert("error");
            },
            async: true,
            complete:function(){
                nowPage = 1;
            }
		}); */
	});
	
	$("#exprotBtn").click(function() {
		$("#exportWithView").submit();
	});
});
</script>
</head>
<body>

	<form action="./user/view" method="post" id="exportF">
	ID：<input type="text" id="id" /><br/>
	名称：<input type="text" id="username" /><br/>
	备注：<input type="text" id="remark" /><br/>
	<input id="export" type="button" value="提交" />
	</form>
	
	<form action="./userWithSpringView" method="post" id="exportWithView">
		<button id="exprotBtn">导出</button>
	</form>

</body>
</html>