<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Application Status List</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Status</th>
					<th>Nationality</th><!-- YN -->
					<th>History</th><!-- YN -->
					<th>Reference</th><!-- YN -->
					<th>Degree</th><!-- YN -->
					<th>Health Panel</th><!-- YN -->
					<th>Health DOT</th><!-- YN -->
					<th>Health Alcohol</th><!-- YN -->
					<th>Veteran</th><!-- YN -->
					<th>HR Interview</th><!-- Scheduled, Next, Reject -->
					<th>Second Interview</th><!-- Scheduled, Next, Reject -->
					<th>Group Interview</th><!-- Scheduled, Next, Reject -->
					<th>Test</th><!-- PF -->
					<th>Edit</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="applicationStatusList" items="${applicationStatusList}">
					<tr>
						<c:choose>
						  <c:when test="${applicationList.applicationid == 1}">
						    do something
						  </c:when>
						  <c:when test="${another boolean expr}">
						    do something else
						  </c:when>
						  <c:otherwise>
						    do this when nothing else is true
						  </c:otherwise>
						</c:choose>
						<td><c:out value="${applicationStatusList.statusid}" /></td>
						<td><c:out value="${applicationStatusList.hczjob.jobid}" /></td>
						<td><c:out value="${applicationStatusList.applicantname}" /></td>
						<td><c:out value="${applicationStatusList.hczapplicationstatuses.status}" /></td>
						<td><c:out value="${applicationStatusList.address}" /></td>
						<td><c:out value="${applicationStatusList.birthday}" /></td>
						<td><c:out value="${applicationStatusList.education}" /></td>
						<td><c:out value="${applicationStatusList.empreferences}" /></td>
						<td><c:out value="${applicationStatusList.empresume}" /></td>
						<td><c:out value="${applicationStatusList.jobhistory}" /></td>
						<td><c:out value="${applicationStatusList.citizen}" /></td>
						<td><c:out value="${applicationStatusList.druguser}" /></td>					
						<td><c:out value="${applicationStatusList.veteran}" /></td>
						<td>
						<form action="EditApplicationServlet" method="post">
							<input type="hidden" name="applicationID"value=<c:out value="${applicationList.applicationID}" />> 
							<input type="hidden" name="action" value="edit"> 
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