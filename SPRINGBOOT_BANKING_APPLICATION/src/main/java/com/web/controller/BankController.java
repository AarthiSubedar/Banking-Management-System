package com.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.web.model.Bank;
import com.web.model.BankTransactions;
import com.web.service.BankServiceImp;


@Controller
public class BankController {
@Autowired
private BankServiceImp service;
@RequestMapping("/")
public String home() {
	return"bankhome";
}
@RequestMapping("/add")
public String newaccount() {
	return"newaccount";
}
@RequestMapping("/save")
public String savedetails(Bank bank,ModelMap model) {
	model.put("banks", service.saveBank(bank));
	return"success";
}
@RequestMapping("/balance")
public String balanceform() {
	return"balance";
}
@RequestMapping("/viewbalance")
public String viewbalance(Bank bank,ModelMap model,long accountno) {
	model.put("b", service.getBank(bank, accountno));
	return"viewbalance";
}
@RequestMapping("/deposit")
public String depositform() {
	return"deposit";
}
@RequestMapping("/depositbalance")
public String totalamount(ModelMap model,BankTransactions banktransactions,Bank bank) {
	model.put("tb",service.depositBank(banktransactions, bank));
	return"totalbalance";
}
@RequestMapping("/withdraw")
public String withdrawform() {
	return"withdraw";
}
@RequestMapping("/withdrawbalance")
public String withdrawamount(ModelMap model,BankTransactions banktransactions,Bank bank) {
	model.put("remainingbal",service.withdrawAmount(banktransactions, bank));
	return"afterwithdraw";
}
@RequestMapping("/transfer")
public String transferform() {
	return"transfer";
}
@RequestMapping("/transferbalance")
public String tranferamount(ModelMap model,BankTransactions banktransactions,Bank bank) {
	model.put("tranferdamount",service.transferBank(banktransactions, bank));
	return "aftertransfer";
	
}
@RequestMapping("/closeaccount")
public String closeaccountform() {
	return"closeaccount";
}
@RequestMapping("/closeoneaccount")
public String closeaccount(Bank bank,long accountno) {
	service.closeBankAccount(bank, accountno);
	return"aftercloseaccount";
}
}
