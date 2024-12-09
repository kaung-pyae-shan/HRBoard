package com.hrboard.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrboard.model.dto.output.DepartmentDto;
import com.hrboard.model.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentApi {
	
	@Autowired
	private DepartmentService service;

	@GetMapping
	public List<DepartmentDto> getAllDepartments() {
		return service.getDepartmentIDAndName();
	}
}
