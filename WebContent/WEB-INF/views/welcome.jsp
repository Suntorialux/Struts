<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="custom.tld" prefix="myTag"%>


<html:html>
<head>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		Hello!<bean:write name="loginForm" property="login" />
		<myTag:reservation></myTag:reservation>
		
		<h3>
			ReservationCode: ${reservation}
			ReservationDescription: ${reservation}
		</h3>
	</div>
</body>
</html:html>