import { Component, OnInit } from '@angular/core';
import { CourseService } from 'src/app/services/course.service';
import { Course } from 'src/app/models/course';

@Component({
  selector: 'app-all-courses',
  templateUrl: './all-courses.component.html',
  styleUrls: ['./all-courses.component.css']
})
export class AllCoursesComponent implements OnInit {

  ourCourses: Course[];  

  constructor(private myService: CourseService) { }

  ngOnInit(): void {
    this.myService.getAllCourses().subscribe( (courses)=>{
      this.ourCourses = courses;
    } );
  }

  public delete(id:number){
    //alert(id)
    this.myService.deleteCourse(id).subscribe( (result)=>{
      alert(result);
      // remove course from array (ourCourses)
      for(let i=0; i<this.ourCourses.length; i++){
        if(this.ourCourses[i].id == id)
          this.ourCourses.splice(i, 1); // remove one course from index i
      }


    }, (err)=>{
      alert(err.error)
    } )
  }

}
