package com.Suheal.hrms.repo;

import com.Suheal.hrms.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
