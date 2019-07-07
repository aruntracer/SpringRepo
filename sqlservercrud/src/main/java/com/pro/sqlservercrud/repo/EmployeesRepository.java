package com.pro.sqlservercrud.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pro.sqlservercrud.model.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {
	
	@Query("FROM Employees WHERE name = ?1")
	Optional<Employees> findByName(String name);
	
	@Query("FROM Employees WHERE name = ?1 and age = ?2")
	Optional<Employees> findByNameAndAge(String name,int age);
}
