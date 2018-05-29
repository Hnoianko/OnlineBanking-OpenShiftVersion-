package com.gmail.gnoianko.dao;

import com.gmail.gnoianko.models.PrimaryTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrimaryTransactionDao extends JpaRepository<PrimaryTransaction,Long> {

}
