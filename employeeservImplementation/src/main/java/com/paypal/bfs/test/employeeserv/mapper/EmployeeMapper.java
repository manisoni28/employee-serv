package com.paypal.bfs.test.employeeserv.mapper;


import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.model.EmployeeEntity;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public interface EmployeeMapper {
    Function<EmployeeEntity,Employee> model=(EmployeeEntity employeeEntity)->{
        Employee employee=new Employee();
        employee.setId(employeeEntity.getId());
        employee.setFirstName(employeeEntity.getFirst_name());
        employee.setLastName(employeeEntity.getLast_name());
        employee.setDateOfBirth(employeeEntity.getDate_of_birth());
        employee.setCity(employeeEntity.getCity());
        employee.setCountry(employeeEntity.getCountry());
        employee.setState(employeeEntity.getState());
        employee.setZipCode(employeeEntity.getZip_code());
        employee.setAddressLine1(employeeEntity.getAddress_line1());
        employee.setAddressLine2(employeeEntity.getAddress_line2());
        return employee;
    };
    Function<Employee, EmployeeEntity> entity=(Employee employee)->{
        EmployeeEntity e=new EmployeeEntity();
        e.setId(employee.getId());
        e.setFirst_name(employee.getFirstName());
        e.setLast_name(employee.getLastName());
        e.setDate_of_birth(employee.getDateOfBirth());
        e.setCity(employee.getCity());
        e.setCountry(employee.getCountry());
        e.setState(employee.getState());
        e.setZip_code(employee.getZipCode());
        e.setAddress_line1(employee.getAddressLine1());
        e.setAddress_line2(employee.getAddressLine2());
        return e;
    };
}
