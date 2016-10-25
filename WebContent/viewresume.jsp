<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>

  <div class="tab-content">
  				
							<div class="tab-pane active" id="horizontal-form">
								<form class="form-horizontal" action="" method="post">
							
									<div class="form-group">
									<br>
										<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Name</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("name") %> readonly>
										</div>
									</div>
								
								<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Objective</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("objective") %> readonly>
										</div>
									</div>
									
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Summary</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("summary") %> readonly>
										</div>
									</div>
									
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Skills</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("skills") %> readonly>
										</div>
									</div>
									
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Education</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("Degree") %> readonly>
										</div>
									</div>
									
									
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Work Experience</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("experience") %> readonly>
										</div>
									</div>
								
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">reference</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="name" value = <%=request.getParameter("FirstReference") %> readonly>
										</div>
									</div>
									
									</div>
										<center>		  
									
												</center>
									</form>
							</div>
						</div>	
					
					
		</body>
		</html>
<jsp:include page="footer.jsp"></jsp:include>