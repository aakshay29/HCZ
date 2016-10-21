<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application List</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<form action="UpdateServlet" method="post">
			ID: <input type="text" name="statusId"
				value="<c:out value="${applicationStatus.statusid}" />"readonly>
			<br />
			<br />Name: <input type="text" name="statusName"
				value="<c:out value="${applicationStatus.hczapplication.applicantname}" />"readonly> <br />
			<br />Status: <input type="text" name="statusStatus"
				value="<c:out value="${applicationStatus.status}" />"readonly>
			<br />
			<br />Nationality: <input type="text" name="statusNationality"
				value="<c:out value="${applicationStatus.nationality}" />"readonly>
			<br />
			<br />Work History: <input type="text" name="statusHistory"
				value="<c:out value="${applicationStatus.workhistory}" />"readonly>
			<br />
			<br />Education: <input type="text" name="statusDegree"
				value="<c:out value="${applicationStatus.educationdegree}" />"readonly>
			<br />
			<br />Panel Test: <input type="text" name="statusPanel"
				value="<c:out value="${applicationStatus.standardpaneltest}" />"readonly>
			<br />
			<br />DOT Test: <input type="text" name="statusDot"
				value="<c:out value="${applicationStatus.dottest}" />"readonly> <br />
			<br />Alcohol Test: <input type="text" name="statusAlcohol"
				value="<c:out value="${applicationStatus.alcoholtest}" />"readonly>
			<br />
			<br />Veteran: <input type="text" name="statusVeteran"
				value="<c:out value="${applicationStatus.veteran}" />"> 
			<br />
			<br />HR Interview: <input type="text" name="statusHrinterview"
				value="<c:out value="${applicationStatus.hrinterview}" />"readonly>
			<br />
			<br />Manager Interview: <input type="text"
				name="statusSecondinterview"
				value="<c:out value="${applicationStatus.managerinterview}" />"readonly> 
			<br />
			<br />Group Interview: <input type="text" name="statusGroupinterview"
				value="<c:out value="${applicationStatus.groupinterview}" />"readonly> 
			<br />
			<br />Test: <input type="text" name="statusTest"
				value="<c:out value="${applicationStatus.codingtest}" />"readonly>
			<br />
			<br />Approve: <input type="text" name="statusApproval"
				value="<c:out value="0" />"> <input type="hidden"
				name="action" value="update"> <input type="submit"
				value="Update" id="submit">
		</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>