package ru.sasulin.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    @Query(value = "from Employee where department.name=?1")
    List<Employee> findAllByDep(String departmentName);
}
