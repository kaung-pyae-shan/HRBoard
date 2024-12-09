package com.hrboard.model.repo.custom.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hrboard.model.dto.output.DepartmentDto;
import com.hrboard.model.entity.Department;
import com.hrboard.model.entity.Department_;
import com.hrboard.model.repo.custom.DepartmentRepoCustom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class DepartmentRepoCustomImpl implements DepartmentRepoCustom {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<DepartmentDto> findAllDepartment() {

		var cb = em.getCriteriaBuilder();
		var cq = cb.createQuery(DepartmentDto.class);
		var root = cq.from(Department.class);
		
		cq.multiselect(
				root.get(Department_.id),
				root.get(Department_.name)
				);
		
		return em.createQuery(cq).getResultList();
	}

}
