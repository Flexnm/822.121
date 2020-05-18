import { Component, OnInit } from '@angular/core';
import { Car } from 'src/app/models/car';
import { CarsService } from 'src/app/services/cars.service';

@Component({
  selector: 'app-allcars',
  templateUrl: './allcars.component.html',
  styleUrls: ['./allcars.component.css']
})
export class AllcarsComponent implements OnInit {

  cars: Car[];

  // DI - give us an instance of CarsService
  constructor(private carService: CarsService) { }

  ngOnInit(): void {
    this.carService.getAllCars().subscribe( (cars)=>{
      this.cars = cars;
    }, (err)=>{
      alert(err.error);
    } )
  }

}
