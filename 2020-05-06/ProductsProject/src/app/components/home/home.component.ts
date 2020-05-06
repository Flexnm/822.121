import { Component, OnInit, OnDestroy } from '@angular/core';

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

  constructor() { }
  
  ngOnInit(): void {
    this.today = new Date();
    this.productPrice = 150;
    
    this.names = ["one", "two", "three", "four", "five", "ten", "eleven", "some new text"];

    this.isDay = this.today.getHours() < 12 && this.today.getHours() > 6;

    this.imageWidth = 200;
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
  
}
