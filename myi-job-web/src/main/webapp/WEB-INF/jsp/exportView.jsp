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
		$("#exportF").submit();
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

</body>
</html>