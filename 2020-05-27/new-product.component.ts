import { Component, OnInit } from '@angular/core';
import { ProductsService } from 'src/app/services/products.service';
import { FormGroup, FormControl, FormBuilder, Validators, AbstractControl } from '@angular/forms';
import { isNumber } from 'util';

@Component({
  selector: 'app-new-product',
  templateUrl: './new-product.component.html',
  styleUrls: ['./new-product.component.css']
})
export class NewProductComponent implements OnInit {

  /*
  title:string;
  description:string;
  price:number;
  */

  prdForm: FormGroup;

  // new form
  userForm: FormGroup;

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {

    /*
    // Method 1:
    this.prdForm = new FormGroup({
      title: new FormControl("Product 1", Validators.required),
      description: new FormControl("Desc 1"),
      price: new FormControl("")
    });
    */

    // Method 2:
    this.prdForm = this.formBuilder.group({
      title: ["", Validators.required],
      description: ["Desc 1", [Validators.required, Validators.minLength(3)]],
      price: []
    });




    // user form
    this.userForm = this.formBuilder.group({
      fname: ["", Validators.required],
      lname: ["", [Validators.required, this.validateLastName]], // custom validation
      email: ["", [Validators.required]],
      password: ["", this.strongPasswordValidator2]
    });


  } // end of ngOnInit

  public fc(){
    return this.prdForm.controls;
  }

  get user(){
    return this.userForm.controls;
  }

  // our custom validation method!
  public validateLastName(control: AbstractControl){
    if(control.value != "" && control.value.length < 3){
      return {lastNameError:true};
    }
  }

  // strong password validator - at least 6 chars, 2 digits, 1 capital letter
  public strongPasswordValidator(control: AbstractControl){
    let password:string = control.value;
    let digitCount = 0;
    let capitalCount = 0;

    if(password.length < 6)
      return {passError: true}
    
    for(let i=0; i<password.length; i++){
      let tav = password.charAt(i);
      //if(isNumber(tav))
      if(!isNaN(parseInt(tav)))
        digitCount++;
      else if(tav.toUpperCase() === tav)
        capitalCount++;
    }

    if(digitCount < 2 || capitalCount < 1)
      return {passError:true};

  }

  public strongPasswordValidator2(control: AbstractControl){
    if(control.value.match("^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$"))
      return {passError: true};
  }


  sendUser(){
    //alert(this.user['fname'].value + ", " + this.user['lname'].value + ", " + this.user['email'].value + ", " + this.user['password'].value)
    console.log(this.userForm.value)
  }
}
