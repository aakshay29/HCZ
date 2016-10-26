<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Group Interview Answers</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>

	<div class="tab-content">

		<div class="tab-pane active" id="horizontal-form">
			<br />
			<div class="form-group">
				<label for="focusedinput" class="col-sm-2 control-label"></label> <label
					for="focusedinput" class="col-sm-2 control-label">${currentApplication}</label>
			</div>
			<br /> <br /> <br />
			<table class="table table-bordered table-striped table-hover">
				<thead>
					<tr>
						<th>Question</th>
						<th>Answer</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="groupAnswerList" items="${groupAnswerList}">
						<tr>
							<td>${groupAnswerList.hczinterviewquestion.question}</td>
							<td>${groupAnswerList.answer}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>