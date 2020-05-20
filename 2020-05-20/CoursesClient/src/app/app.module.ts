import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { AddCourseComponent } from './components/add-course/add-course.component';
import { OneCourseComponent } from './components/one-course/one-course.component';
import { AllCoursesComponent } from './components/all-courses/all-courses.component';
import { DeleteCourseComponent } from './components/delete-course/delete-course.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    AddCourseComponent,
    OneCourseComponent,
    AllCoursesComponent,
    DeleteCourseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
