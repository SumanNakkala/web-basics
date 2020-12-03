<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> LOGIN SERVLET..!!</h1>


<form action="/hello" method="POST">

Name : <input type="text" name="name"/>

<br/>

PAssword : <input type ="password" name ="password"/>

<input type ="submit" value="LOGIN--->">

</form>


Hello welcome ${user}
</body>
</html>