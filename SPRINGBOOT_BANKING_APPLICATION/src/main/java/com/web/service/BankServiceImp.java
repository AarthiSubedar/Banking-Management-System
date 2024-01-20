package com.web.service;


import java.util.NoSuchElementException;
import java.util.Optional;

import org.eclipse.jdt.internal.compiler.ast.ContinueStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.web.model.Bank;
import com.web.model.BankTransactions;

import com.web.repo.BankRepo;
@Service
public  class BankServiceImp implements BankService {

	@Autowired
	private BankRepo repo;
	
	@Override
	public Bank saveBank(Bank bank) {
		repo.save(bank);
		return null;
	}

	@Override
	public Bank withdrawAmount(BankTransactions banktransactions, Bank bank) {
		Optional<Bank> allaccounts=repo.findById(bank.getAccountno());
		Bank dbaccountdetails=allaccounts.get();
		dbaccountdetails.setAmount(dbaccountdetails.getAmount()-banktransactions.getWithdrawamount());
		return repo.save(dbaccountdetails);
	}


	@Override
	public Bank transferBank(BankTransactions banktransactions, Bank bank) {
		
		Optional<Bank> dbaccount1=repo.findById(bank.getAccountno());
		Bank a1=dbaccount1.get();
		a1.setAmount(a1.getAmount()-banktransactions.getTransferamount());
		repo.save(a1);
		
		Optional<Bank> dbaccount2=repo.findById(banktransactions.getAccountno2());
		Bank a2=dbaccount2.get();
		a2.setAmount(a2.getAmount()+banktransactions.getTransferamount());
		return repo.save(a2);
	}


	@Override
	public Bank depositBank(BankTransactions banktransactions, Bank bank) {
		Optional<Bank> allaccounts=repo.findById(bank.getAccountno());
		Bank dbaccountdetails=allaccounts.get();
		double currentbalance=dbaccountdetails.getAmount();
		double depositamount=banktransactions.getDepositamount();
		double totalbalance=currentbalance+depositamount;
		dbaccountdetails.setAmount(totalbalance);
		return repo.save(dbaccountdetails);
		
	}


	@Override
	public Bank getBank(Bank bank, long accountno) {
		Bank getone=repo.findById(accountno).get();
		return getone;
	}


	@Override
	public Bank closeBankAccount(Bank bank,long accountno) {
		Optional<Bank> alldetails=repo.findById(bank.getAccountno());
		Bank onerecord=alldetails.get();
		int presentstatus=onerecord.getStatus();
		if(presentstatus==1) {
			onerecord.setStatus(0);
		}
		else {
			onerecord.setStatus(0);
		}
		return repo.save(onerecord);
	}


	
}


	



	

	

	
	

	


