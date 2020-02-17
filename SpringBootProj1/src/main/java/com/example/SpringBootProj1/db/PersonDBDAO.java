package com.example.SpringBootProj1.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SpringBootProj1.beans.Person;

public interface PersonDBDAO extends JpaRepository<Person, Integer> {

}
