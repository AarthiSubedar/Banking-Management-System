
<!DOCTYPE html>
<html>
<head>
<style>
	body 
		{
		font-family: Arial, Helvetica, sans-serif;
		margin-left:25%;
		margin-right:25%;
		border: 1px solid #000000;
		margin-bottom: 5px;
		padding: 0px 15px 0 15px;
		}
	input[type=text], input[type=password] 
		{
		width: 97%;
		padding: 10px;
		margin: 5px 0 22px 0;
		display: inline-block;
		border: none;
		background: #F5F5F5;
		}
	hr 
		{
		border: 1px solid #e6e6e6;
		margin-bottom: 5px;
		}
	.registerbutton
		{
		
		background-color: midnightblue;
		color: white;
		padding: 15px 20px;
		margin: 10px 0px;
		border: none;
		cursor: pointer;
		width: 100%;
		text:bold;
		}
		
		h1{
		color:midnightblue;
		}
		<style>
		body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
  background-color:white;
  overflow: hidden;
}

.topnav {
    margin: auto;
    width: 100%;
  overflow: hidden;
  background-color:white;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 12px 14px;
  text-decoration: none;
  font-size: 16px;
}

.topnav a:hover {
  background-color:midnightblue ;
  color:white;
}

.topnav a {
  background-color:white;
  color: midnightblue;
}

		

</style>
</head>
<body>
<div class="topnav">
		 <a href="/">Home</a>
  <a href="/add">New Account</a>
  <a href="/balance">Balance</a>
  <a href="/deposit">Deposit</a>
  <a href="/withdraw">Withdraw</a>
  <a href="/transfer">Transfer</a>
  <a href="/closeaccount">Close Account</a>
  <a href="/aboutus">About Us</a>
  </div>
	<form action="/closeoneaccount">
		<h1>Close Account Form</h1>
		<hr>
		
		<label for="number"><b>Account Number</b></label>
		<input type="text" placeholder="Enter Account Number" name="accountno" required><br>
		
		<label for="name"><b> Name</b></label>
		<input type="text" placeholder="Enter Your Name" name="name" required><br>
		
		<label for="password"><b>Password</b></label> 
		<input type="password" placeholder="Enter Password" name="password" required><br>
		
		<hr>
		<button type="submit" class="registerbutton">Submit</button>
		
	</form>


</body>
</html>
