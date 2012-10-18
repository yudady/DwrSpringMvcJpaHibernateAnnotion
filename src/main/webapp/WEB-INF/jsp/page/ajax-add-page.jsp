<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type='text/javascript' src='<c:url value="/dwr/engine.js"/>'></script>
<script type='text/javascript' src='<c:url value="/dwr/util.js"/>'></script>
<script type='text/javascript'
	src='<c:url value="/dwr/interface/dwrService.js"/>'></script>

<title>Spring MVC - DWR Integration Tutorial</title>
</head>
<body>

	<p>Locale = ${pageContext.response.locale}</p>
	<div>Spring MVC - DWR Integration Tutorial</div>
	<div>AJAX version</div>
	<div>Demo 1</div>

	<div style="border: 1px solid #ccc; width: 250px;">
		Add Two Numbers: <br /> <input id="inputNumber1" type="text" size="5">
		+ <input id="inputNumber2" type="text" size="5"> <input
			type="submit" value="Add" onclick="add()" /> <br /> Sum: <span
			id="sum">(Result will be shown here)</span>
	</div>

	<script type="text/javascript">
		// Retrieves the matching value
		// Delegates to the dwrService
		function add() {
			// Retrieve value of text inputs
			var operand1 = dwr.util.getValue("inputNumber1");
			var operand2 = dwr.util.getValue("inputNumber2");

			// Pass two numbers, a callback function, and error function
			dwrService.add(operand1, operand2, {
				callback : handleAddSuccess,
				errorHandler : handleAddError
			});
		}

		// data contains the returned value
		function handleAddSuccess(data) {
			// Assigns data to result id
			dwr.util.setValue("sum", data);
		}

		function handleAddError() {
			// Show a popup message
			alert("We can't add those values!");
		}
	</script>

</body>
</html>