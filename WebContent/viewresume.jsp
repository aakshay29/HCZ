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
  				
			
				
					<h1 id="h5.-bootstrap-heading"><class="head-top">Resume</h1>
					<h3> <div class="but_list">
					   <div class="well">
					   
					   		${profile.username} <br>
							${profile.email} <br>
							${profile.objective} <br>
							${profile.usersummary} <br>
							${profile.education} <br>
							${profile.experience} <br>
							${profile.skills} <br>
							${profile.firstreference}<br>
							${profile.secondreference}<br>
							
					   </div>
					   </div></h3>
					 <form action ="job.jsp" method="post">
					<input type ="submit" value="Apply Jobs">
					<input type ="hidden" name="action" value="${profile.userid}">
					</form>
		</body>
		</html>
<jsp:include page="footer.jsp"></jsp:include>