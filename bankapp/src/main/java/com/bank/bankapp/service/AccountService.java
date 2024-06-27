package com.bank.bankapp.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.bankapp.model.Account;
import com.bank.bankapp.repository.AccountRepository;

@Service
public class AccountService {
	
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        account.setBalance(BigDecimal.ZERO);
        return accountRepository.save(account);
    }

    public Account findByAccountNumber(String accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account getAccountById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account updateAccount(Long id, Account accountDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
