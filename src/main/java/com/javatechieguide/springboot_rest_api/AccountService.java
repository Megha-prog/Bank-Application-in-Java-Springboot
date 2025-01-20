package com.javatechieguide.springboot_rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    public  Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Optional<Account> getAccount(Long id) {
        return accountRepository.findById(id);
    }
//    public Account deposit(Long id, double amount) throws Throwable {
//        Account account= (Account) getAccount(id).orElseThrow(()-> new RuntimeException("account not found"));
//        account.setBalance(account.getBalance() + amount);
//        return  accountRepository.save(account);
//
//        }
//    public  Account withdraw(Long id, double amount) throws Throwable {
//        Account account= (Account) getAccount(id).orElseThrow(()-> new RuntimeException("Account not found"));
//        if(account.getBalance()<amount){
//            throw  new RuntimeException("Insufficient balance");
//
//        }

//        account.setBalance(account.getBalance()-amount);
//        return accountRepository.save(account);
//        }

    }

