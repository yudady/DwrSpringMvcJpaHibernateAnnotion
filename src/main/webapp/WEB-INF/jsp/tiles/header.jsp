<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div>
		
		 
		
		<ul>
			<li>
				<div>
					<span>語系</span>
					<span>Locale = ${pageContext.response.locale}<br /> </span>
				</div>
				<span><a href="?locale=en_us">us</a></span>| 
				<span><a href="?locale=en_gb">gb</a></span>| 
				<span><a href="?locale=es_es">es</a></span>|
				<span><a href="?locale=de_de">de</a></span>
				<div>
					<span>fmt:message key="welcome.title" </span>
					<span><fmt:message key="welcome.title" /></span>
				</div>
			</li>
			<li>
				<span>皮膚</span>
				<span><a href="?theme=default">def</a> 	| 	</span>
				<span><a href="?theme=black">blk</a>	| 	</span>
				<span><a href="?theme=blue">blu</a>			</span>
			</li>
		</ul>
	</div>
	<div>
		<span>request.getContextPath() =></span> <span><%=request.getContextPath()%></span>
	</div>
	<div>
		<a href="console">資料庫</a>
	</div>

</body>
</html>