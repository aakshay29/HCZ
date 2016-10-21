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
								<form class="form-horizontal" action="ApplicationServlet" method="post">
							
									<div class="form-group">
									<br>
										<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Job ID</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="jobid" value = <%=request.getParameter("jobid") %>>
										</div>
									</div>
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Email</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="Emailinput" placeholder="Email">
										</div>
									</div>
									<div class="form-group">
										<label for="inputPassword" class="col-sm-2 control-label">Create a Password</label>
										<div class="col-sm-8">
											<input type="password" class="form-control1" name="inputPassword" placeholder="Password">
										</div>
									</div>
										<label for="focusedinput" class="col-sm-2 control-label">Your Name</label>
										<div class="col-sm-8">
											<input type="text" class="form-control1" name="Nameinput" placeholder="Enter Name">
										</div>
										
									</div>
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Address</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="Addressinput" placeholder="Address">
										</div>
									</div>
									
										<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">Birthday</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="Birthday" placeholder="dd-Mon-YYYY">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-2 control-label">Education</label>
										<div class="col-sm-8">
											<div class="checkbox-inline1"><label><input type="checkbox" name="Degree" value="Phd"> Phd/Doctorate</label></div>
											<div class="checkbox-inline1"><label><input type="checkbox" name="Degree" value="MBA"> MBA</label></div>
											<div class="checkbox-inline1"><label><input type="checkbox" name="Degree" value="Master"> Masters/M.s</label></div>
											<div class="checkbox-inline1"><label><input type="checkbox" name="Degree" value="Bachelor's"> Bachelors</label></div>
										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-2 control-label">Degree awarded</label>
										<div class="col-sm-8">
											<div class="checkbox-inline"><label><input type="checkbox"> Yes</label></div>
											<div class="checkbox-inline"><label><input type="checkbox"> No</label></div>
											
										</div>
									</div>
									
								
									
									
									<div class="form-group">
										<label for="txtarea1" class="col-sm-2 control-label">Roles and Responsibilities</label>
										<div class="col-sm-8"><textarea name="experience" id="txtarea1" cols="50" rows="4" class="form-control1"></textarea></div>
									</div>
									
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">1. Reference</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" name="FirstReference" placeholder="Email">
										</div>
									</div>
									<div class="form-group">
										<label for="focusedinput" class="col-sm-2 control-label">2. Reference</label>
										<div class="col-sm-8">
											<input type="text" type="text" class="form-control1" id="SecondRefrence" placeholder="Email">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-2 control-label">Veteran</label>
										<div class="col-sm-8">
											<div class="radio-inline"><label><input type="radio" name="VetStatus" value="Yes"> Yes</label></div>
											<div class="radio-inline"><label><input type="radio" name="VetStatus" value="No"> No</label></div>
											
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-2 control-label">US National/Citizen</label>
										<div class="col-sm-8">
											<div class="radio-inline"><label><input type="radio" name="Citizen" value="Yes"> Yes</label></div>
											<div class="radio-inline"><label><input type="radio" name="Citizen" value="No"> No</label></div>
											
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-2 control-label">Drug Addictions</label>
										<div class="col-sm-8">
											<div class="radio-inline"><label><input type="radio" name="DrugAddictions" value="Yes"> Yes</label></div>
											<div class="radio-inline"><label><input type="radio"name="DrugAddictions" value="No"> No</label></div>
											
										</div>
									</div>
										<center>		  
											<input type="submit" value="Submit Application"/>
												</center>
									</form>
							</div>
						</div>	
					
					
		</body>
		</html>
<jsp:include page="footer.jsp"></jsp:include>