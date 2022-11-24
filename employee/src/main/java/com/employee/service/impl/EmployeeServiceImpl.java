package com.employee.service.impl;

import com.employee.repository.EmployeeRepository;
import com.employee.dto.EmployeeDTO;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import com.employee.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
     EmployeeRepository employeeRepository;

    @Override
    public void SaveEmployee(EmployeeDTO employeeDto) {

        employeeRepository.save(ObjectMapperUtils.map(employeeDto, Employee.class));
    }

    @Override
    public List<EmployeeDTO> getEmployee() {
        return ObjectMapperUtils.mapAll(employeeRepository.findAll(), EmployeeDTO.class);
    }

    @Override
    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public EmployeeDTO findById(String id) {
        return ObjectMapperUtils.map(employeeRepository.findEmployeeById(id), EmployeeDTO.class);
    }

    @Override
    public List<EmployeeDTO> findByAge(int age) {
        return employeeRepository.findByAge(age);
    }

    @Override
    public List<EmployeeDTO> findByNumber(long contactNumber) {
        List<EmployeeDTO> emp = getEmployee();
        emp = emp.stream().filter(employeeDTO -> employeeDTO.getContactNumber() > 34562134).collect(Collectors.toList());
        return emp;
    }

}
