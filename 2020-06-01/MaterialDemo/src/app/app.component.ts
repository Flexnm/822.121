import { Component, ViewChild, OnInit } from '@angular/core';
import { MatMenuTrigger } from '@angular/material/menu';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  @ViewChild(MatMenuTrigger) trigger: MatMenuTrigger;


  ourForm: FormGroup;

  //constructor(private router:Router){}
  constructor(private fb:FormBuilder){}
  
  ngOnInit(): void {
    this.ourForm = this.fb.group({
      name:['', [Validators.required, Validators.maxLength(6)]]
    });
  }

  public openMenu(){
    this.trigger.openMenu();
  }

  public aboutUs(){
    //alert("We are the world!");
    //this.router.navigate(["/about"])
  }

}
