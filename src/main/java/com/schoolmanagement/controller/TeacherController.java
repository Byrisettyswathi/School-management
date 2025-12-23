package com.schoolmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.schoolmanagement.model.Teacher;
import com.schoolmanagement.service.TeacherService;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("teachers", service.getAllTeachers());
        return "teacher";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "add-teacher";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Teacher teacher) {
        service.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", service.getTeacherById(id));
        return "edit-teacher";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteTeacher(id);
        return "redirect:/teachers";
    }
}
