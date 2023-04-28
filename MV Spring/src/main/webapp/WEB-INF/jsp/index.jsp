<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<%---<% String name=request.getAttribute("name").toString();
String sname=request.getAttribute("sname").toString();
String age=request.getAttribute("age").toString();



Registration form 

<!--  <form action="#" method="post">
<input type="text" name="name" id="t1" value="<<%= name%>"><br>
<input type="text" name="sname" id="t2" value="<%= sname%>"><br>
<input type="text" name="age" id="t3" value="<%= age%>"><br>
<input type="submit" name="btn" id="t4" ><br> 


</form>-->
--%>
<hr>



Registration form 

<form action="ok" method="post">
<input type="text" name="name" id="t1" value="${name}"><br>
<input type="text" name="sname" id="t2" value="${sname}"><br>
<input type="text" name="age" id="t3" value="${age}"><br>
<input type="submit" name="btn" id="t4" ><br> 


</form>


${name}
${sname}
${age}
</body>
</html>