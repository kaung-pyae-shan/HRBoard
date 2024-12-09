package com.hrboard.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrboard.model.dto.output.DepartmentDto;
import com.hrboard.model.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo repo;
	
	public List<DepartmentDto> getDepartmentIDAndName() {
		return repo.findAllDepartment();
	}
}
