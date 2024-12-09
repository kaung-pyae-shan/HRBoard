package com.hrboard.model.repo.custom;

import java.util.List;

import org.springframework.data.domain.Page;

import com.hrboard.model.dto.input.EmployeeSearch;
import com.hrboard.model.dto.output.EmployeeCountDto;
import com.hrboard.model.dto.output.EmployeeDetailsDto;

public interface EmployeeRepoCustom {
	
	List<EmployeeCountDto> findEmployeeCountByDepartment();

	Page<EmployeeDetailsDto> searchAllEmployeeDetails(EmployeeSearch search, int page, int size);
	
	EmployeeDetailsDto findById(int id);
}
