import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddCourseComponent } from './components/add-course/add-course.component';
import { AllCoursesComponent } from './components/all-courses/all-courses.component';
import { DeleteCourseComponent } from './components/delete-course/delete-course.component';
import { OneCourseComponent } from './components/one-course/one-course.component';


const routes: Routes = [
  {path:"add", component:AddCourseComponent},
  {path:"one", component:OneCourseComponent},
  {path:"del", component:DeleteCourseComponent},
  {path:"all", component:AllCoursesComponent},
  {path:"", component:AddCourseComponent, pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
