package com.hrboard.model.repo.custom;

import java.util.List;

import com.hrboard.model.dto.output.DepartmentDto;

public interface DepartmentRepoCustom  {

	List<DepartmentDto> findAllDepartment();
}
