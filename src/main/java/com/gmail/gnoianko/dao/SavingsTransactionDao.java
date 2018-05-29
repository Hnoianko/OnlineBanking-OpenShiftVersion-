package com.gmail.gnoianko.dao;

import com.gmail.gnoianko.models.SavingsTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingsTransactionDao extends JpaRepository<SavingsTransaction,Long> {

}
