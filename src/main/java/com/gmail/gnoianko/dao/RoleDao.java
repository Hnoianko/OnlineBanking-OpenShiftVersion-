package com.gmail.gnoianko.dao;

import com.gmail.gnoianko.models.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
