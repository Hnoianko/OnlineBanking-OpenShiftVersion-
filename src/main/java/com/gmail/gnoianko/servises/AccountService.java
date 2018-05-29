package com.gmail.gnoianko.servises;

import com.gmail.gnoianko.models.PrimaryAccount;
import com.gmail.gnoianko.models.SavingsAccount;

import java.security.Principal;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);

}
