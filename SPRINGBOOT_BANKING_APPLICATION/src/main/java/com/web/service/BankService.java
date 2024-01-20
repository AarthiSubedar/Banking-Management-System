package com.web.service;

import java.util.List;

import com.web.model.Bank;
import com.web.model.BankTransactions;



public interface BankService {
public Bank saveBank(Bank bank);
public Bank getBank(Bank bank,long accountno);
public Bank depositBank(BankTransactions banktransactions,Bank bank);
public Bank withdrawAmount(BankTransactions banktransactions,Bank bank);
public Bank closeBankAccount(Bank bank,long accountno);
public Bank transferBank(BankTransactions banktransactions,Bank bank);


}
