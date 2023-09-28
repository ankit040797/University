package com.geekster.UniversityEventManagement.repo;

import com.geekster.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
