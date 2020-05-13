import { Component, OnInit, OnDestroy } from '@angular/core';
import { Student } from 'src/app/models/student';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {


  private today: Date;
  productPrice: number;

  names: string[];
  isDay: boolean;

  imageWidth: number;

  title:string;

  //students = [];
  students:Student[] = [];

  constructor() { }
  
  ngOnInit(): void {
    this.today = new Date();
    this.productPrice = 150;
    
    this.names = ["one", "two", "three", "four", "five", "ten", "eleven", "some new text"];

    this.isDay = this.today.getHours() < 12 && this.today.getHours() > 6;

    this.imageWidth = 250;

    // this.students = [
    //   { name: "Nir", grade: 70},
    //   { name: "Liat", grade: 100},
    //   { name: "Noam", grade: 89},
    //   { name: "Ori", grade: 90},
    //   {name:"blah", grade:99}
    // ];

      this.students = [
        new Student("Nir", 70),
        new Student("Liat", 100),
        new Student("Noam", 89),
        new Student("Blah", 99)
      ];

  }

  public randomPrice():void{
    this.productPrice = Math.random()*400;
  }



  getToday(): Date{
    return this.today;
  }
  
  changeImageWidth(){
    this.imageWidth = Math.random()*200 + 200;
    // let index: number = Math.floor(Math.random()*this.names.length);
    // this.title = this.names[index];
    this.title = this.names[Math.floor(Math.random()*this.names.length)];
  }
  
  public minusWidth(){
    this.imageWidth -= 10;
  }

  public plusWidth(){
    this.imageWidth += 10;
  }

}
