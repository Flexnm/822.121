import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MathService {

  constructor() { }

  public isPrime(number:number): boolean{
    for(let i =2; i <= number/2; i++){
      if(number % i == 0){
        return false;
      }
    }
  
    return true;
  }

  public addTwoNumbers(num1:number, num2:number): number{
    return num1 + num2;
  }


}
