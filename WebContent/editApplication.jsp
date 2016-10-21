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
			<input type="text" name="statusId"
				value=<c:out value="${applicationStatus.statusid}" /> disabled>
			<input type="text" name="statusName"
				value=<c:out value="${applicationStatus.hczapplication.applicantname}" /> disabled>
			<input type="text" name="statusStatus"
				value=<c:out value="${applicationStatus.status}" /> disabled>
			<input type="text" name="statusNationality"
				value=<c:out value="${applicationStatus.nationality}" />>
			<input type="text" name="statusHistory"
				value=<c:out value="${applicationStatus.workhistory}" />>
			<input type="text" name="statusDegree"
				value=<c:out value="${applicationStatus.educationdegree}" />>
			<input type="text" name="statusPanel"
				value=<c:out value="${applicationStatus.standardpaneltest}" />>
			<input type="text" name="statusDot"
				value=<c:out value="${applicationStatus.dottest}" /> disabled>
			<input type="text" name="statusAlcohol"
				value=<c:out value="${applicationStatus.alcoholtest}" /> disabled>
			<input type="text" name="statusVeteran"
				value=<c:out value="${applicationStatus.veteran}" /> disabled>
			<input type="text" name="statusHrinterview"
				value=<c:out value="${applicationStatus.hrinterview}" /> disabled>
			<input type="text" name="statusSecondinterview"
				value=<c:out value="${applicationStatus.managerinterview}" /> disabled>
			<input type="text" name="statusGroupinterview"
				value=<c:out value="${applicationStatus.groupinterview}" /> disabled>
			<input type="text" name="statusTest"
				value=<c:out value="${applicationStatus.codingtest}" /> disabled>
			<input type="text" name="statusApproval"
				value=<c:out value="0" /> disabled>
			<input type="hidden" name="statusID"
				value=<c:out value="${applicationStatus.statusid}" />>
			<input type="hidden" name="action" value="update"> 
			<input type="submit" value="Update" id="submit">
		</form>

	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>