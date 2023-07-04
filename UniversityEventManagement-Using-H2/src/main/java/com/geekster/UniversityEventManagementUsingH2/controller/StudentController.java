package com.geekster.UniversityEventManagementUsingH2.controller;

import com.geekster.UniversityEventManagementUsingH2.model.Branch;
import com.geekster.UniversityEventManagementUsingH2.model.Student;
import com.geekster.UniversityEventManagementUsingH2.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    //Add Student
    @PostMapping("student")
    public String addStudent(@Valid @RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //Get all students
    @GetMapping("students")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //Get student by id
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);

    }


    // delete student
    @DeleteMapping("deleteStudent/{id}")
    public String deleteStudentById(@PathVariable Integer id) {
        return studentService.deleteStudentById(id);

    }
    //update student department
    @PutMapping("student/{id}/{branch}")
    public String updateDepartmentById(@PathVariable Integer id , @PathVariable Branch branch){
        return studentService.updateDepartmentById(id , branch);

    }





}







