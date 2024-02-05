package com.example.employeeapp.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Department {

    @Id
    
    private Integer deptno;

    private String dname;

   @OneToMany(mappedBy = "department")

   private Set<Employee> employees;
    
}
