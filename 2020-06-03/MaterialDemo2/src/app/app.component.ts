import { DialogComponent } from './components/dialog/dialog.component';
import { Component } from '@angular/core';
import { FormControl } from '@angular/forms';
import { MatSnackBarRef, MatSnackBar } from '@angular/material/snack-bar';
import { MatDialog } from '@angular/material/dialog';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    optionSelect: FormControl = new FormControl();

    autocomplete: FormControl = new FormControl();

    ourTooltip: string = "Our tooltip info";

    options = [
        { title: 'Audi R8', color: 'Black' },
        { title: 'Lexus LFA', color: 'White' },
        { title: 'Jaguar F-Type', color: 'Green' }
    ]

    constructor(private snackBar: MatSnackBar, private dialog:MatDialog){}

    showSnack(){
        //this.snackBar.open("hello world!")
        let snackRef = this.snackBar.open("hello world!", "undo", {duration: 2000});
        snackRef.onAction().subscribe( ()=>{
            // do our stuff here!
            alert("sorry, cannot undo!");
        });      
    }

    showDialog(){
        this.dialog.open(DialogComponent, {disableClose: true});
    }
}

