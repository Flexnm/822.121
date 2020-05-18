import { Component, OnInit } from '@angular/core';
import { Car } from 'src/app/models/car';
import { CarsService } from 'src/app/services/cars.service';

@Component({
  selector: 'app-onecar',
  templateUrl: './onecar.component.html',
  styleUrls: ['./onecar.component.css']
})
export class OnecarComponent implements OnInit {

  car:Car;
  carId: number;

  constructor(private carService:CarsService) { }

  ngOnInit(): void {
    
  }

  public getCar(){
    this.carService.getOneCar(this.carId).subscribe( (car)=>{
      this.car = car;
    }, (err)=>{
      alert(err.error);
    });
  }

}
