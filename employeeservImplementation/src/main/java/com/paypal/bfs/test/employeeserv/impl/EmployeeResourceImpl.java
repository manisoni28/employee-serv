package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.EmployeeFunctions;
import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.model.EmployeeEntity;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@AllArgsConstructor
@RestController
public class EmployeeResourceImpl implements EmployeeResource {
    private EmployeeFunctions<Employee, EmployeeEntity> employeeEmployeeFunctions;
    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {
        return new ResponseEntity<>(employeeEmployeeFunctions.searchEmployeeById(Integer.valueOf(id)), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Employee> addEmployee(Employee employee) {
        return new ResponseEntity<>(employeeEmployeeFunctions.addEmployee(employee),HttpStatus.CREATED);
    }
}
