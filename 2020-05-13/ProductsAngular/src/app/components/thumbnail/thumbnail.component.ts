import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-thumbnail',
  templateUrl: './thumbnail.component.html',
  styleUrls: ['./thumbnail.component.css']
})
export class ThumbnailComponent implements OnInit {

  @Input()
  imageSrc:string;
  @Input()
  imageTitle: string;

  constructor() { }

  ngOnInit(): void {
    
  }

}
