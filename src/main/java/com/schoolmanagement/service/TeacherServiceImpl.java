package com.schoolmanagement.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.schoolmanagement.model.Teacher;
import com.schoolmanagement.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository repo;

    public TeacherServiceImpl(TeacherRepository repo) {
        this.repo = repo;
    }

    public List<Teacher> getAllTeachers() {
        return repo.findAll();
    }

    public Teacher saveTeacher(Teacher teacher) {
        return repo.save(teacher);
    }

    public Teacher getTeacherById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void deleteTeacher(Long id) {
        repo.deleteById(id);
    }
}
