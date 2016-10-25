<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
								<form class="form-horizontal" action="ApplicationServlet" method="post">
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Willing to relocate?</label>
										<div class="col-sm-8">
											<textarea class="form-control1" name="hriRelocate"> </textarea>
										</div>
									</div>
									<center>		  
										<input type="submit" value="Submit"/>
									</center>
									</form>
							</div>
						</div>	
					
					
		</body>
		<jsp:include page="footer.jsp"></jsp:include>
		</html>
