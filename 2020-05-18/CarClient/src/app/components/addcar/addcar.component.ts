import { Component, OnInit } from '@angular/core';
import { Car } from 'src/app/models/car';
import { CarsService } from 'src/app/services/cars.service';

@Component({
  selector: 'app-addcar',
  templateUrl: './addcar.component.html',
  styleUrls: ['./addcar.component.css']
})
export class AddcarComponent implements OnInit {

  model:string;
  year:number;
  color:string;

  constructor(private carService:CarsService) { }

  ngOnInit(): void {
  }

  public addNewCar(){
    const car:Car = new Car(0, this.model, this.year, this.color);
    this.carService.addCar(car).subscribe( (car)=>{
      alert("Car added, new id is: " + car.id);
    }, (err)=>{
      alert(err.error);
    } )
  }
}
