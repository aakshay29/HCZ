<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HR Login</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="grid_3 grid_5">
		<div class="tab-content">
			<div class="tab-pane active" id="horizontal-form">
				<form class="form-horizontal" action="LoginServlet" method="post">
					<div class="form-group">
						<label for="focusedinput" class="col-sm-2 control-label">User name</label>
						<div class="col-sm-4">
							<input type="text" class="form-control1" name="username">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword" class="col-sm-2 control-label">Password</label>
						<div class="col-sm-4">
							<input type="password" class="form-control1" name="password">
						</div>
					</div>
					<div class="form-group">
						<label for="inputPassword" class="col-sm-2 control-label"></label>
						<div class="col-sm-4">
							<input type="submit" value="Sign In" value="Sign In">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>