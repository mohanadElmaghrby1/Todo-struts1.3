<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>
<h1>Todos</h1>
<% for(int i = 0 ; i <10 ; ++i){
	out.write(i+"\n");
} %>
</body>
</html>