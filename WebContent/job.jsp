<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Business Strategy a Corporate Business Category Bootstrap Responsive Website Template | Typography :: w3layouts</title>  
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" /><!-- fontawesome -->     
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all" /><!-- Bootstrap stylesheet -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" /><!-- stylesheet -->
<!-- meta tags -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Business Strategy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //meta tags -->
<!--fonts-->
<link href="//fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i&subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Philosopher" rel="stylesheet">
<!--//fonts-->
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script><!-- Required-js -->
<script src="js/bootstrap.min.js"></script><!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->	 
<!-- scriptfor smooth drop down-nav -->
<script>
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
<!-- //script for smooth drop down-nav -->
</head>
<jsp:include page="header.jsp"></jsp:include>
<div class="wthree-main-content">
	<!-- Typography -->
	<div class="agileits typography">
		<div class="container">
			<h2 class="agile-inner-title">Short Codes</h2>
			<div class="typo-grid">
				<div class="typo-1">
					<div class="grid_3 grid_4">
						<h3 class="head-top">Headings</h3>
						<div class="bs-example">
							<table class="table">
								<tbody>
								      <thead>
       								 <tr><th>Job Name</th><th>Status</th></tr></thead>
									<tr>
										<c:forEach var="job" items="${jobs}"/> 
										<td><h1 id="h1.-bootstrap-heading">1.<c:out value="${job.jobname}"/><a class="anchorjs-link"href="#h1.-bootstrap-heading">
										<span class="anchorjs-icon"></span></a></h1>    
										<p1> </p1></td>
											<td><h1 id="h1.-bootstrap-heading">1.<c:out value="${job.Status}"/><a class="anchorjs-link"href="#h1.-bootstrap-heading">
										<span class="anchorjs-icon"></span></a></h1>    
										<p1> </p1></td>
										
									</tr>
									

									
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>