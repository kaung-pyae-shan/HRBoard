package com.hrboard.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrboard.model.entity.Payroll;

public interface PayrollRepo extends JpaRepository<Payroll, Integer> {

}
