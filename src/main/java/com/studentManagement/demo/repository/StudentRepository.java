package com.studentManagement.demo.repository;

import com.studentManagement.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Long> {

}
