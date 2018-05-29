package com.gmail.gnoianko.dao;

import com.gmail.gnoianko.models.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsAccountDao extends JpaRepository<SavingsAccount,Long>{
    SavingsAccount findByAccountNumber (int accountNumber);
}
