package com.schoolmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.schoolmanagement.model.Student;
import com.schoolmanagement.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // LIST
    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "student";
    }

    // ADD FORM
    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    // SAVE (ADD + EDIT)
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    // EDIT FORM ✅
    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Student student = service.getStudentById(id);
        model.addAttribute("student", student);
        return "edit-student";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }
}