<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href='<c:url value="/resources/css/simpletree/simpletree.css" />' type="text/css">
	<script type="text/javascript" src='<c:url value="/resources/js/simpletree/simpletree.js" />'></script>


</head>
<body>
<div id="menuBar">
	noData
	<script type="text/javascript">
			$.ajax({
				type : "POST",
				url : '<c:url value="/" />ajax/menuBar',
				success : function(data) {
					$('#menuBar').html(data);
					ddtreemenu.createTree("treemenu1", true);
					ddtreemenu.createTree("treemenu2", false);
				}
			});
	</script>
</div>

</body>
</html>