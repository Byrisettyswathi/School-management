package com.schoolmanagement.service;

import java.util.List;
import com.schoolmanagement.model.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}