<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<center>  
<h1 Style="color:brown">Student Details</h1>  
<table border="2" width="100%" cellpadding="2">  
<tr  Style="color:red">
    <th> Account Number</th>
    <th> Name</th>
    <th>Password</th>
    <th>Confirm Password</th>
    <th>Amount</th>
    <th>Address</th>
    <th>Mobile Number</th>
    	<th>Edit</th>
       <th>Delete</th>
    </tr>
   <c:forEach var="bank" items="${banks}">   
   <tr>  
   <td>${bank.accountno}</td>  
   <td>${bank.name}</td>  
   <td>${bank.password}</td>  
   <td>${bank.confirmpassword}</td>  
   <td>${bank.amount}</td> 
   <td>${bank.address}</td>
   <td>${bank.mobileno}</td>

   <td><a href ="/update/${bank.accountno}">Edit</a></td>
   <td><a href ="/delete/${bank.accountno}">Delete</a></td>
    </tr>  
   </c:forEach>  
   </table>  
   <br/> 
   </center> 
   </body>