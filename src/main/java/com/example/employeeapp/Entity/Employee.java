package com.example.employeeapp.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity

public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String firstName;
    private String lastName;

    private Integer salary;
    private String doj;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deptno", referencedColumnName = "deptno", nullable = true)
	private Department department;
    
}
