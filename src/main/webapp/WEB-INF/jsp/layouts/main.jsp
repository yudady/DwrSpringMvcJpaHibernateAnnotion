<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href='<c:url value="/resources/css/main.css" />' type="text/css" />
	<link rel="stylesheet" href='<c:url value="/resources/css/blueprint/screen.css" />' type="text/css" media="screen, projection">
	<link rel="stylesheet" href='<c:url value="/resources/css/blueprint/print.css" />' type="text/css" media="print">
	<!--
	[if lt IE 8]>
		<link rel="stylesheet" href="<c:url value="/resources/blueprint/ie.css" />" type="text/css" media="screen, projection">
	<![endif]
	-->
	<link rel="stylesheet" href='<c:url value="/" /><spring:theme code="css"/>' type="text/css" />
	
	<script type="text/javascript" src='<c:url value="/resources/js/common/jquery-1.4.min.js" />'></script>
	<script type="text/javascript" src='<c:url value="/resources/js/common/jquery.log.js" />'></script>
	<script type="text/javascript" src='<c:url value="/resources/js/common/json.min.js" />'></script>
	
	<title><tiles:getAsString name="title" /></title>
</head>
<body>

	<div id="header-tiles">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="body-tiles">
		<div id="menu-tiles">
			<tiles:insertAttribute name="menu" />
		</div>
		<div id="content-tiles">
			<c:url value="/" />
			<br />
			<spring:theme code="css" />
			<br />
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<div id="footer-tiles">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>