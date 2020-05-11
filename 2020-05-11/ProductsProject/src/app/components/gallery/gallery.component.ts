import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.css']
})
export class GalleryComponent implements OnInit {

  images;

  constructor() { }

  ngOnInit(): void {
    this.images = [
      {src: "assets/i1.jpg", title: "Products 1"},
      {src: "assets/i2.jpg", title: "Products 2"},
      {src: "assets/i3.jpg", title: "iMilk"},
      {src: "assets/i3.jpg", title: "Products 3"},
      {src: "assets/i2.jpg", title: "Products 2"},
      {src: "assets/i1.jpg", title: "Products 1"}
    ];
  }

}
