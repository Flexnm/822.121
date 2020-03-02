package com.example.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Director;

public interface DirectorRepository extends JpaRepository<Director, Integer> {

}
