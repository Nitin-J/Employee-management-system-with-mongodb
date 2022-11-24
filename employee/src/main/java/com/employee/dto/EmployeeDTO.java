package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private String id;

    @NotEmpty(message = "This field cannot be empty !!!")
    @Size(min = 4, message = "Name should be at least 4 characters long!! ")
    private String name;
    @Pattern(regexp = "^[0-9]{1,3}",message = "Enter a number and between 0-100")
    @NotNull(message = "A number should be added")
    //@Digits(fraction = 0, integer = 10, message = "age should be a number between 0-101")
    @Range(min = 01, max = 100)
    private String age;
    private String dept;
    private long salary;
    private long contactNumber;
    @NotEmpty
    @Email
    private String email;
    private Boolean isActive;
}