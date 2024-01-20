package com.web.model;

public class BankTransactions
{
	private double depositamount;
	private double withdrawamount;
	private double transferamount;
	private long accountno2;
	private String confirmpsw;
	private int accountactivation;
	public BankTransactions() {
		super();
	}
	public BankTransactions(double depositamount, double withdrawamount, double transferamount,
			long accountno2, String confirmpsw, int accountactivation) {
		super();
		this.depositamount = depositamount;
		this.withdrawamount = withdrawamount;
		this.transferamount = transferamount;
		this.accountno2 = accountno2;
		this.confirmpsw = confirmpsw;
		this.accountactivation = accountactivation;
	}
	public double getDepositamount() {
		return depositamount;
	}
	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}
	public double getWithdrawamount() {
		return withdrawamount;
	}
	public void setWithdrawamount(double withdrawamount) {
		this.withdrawamount = withdrawamount;
	}
	public double getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(double transferamount) {
		this.transferamount = transferamount;
	}
	public String getConfirmpsw() {
		return confirmpsw;
	}
	public void setConfirmpsw(String confirmpsw) {
		this.confirmpsw = confirmpsw;
	}
	public int getAccountactivation() {
		return accountactivation;
	}
	public void setAccountactivation(int accountactivation) {
		this.accountactivation = accountactivation;
	}
	
	public long getAccountno2() {
		return accountno2;
	}
	public void setAccountno2(long accountno2) {
		this.accountno2 = accountno2;
	}
	@Override
	public String toString() {
		return "BankTransactions [depositamount=" + depositamount + ", withdrawamount=" + withdrawamount
				+ ", transferamount=" + transferamount + ", accountno2=" + accountno2 + ", confirmpsw=" + confirmpsw
				+ ", accountactivation=" + accountactivation + "]";
	}
	
	

	
}
