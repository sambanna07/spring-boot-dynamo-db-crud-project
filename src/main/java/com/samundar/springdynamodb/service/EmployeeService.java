package com.samundar.springdynamodb.service;

import com.samundar.springdynamodb.dto.EmployeeDTO;
import com.samundar.springdynamodb.dto.ResponseDTO;

import java.util.List;

public interface EmployeeService {
    ResponseDTO<EmployeeDTO> saveEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployee(String id);

    ResponseDTO<EmployeeDTO> updateEmployee(EmployeeDTO employeeDTO);

    ResponseDTO<EmployeeDTO> deleteEmployee(String id);
}
