package com.Suheal.hrms.controller;

import com.Suheal.hrms.entity.Employee;
import com.Suheal.hrms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("employee")
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @PostMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Employee employee) {
        employeeService.delete(employee);
    }

}
