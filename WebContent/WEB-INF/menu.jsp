<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Part 3</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css">
</head>
<body>
	<ul id="menu">
		<li><a id="menu_Search" href="Search">Otsi</a></li>
		<li><a id="menu_Add" href="Add">Lisa</a></li>
		<li><a id="menu_ClearData" href="Delete?id=all">Tühjenda</a></li>
		<li><a id="menu_InsertData" href="InsertSamples">Sisesta näidisandmed</a></li>
	</ul>
</body>
</html>