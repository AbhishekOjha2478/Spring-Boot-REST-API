package com.abhishek.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhishek.rest.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
