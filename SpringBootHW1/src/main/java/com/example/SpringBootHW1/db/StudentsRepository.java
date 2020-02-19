package com.example.SpringBootHW1.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHW1.beans.Student;

public interface StudentsRepository extends JpaRepository<Student, Long> {

}
