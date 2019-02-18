<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/index.html" method="post">
	<div> 
		<label for="userCode">用户名：</label>
		<input type="text" class="input-text" id="userCode" name="userCode" placeholder="请输入用户名" required/>
	 </div>
	 <div>
	 	<label for="userPassword">密码：</label>
	 	<input type="password" id="userPassword" name ="userPassword" placeholder="请输入密码" required />
	 </div>
	 <div>
	 	<input type="submit" value="登陆" />
	 	<input type="reset" value="重置" />
	 </div>
	 
	 </form>
	

</body>
</html>