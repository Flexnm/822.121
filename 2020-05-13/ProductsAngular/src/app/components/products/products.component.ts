import { Component, OnInit } from '@angular/core';
import { MathService } from 'src/app/services/math.service';
import { ProductsService } from 'src/app/services/products.service';
import { Observable } from 'rxjs';
import { Product } from 'src/app/models/product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {


  result: boolean;
  sum: number;

  products: Product[];
  // posts;

  /* Dependency Injection!! */
  constructor(private mathService: MathService, private productsService: ProductsService) { }

  ngOnInit(): void {

    // math service

    this.result = this.mathService.isPrime(11);
    this.sum = this.mathService.addTwoNumbers(22, 44);


    // products service
    // this.productsService.getPosts().subscribe(function(response){
    //   console.log(response);
    // }, function(error){
    //   console.log(error);
    // });


    // this.productsService.getPosts().subscribe( (response)=>{
    //   this.posts = response;
    // }, (error)=>{
    //   console.log(error.message);
    // } );

    this.productsService.getAllProducts().subscribe( (products) => {
      this.products = products;
    }, (err) => {
      alert(err.message);
    } )

  }

  /*
  success(respose){
    console.log(respose);
  }
  
  failed(error){
    console.log(error);
  }
  */

}
