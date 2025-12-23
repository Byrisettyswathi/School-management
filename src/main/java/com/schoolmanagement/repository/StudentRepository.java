package com.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schoolmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}