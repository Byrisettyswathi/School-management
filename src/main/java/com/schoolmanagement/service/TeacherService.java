package com.schoolmanagement.service;

import java.util.List;
import com.schoolmanagement.model.Teacher;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher saveTeacher(Teacher teacher);
    Teacher getTeacherById(Long id);
    void deleteTeacher(Long id);
}
