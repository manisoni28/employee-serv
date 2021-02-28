package com.paypal.bfs.test.employeeserv;

public interface EmployeeFunctions<M,E> {
    public  M searchEmployeeById(Integer id);
    public  M addEmployee(M model);
}
