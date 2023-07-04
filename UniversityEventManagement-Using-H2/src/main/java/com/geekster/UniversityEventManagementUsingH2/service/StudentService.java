package com.geekster.UniversityEventManagementUsingH2.service;

import com.geekster.UniversityEventManagementUsingH2.model.Branch;
import com.geekster.UniversityEventManagementUsingH2.model.Student;
import com.geekster.UniversityEventManagementUsingH2.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public Iterable<Student> getAllStudents() {
        return studentRepo.findAll();

    }

    public String addStudent(Student student){
         studentRepo.save(student);
         return "Student added";
    }

    public Student getStudentById(Integer id) {
        Optional<Student> stud= studentRepo.findById(id);
        return stud.isPresent() ? stud.get():null;



    }

    public String deleteStudentById(Integer id){
        studentRepo.deleteById(id);
        return "Student removed for id" + id;

    }


    public String updateDepartmentById(Integer id, Branch branch) {
        Optional<Student> studentOptional = studentRepo.findById(id);
        Student student = null;
        if(studentOptional.isPresent()){
            student  =  studentOptional.get();
        }else{
            return "Student Id Not Found";
        }
        student.setDepartment(branch);
        studentRepo.save(student);
        return "Branch Updated";

    }
}
