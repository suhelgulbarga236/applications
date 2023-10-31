package com.Suheal.hrms.service;

import com.Suheal.hrms.entity.Employee;
import com.Suheal.hrms.repo.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee create(Employee employee) {
        log.info("create method " + employee);
        return employeeRepo.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        log.info("update method " + employee);
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
        log.info("delete method " + employee);
        employeeRepo.deleteById(employee.getId());
    }
}
