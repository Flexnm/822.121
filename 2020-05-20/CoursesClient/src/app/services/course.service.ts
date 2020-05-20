import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Course } from '../models/course';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  constructor(private http: HttpClient) { }

  public addCourse(course:Course){
    return this.http.post<Course>("http://localhost:8080/courses", course);
  }

  public getAllCourses(){
    return this.http.get<Course[]>("http://localhost:8080/courses");
  }

  public getCourse(id:number){
    return this.http.get<Course>("http://localhost:8080/courses/"+id);
  }
  
  public getCourseTitle(title:string){
    return this.http.get<Course>("http://localhost:8080/courses/title/"+title);
  }

  
  public deleteCourse(id:number){
    return this.http.delete("http://localhost:8080/courses/"+id, {responseType:'text'}); // if the response is plain text - add responseType:'text'
  }
}
