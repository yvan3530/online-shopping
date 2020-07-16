<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />



<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - ${title}</title>

<script>
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${ css}/myapp.css" rel="stylesheet">

</head>

<body>


	<div class="wrapper">

		<!--navbar  -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- page content -->

		<div class="content">
			<!-- loading the home content  -->
			<c:if test="${userClientHome == true }">
				<%@include file="home.jsp"%>>
 </c:if>

			<!-- only if the u click about  -->
			<c:if test="${userClientAbout == true }">
				<%@include file="about.jsp"%>>
 </c:if>

			<!-- only if the u click contact  -->
			<c:if test="${userClientContact == true }">
				<%@include file="contact.jsp"%>>
 </c:if>
 
 
 		<!-- only if the u click contact  -->
			<c:if test="${userClientAllProducts == true or userClientCategoryProducts== true}">
				<%@include file="listProducts.jsp"%>>
 </c:if>

		</div>
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
