package com.employee.service;

import com.employee.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    void SaveEmployee(EmployeeDTO employeeDto);

    List<EmployeeDTO> getEmployee();

    void deleteById(String id);

    EmployeeDTO findById(String id);

    List<EmployeeDTO> findByAge(int age);

    List<EmployeeDTO> findByNumber(long contactNumber);
}
