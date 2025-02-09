package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
