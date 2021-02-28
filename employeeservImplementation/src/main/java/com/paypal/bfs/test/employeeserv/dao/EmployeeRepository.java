package com.paypal.bfs.test.employeeserv.dao;

import com.paypal.bfs.test.employeeserv.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
}
