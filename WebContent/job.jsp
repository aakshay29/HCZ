<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<title></title>
<jsp:include page="header.jsp"></jsp:include>
</head>
<body>
<center>
	
						
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<tr>
					<th>Job</th>
					<th>JobStatus</th>
					
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="job" items="${jobs}">
					<tr>
						
					
						<td><h1 id="h5.-bootstrap-heading"><c:out value="${job.jobname}" /><a class="anchorjs-link" href="#h1.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h1>
						<p1><c:out value="${job.jobdescription}" /></p1></td>
						<c:if test="${job.jobstatus == 0}" >
						<td><h1 id="h6.-bootstrap-heading">Closed<a class="anchorjs-link" href="#h1.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h1></td>
						</c:if>
						<c:if test="${job.jobstatus == 1}" >
						<td><h1 id="h6.-bootstrap-heading"><a href="jobapplication.jsp?jobid=${job.jobid}"> Open </a> </h1>
						<input type="hidden" name="jobid" value="${job.jobid}">
						<p1>Click to Apply</p1></td>
						</c:if>
							
						
					</tr>
				</c:forEach>
			</tbody>
		</table>

</center>


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>