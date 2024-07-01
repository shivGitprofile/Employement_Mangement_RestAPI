package com.developer.employeemanagement.Myservice;

import com.developer.employeemanagement.MyDTO.request.EmployeeRequest;
import com.developer.employeemanagement.MyDTO.response.EmployeeResponse;
import com.developer.employeemanagement.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(Long id);

//    Using Request for Save and Update Employee
    EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id);


}
