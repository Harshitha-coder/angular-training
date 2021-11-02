import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent-demo',
  templateUrl: './parent-demo.component.html',
  styleUrls: ['./parent-demo.component.css']
})
export class ParentDemoComponent implements OnInit {

  currentItem='Laptop';
 
  constructor() { }

  ngOnInit(): void {
  }
  items = ['item1','item2'];

  addItem(newItem: string) {
    this.items.push(newItem);
  }
}
