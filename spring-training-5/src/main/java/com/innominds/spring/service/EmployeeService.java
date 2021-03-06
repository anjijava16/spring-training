/**
 * Copyright (c) 2014 Innominds. All Rights Reserved.
 */
package com.innominds.spring.service;

import java.util.List;

import com.innominds.spring.beans.Employee;

/**
 * EmployeeService.java
 *
 * @author ThirupathiReddy V
 *
 */
public interface EmployeeService {

    /**
     * @return employee creates and returns employee object
     */
    public List<Employee> getAllEmployees();

    /**
     * @param employee
     * @return status
     */
    public int saveEmployee(Employee employee);

    /**
     * @param id
     */
    public void deleteEmployee(int id);
}
