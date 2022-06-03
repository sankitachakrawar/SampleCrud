package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Department;

public interface DepartmentService {
	 // Save operation
    Department saveDepartment(Department department);
 
    // Read operation
    List<Department> fetchDepartmentList();
    
    //fetch by id
    Optional<Department> fetchDepartmentListById(Long departmentId);
 
    // Update operation
    Department updateDepartment(Department department,
                                Long departmentId);
 
    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
