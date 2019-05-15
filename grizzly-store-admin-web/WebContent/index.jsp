<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Grizzly Store</title>
<link rel="stylesheet" href="./css/index.css">
<link rel="stylesheet" href="./css/bootstrap.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</head>
<body>
<img alt="" src="./img/logo.PNG" class="center">
<form method="post" action="/grizzly-store-admin-web/LoginController">
<div class="text-center">
<input type="text" name="userName" placeholder="Username" class="in" required/><br/>
<input type="password" name="password" placeholder="Password" class="in" required/><br/>
<button type="submit" class="login btn btn-lg btn-primary " >Login</button>
</div>
</form>
</body>
</html>