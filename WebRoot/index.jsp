<%@ page language="java" import="java.util.*" pageEncoding="ISO8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="./js/tools.js"></script>
	<script type="text/javascript">
		
		$(function() {
			var res = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
			alert(Verification(res, "1@11.aan"));
		});
	</script>
  </body>
</html>
