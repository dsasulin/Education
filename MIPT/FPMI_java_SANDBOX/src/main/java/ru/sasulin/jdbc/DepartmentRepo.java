package ru.sasulin.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
