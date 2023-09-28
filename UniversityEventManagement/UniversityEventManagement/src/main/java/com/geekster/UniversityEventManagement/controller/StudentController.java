package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Department;
import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.model.Student;
import com.geekster.UniversityEventManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("addStudent")
    public Student addStudent(@Valid @RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @PostMapping("addStudents")
    public String addStudents(@RequestBody List<Student> newStudents){
        return studentService.addStudents(newStudents);
    }

    @GetMapping("all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("studentId/{studentId}")
    public Optional<Student> getStudentById(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PutMapping("studentId/{studentId}/update-department")
    public Student updateStudentDepartment(@PathVariable Long studentId, @RequestBody Department department) {
        return studentService.updateStudentDepartment(studentId, department);
    }

    @DeleteMapping("studentId/{studentId}/delete")
    public void deleteStudent(@PathVariable Long studentId) {
        studentService.deleteStudent(studentId);
    }

}
