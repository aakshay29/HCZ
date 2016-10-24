<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<title></title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
	<center>
		<h1 id="h6.-bootstrap-heading">
			Please Enter your confirmation number to check the status of your application<a class="anchorjs-link"
				href="#h1.-bootstrap-heading"><span class="anchorjs-icon"></span></a>
		</h1>
		<br>
		<form action= "CheckStatusServlet" method="post">
		<h1 id="h6.-bootstrap-heading">
			<input type="text" name="confirmation" id="confirmation"/>
			<input type ="submit" value="submit"/> 
			<a class="anchorjs-link" href="#h1.-bootstrap-heading"><span
				class="anchorjs-icon"></span></a>
		</h1>
		<p1>Wish you all the best on your application</p1>
		

</form>

	</center>


	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>