import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-name-edit',
  templateUrl: './name-edit.component.html',
  styleUrls: ['./name-edit.component.css']
})
export class NameEditComponent implements OnInit {

  name=new FormControl('');
  constructor() { 
   
  }

  ngOnInit(): void {
  }

  updateName()
  {
    this.name.setValue('Harshitha');
  }

}
