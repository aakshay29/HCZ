<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HR Interview Form</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>

	<div class="tab-content">

		<div class="tab-pane active" id="horizontal-form">
			<br/>
			<div class="form-group">
				<label for="focusedinput" class="col-sm-2 control-label"></label>
				<label for="focusedinput" class="col-sm-2 control-label">${currentApplication}</label>
			</div>
			<br/>
			<br/>
			<br/>
			<form class="form-horizontal" action="InputAnswerServlet" method="post">
				<c:forEach var="hrQuestionList" items="${hrQuestionList}">
					<div class="form-group">
						<label for="focusedinput" class="col-sm-2 control-label">${hrQuestionList.question}</label>
						<div class="col-sm-6">
							<textarea class="form-control1"
								name="Answer${hrQuestionList.interviewquestionid}"></textarea>
						</div>
					</div>
				</c:forEach>
				<center>
					<input type="hidden" name="action" value="hrInput"> 
					<input type="submit" value="Submit" />
				</center>
			</form>
			<br/>
		</div>
	</div>


</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>
