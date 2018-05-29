package com.gmail.gnoianko.dao;

import com.gmail.gnoianko.models.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipientDao extends JpaRepository<Recipient, Long> {

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);

}
