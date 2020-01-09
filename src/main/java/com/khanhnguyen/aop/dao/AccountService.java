package com.khanhnguyen.aop.dao;

import com.khanhnguyen.aop.model.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public void addAccount(Account account) {
        System.out.println(getClass() + ": adding an account");
    }
}
