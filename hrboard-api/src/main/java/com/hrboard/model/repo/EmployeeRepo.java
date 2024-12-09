package com.hrboard.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hrboard.model.entity.Employee;
import com.hrboard.model.repo.custom.EmployeeRepoCustom;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>, EmployeeRepoCustom {

//	@Query("select new com.emp.model.dto.output.EmployeeCountDto(e.department.id, e.department.name, Count(e)) from Employee e group by e.department.id,e.department.name")
//	List<EmployeeCountDto> findEmployeeCountByDepartment();
}
