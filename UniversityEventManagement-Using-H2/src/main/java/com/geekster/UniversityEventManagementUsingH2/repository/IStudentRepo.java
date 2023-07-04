package com.geekster.UniversityEventManagementUsingH2.repository;

import com.geekster.UniversityEventManagementUsingH2.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends CrudRepository<Student, Integer> {


}
