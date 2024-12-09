package com.hrboard.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrboard.model.entity.Account;

public interface AccountRepo extends JpaRepository<Account, String> {

}
