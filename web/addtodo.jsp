<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>
<h1>Struts html:text example</h1>

<html:form action="/addTodo">
	<div style="color:red">
		<html:errors/>
	</div>
	<div>
		Content : <html:text property="content" size="20" maxlength="20" />
		Date : <html:text property="date" size="20" maxlength="20" />
	</div>

	<div style="padding:16px">
		<html:submit>Add Todo</html:submit>
	</div>

</html:form>
<div class="container">
	<div class="row">
		<div class='col-sm-6'>
			<div class="form-group">
				<div class='input-group date' id='datetimepicker1'>
					<input type='text' class="form-control" />
					<span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$(function () {
				$('#datetimepicker1').datetimepicker();
				alert("hi");
			});
		</script>
	</div>
</div>
</body>
</html>