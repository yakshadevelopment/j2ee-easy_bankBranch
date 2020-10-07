<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Branch</h1>  
       <form:form method="post" action="save-branch"  modelAttribute="bankRecord">  
        <form:hidden path="branchId" value="0"/>  
      
<br/><br/>
*Enter Branch Name:<form:input path="branchName"/>   
<br/><br/>
*Enter Branch Address:<form:input path="branchAddress"/>   
<br/><br/>
<input type="submit" value="submit"/> 
          </form:form>
</body>
</html>