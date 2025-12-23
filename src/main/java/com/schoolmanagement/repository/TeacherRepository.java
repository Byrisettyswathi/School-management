package com.schoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schoolmanagement.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
