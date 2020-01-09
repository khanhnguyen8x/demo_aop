package com.khanhnguyen.aop.controller;

import com.khanhnguyen.aop.dao.AccountService;
import com.khanhnguyen.aop.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public String get() {
        accountService.addAccount(new Account("Bruce", "Admin"));
        return "Getting Account";
    }
}
