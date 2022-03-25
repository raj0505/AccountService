package com.amdocs.services;

import java.util.List;

import com.amdocs.model.Account;


public interface AccountService {

	public Account createAccount(Account account);

	public Account updateAccount(Account account, long accountId);

	public Account getAccount(long accountId);

	public List<Account> getAllAccount();

	public void deleteAccount(long accountId);

	public void deleteAllAccount();
	
//	public List<Account> getAccountsOfUser(User user);

}
