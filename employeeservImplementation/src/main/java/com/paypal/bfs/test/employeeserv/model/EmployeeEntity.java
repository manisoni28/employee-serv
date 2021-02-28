package com.paypal.bfs.test.employeeserv.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String country;
    private String zip_code;
}
