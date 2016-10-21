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
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Job ID</th>
					<th>Name</th>				
					<th>Address</th>
					<th>Birthday</th>
					<th>Education</th>
					<th>References</th>
					<th>Resume</th>
					<th>History</th>
					<th>Citizen</th>
					<th>Drug User</th>
					<th>Veteran</th>
					<th>Edit</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="applicationList" items="${applicationList}">
					<tr>
						<td><c:out value="${applicationList.applicationid}" /></td>
						<td><c:out value="${applicationList.hczjob.jobid}" /></td>
						<td><c:out value="${applicationList.applicantname}" /></td>					
						<td><c:out value="${applicationList.address}" /></td>
						<td><c:out value="${applicationList.birthday}" /></td>
						<td><c:out value="${applicationList.education}" /></td>
						<td><c:out value="${applicationList.empreferences}" /></td>
						<td><c:out value="${applicationList.empresume}" /></td>
						<td><c:out value="${applicationList.jobhistory}" /></td>
						<td><c:out value="${applicationList.citizen}" /></td>
						<td><c:out value="${applicationList.druguser}" /></td>					
						<td><c:out value="${applicationList.veteran}" /></td>
						<td>
						<form action="EditServlet" method="post">
							<input type="hidden" name="applicationID" value=<c:out value="${applicationList.applicationid}" />> 
							<input type="hidden" name="action" value="AL"> 
							<input type="submit" value="Edit" id="submit">
						</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>