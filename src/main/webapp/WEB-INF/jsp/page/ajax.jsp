<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/interface/dwrService.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/page/ajax.js" />'></script>
<title>Spring MVC - DWR Integration Tutorial</title>
</head>
<body>

	<div>
		<div>DWR Add Two Numbers:</div>
		<input id="inputNumber1" type="text" size="5">
		+ 
		<input id="inputNumber2" type="text" size="5"> 
		<input type="button" value="dwr add value" id="addBtn" /> <br /> 
		Sum: <span id="sum">(Result will be shown here)</span>
	</div>
	<div>
		<div>jquery</div>
		<div>
			persionId<input type="text" id="persionId" name="persionId">
			<input type="button" value="query persion" id="queryPersionById" />
			<span id="queryPersion"></span>
		</div>
		<div>
			<form action="add" method="post">
				persionName<input type="text" id="personName" name="personName"> 
				<input type="button" value="add person" id="addPerson" />
				<span id="addPersonValue"></span>
			</form>
		</div>
		
		
	</div>
</body>
</html>