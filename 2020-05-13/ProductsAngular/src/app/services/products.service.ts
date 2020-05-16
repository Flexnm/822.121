import { Injectable } from '@angular/core';
import { HttpClient, HttpHandler } from '@angular/common/http';
import { Product } from '../models/product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private httpClient: HttpClient) { }

  // public getPosts() {
  //     return this.httpClient.get("https://jsonplaceholder.typicode.com/posts");
  // }

  // public addPost(post:Object){
  //   return this.httpClient.post("https://jsonplaceholder.typicode.com/posts", post);
  // }


  public getAllProducts(){//:Observable<Product[]>{
    return this.httpClient.get<Product[]>("http://localhost:8080/products");
  }

  public getProductById(id: number):Observable<Product>{
    return this.httpClient.get<Product>("http://localhost:8080/products/" + id);
  }
  
}
