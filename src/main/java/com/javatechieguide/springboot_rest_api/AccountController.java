package com.javatechieguide.springboot_rest_api;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private AccountService accountService;


    @PostMapping
    public Account createAccount(@RequestBody Account account){

        return accountService.createAccount(account);
    }

    @GetMapping({"/{id}"})
    public Account getAccount(@PathVariable Long id) throws Throwable {

        Account account = (Account) accountService.getAccount(id).orElseThrow(() -> new RuntimeException("account not found"));
        return account;

    }

//    @PostMapping("/{id}/deposit")
//    public Account deposit(@PathVariable Long id , @RequestBody Map<String ,Double> request) throws Throwable {
//        Double amount = request.get("amount");
//        return accountService.deposit(id,amount);
//    }
//    @PostMapping("/{id}/withdraw")
//    public Account withdraw(@PathVariable Long id , @RequestBody Map<String ,Double> request) throws Throwable {
//        Double amount = request.get("amount");
//        return accountService.withdraw(id,amount);
//    }
}
