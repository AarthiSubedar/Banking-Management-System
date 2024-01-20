package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
@Id
private long accountno;
private String name;
private String password;
private String confirmpassword;
private double amount;
private String address;
private long mobileno;
private int status;
public Bank() {
	super();
}
public Bank(long accountno, String name, String password, String confirmpassword, double amount, String address,
		long mobileno,int status) {
	super();
	this.accountno = accountno;
	this.name = name;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.amount = amount;
	this.address = address;
	this.mobileno = mobileno;
	this.status=status;
}
public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getMobileno() {
	return mobileno;
}
public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
@Override
public String toString() {
	return "Bank [accountno=" + accountno + ", name=" + name + ", password=" + password + ", confirmpassword="
			+ confirmpassword + ", amount=" + amount + ", address=" + address + ", mobileno=" + mobileno + ", status="
			+ status + "]";
}

}
