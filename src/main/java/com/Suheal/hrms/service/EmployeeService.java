package com.Suheal.hrms.service;

import com.Suheal.hrms.entity.Employee;

public interface EmployeeService {
    Employee create(Employee employee);

    Employee update(Employee employee);

    void delete(Employee employee);
}
