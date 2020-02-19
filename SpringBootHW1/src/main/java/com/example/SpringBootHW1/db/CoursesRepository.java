package com.example.SpringBootHW1.db;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.SpringBootHW1.beans.Course;

public interface CoursesRepository extends JpaRepository<Course, Integer> {

	List<Course> findCoursesByDurationLessThan(int maxDuration);
	List<Course> findCoursesByDurationBetween(int minDuration, int maxDuration);
	//List<Course> findCoursesByStartDateBefore(Date date);
	List<Course> findCoursesByNameIn(List<String> names);
	
	@Query("select avg(c.duration) from Course c where c.id > :minId")
	double courseDurationAverage(int minId);

	
}
