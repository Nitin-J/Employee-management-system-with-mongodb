package com.employee.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@Document(collection = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    private String id;
    private String name;
    private int age;
    private String dept;
    private long salary;
    private long contactNumber;
    private String email;
    private Boolean isActive;

}