import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Car } from '../models/car';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarsService {

  constructor(private httpClient: HttpClient) { }

  public getAllCars():Observable<Car[]>{
    return this.httpClient.get<Car[]>("http://localhost:8080/cars");
  }

  public getOneCar(id: number):Observable<Car>{
    return this.httpClient.get<Car>("http://localhost:8080/cars/"+ id);
  }

  public addCar(newCar:Car):Observable<Car>{
    return this.httpClient.post<Car>("http://localhost:8080/cars", newCar);
  }
}
