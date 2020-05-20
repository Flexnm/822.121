package com.example.db;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

	Optional<Course> findCourseByTitle(String title);
	
}
