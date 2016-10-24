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
						
						<td><c:out value="${applicationStatusList.statusid}" /></td>
						<td><c:out value="${applicationStatusList.hczapplication.applicantname}" /></td>
						<td><c:out value="${applicationStatusList.status}" /></td>
						<c:choose>
						  <c:when test="${applicationStatusList.nationality == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.nationality == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.workhistory == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.workhistory == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.educationdegree == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.educationdegree == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.standardpaneltest == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.standardpaneltest == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.dottest == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.dottest == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.alcoholtest == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.alcoholtest == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.veteran == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.veteran == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.hrinterview == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.hrinterview == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.managerinterview == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.managerinterview == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.groupinterview == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.groupinterview == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<c:choose>
						  <c:when test="${applicationStatusList.codingtest == 1}">
						    <td bgcolor="00e64d"> <font color="white">Pass</font> </td>
						  </c:when>
						  <c:when test="${applicationStatusList.codingtest == 0}">
						    <td bgcolor="ff4d4d"> <font color="white">Fail</font> </td>
						  </c:when>
						  <c:otherwise>
						    <td bgcolor="8080ff"> <font color="white">Invalid</font> </td>
						  </c:otherwise>
						</c:choose>
						<td>
						<form action="EditServlet" method="post">
							<input type="hidden" name="statusID" value=<c:out value="${applicationStatusList.statusid}" />> 
							<input type="hidden" name="action" value="ASL"> 
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