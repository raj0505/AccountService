package com.amdocs.services.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.model.Account;

import com.amdocs.repository.AccountRepository;

import com.amdocs.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	
	@Override
	public Account createAccount(Account account) {
		Account local = (Account) this.accountRepository.findByAccountId(account.getAccountId());

		if (local != null) {
			System.out.println("account is  is already there");

		} else {
			local = this.accountRepository.save(account);
		}

		return local;
	}

	/*
	 * @Override public Account updateAccount(Account account, long accountId) {
	 * Account accountToUpdate = (Account)
	 * this.accountRepository.findByAccountId(account.getAccountId()); if
	 * (accountToUpdate.getAccountId() == account.getAccountId()) {
	 * accountToUpdate.setAccountBalance(account.getAccountBalance());
	 * accountToUpdate.setAccountType(account.getAccountType());
	 * accountToUpdate.setBranchName(account.getBranchName());
	 * accountToUpdate.setUser(account.getUser());
	 * 
	 * this.accountRepository.save(account);
	 * 
	 * }
	 * 
	 * return accountToUpdate; }
	 */
	@Override
	public Account getAccount(long accountId) {

		return this.accountRepository.findById(accountId).get();
	}

	@Override
	public List<Account> getAllAccount() {

		return this.accountRepository.findAll();
	}

	@Override
	public void deleteAccount(long accountId) {

		this.accountRepository.deleteById(accountId);

	}

	@Override
	public void deleteAllAccount() {

		this.accountRepository.deleteAll();

	}

	@Override
	public Account updateAccount(Account account, long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public List<Account> getAccountsOfUser(User user) { // TODO
	 * Auto-generated method stub return null; }
	 */

	/*
	 * @Override public List<Account> getAccountsOfUser(User user) {
	 * 
	 * List<Account> allaccounts = this.accountRepository.findAll();
	 * 
	 * 
	 * 
	 * 
	 * user.setAccounts(allaccounts);
	 * 
	 * 
	 * 
	 * return
	 * allaccounts.stream().filter(account->account.getUser().equals(user)).collect(
	 * Collectors.toList());
	 * 
	 * 
	 * }
	 */

}
