<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Branch List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Branch Code</th><th>Branch Name</th><th>Address</th>
</tr>  
   <c:forEach var="branch" items="${branchList}">   
   <tr>  
   <td>${branch.branchId}</td>  
   <td>${branch.branchName}</td>  
   <td>${branch.branchAddress}</td>  
    </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="index.jsp">return</a>  
</body>
</html>