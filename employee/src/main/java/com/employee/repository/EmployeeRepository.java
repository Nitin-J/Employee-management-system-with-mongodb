package com.employee.repository;

import com.employee.dto.EmployeeDTO;
import com.employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findEmployeeById(String id);

    @Query("{'age' : ?0}")
    List<EmployeeDTO> findByAge(int age);

    List<EmployeeDTO> findByContactNumber(long contactNumber);
}
