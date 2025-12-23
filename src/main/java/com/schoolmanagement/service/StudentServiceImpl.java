package com.schoolmanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.schoolmanagement.model.Student;
import com.schoolmanagement.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}