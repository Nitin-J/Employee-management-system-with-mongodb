package com.employee.controller;

import com.employee.dto.EmployeeDTO;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@Validated
@RestController
@RequestMapping("/employee")

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping (value = "/save", consumes = {MediaType.ALL_VALUE})
    void saveEmployee(@RequestBody @Valid EmployeeDTO employeeS){
        employeeService.SaveEmployee(employeeS);
    }

    @GetMapping
    List<EmployeeDTO> getEmployeesName() {
        return employeeService.getEmployee();
    }

    @DeleteMapping(value = "/delete/{id}")
    void deleteEmployeeById(@PathVariable String id){
        employeeService.deleteById(id);
    }

    @GetMapping(value = "/{id}")
    public EmployeeDTO getEmployeeId(@PathVariable String id) {
        return employeeService.findById(id);
    }

    @GetMapping(value = "/find/{age}")
    List<EmployeeDTO> findEmployee(@PathVariable(value = "age") int age){
        return employeeService.findByAge(age);
    }

    @GetMapping(value = "find/{contactName}")
    List<EmployeeDTO> findByContactNum(@PathVariable(value = "contactNumber")long contactNumber){
        return employeeService.findByNumber(contactNumber);
    }

}