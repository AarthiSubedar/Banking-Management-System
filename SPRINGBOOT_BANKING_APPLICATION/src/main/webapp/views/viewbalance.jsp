<center>
<html>
<head>
<body>

 <a href="/add">New Account</a>
  <a href="/balance">Balance</a>
  <a href="/deposit">Deposit</a>
  <a href="/withdraw">Withdraw</a>
  <a href="/transfer">Transfer</a>
  <a href="/closeaccount">Close Account</a>
  <a href="/aboutus">About Us</a>
<h1>View Balance</h1>
<table border="2" width="50%" cellpadding="2">  
<tr  Style="color:red">
    <th> Account Number</th>
    <th>User Name</th>
   	<th>Amount</th>
   	<th>Address</th>
    </tr>
    
    <tr>
   <td>${b.accountno}</td>  
   <td>${b.name}</td>  
   <td>${b.amount}</td>  
   <td>${b.address}</td>
   </tr>
</table>

</body>
</head>
</html>
</center>