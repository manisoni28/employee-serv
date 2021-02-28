package com.paypal.bfs.test.employeeserv.service;

import com.paypal.bfs.test.employeeserv.EmployeeFunctions;
import com.paypal.bfs.test.employeeserv.mapper.EmployeeMapper;
import com.paypal.bfs.test.employeeserv.dao.EmployeeRepository;
import com.paypal.bfs.test.employeeserv.model.EmployeeEntity;
import com.paypal.bfs.test.employeeserv.exception.EmployeeNotFoundException;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeTemplate implements EmployeeFunctions<Employee, EmployeeEntity> {
    private final EmployeeRepository employeeRepository;
    @Override
    public Employee searchEmployeeById(Integer id) {
         Optional<EmployeeEntity> entity=employeeRepository.findById(id);
         return entity.map(EmployeeMapper.model).orElseThrow(()->new EmployeeNotFoundException("No record found for Employee with employeeId="+id, HttpStatus.NOT_FOUND));
    }

    @Override
    public Employee addEmployee(Employee model) {
        EmployeeEntity entity=EmployeeMapper.entity.apply(model);
        return EmployeeMapper.model.apply(employeeRepository.save(entity));
    }


}
