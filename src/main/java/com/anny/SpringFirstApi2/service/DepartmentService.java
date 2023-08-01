package com.anny.SpringFirstApi2.service;

import com.anny.SpringFirstApi2.entity.Department;
import com.anny.SpringFirstApi2.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Optional<Department> getOneDepartment(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartment(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department getDepartmentByName(String departmentName);
}
