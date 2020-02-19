package com.example.SpringBootHW1.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBootHW1.beans.Lecturer;

public interface LecturerRepository extends JpaRepository<Lecturer, Integer> {

}
