package com.Suheal.hrms.service;

import com.Suheal.hrms.entity.Employee;
import com.Suheal.hrms.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee create(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldemployee = employeeRepo.findById(employee.getId()).orElse(null);
        if (oldemployee != null) {
            oldemployee.setAge(employee.getAge());
            oldemployee.setEsal(employee.getEsal());
            oldemployee.setEname(employee.getEname());
            oldemployee.setAddress(employee.getAddress());
            return employeeRepo.save(oldemployee);
        }
        return null;
    }

    @Override
    public void delete(Employee employee) {
        employeeRepo.deleteById(employee.getId());
    }
}
