package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}