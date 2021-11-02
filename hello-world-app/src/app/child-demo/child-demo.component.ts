import { Component, Input, OnInit,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child-demo',
  templateUrl: './child-demo.component.html',
  styleUrls: ['./child-demo.component.css']
})
export class ChildDemoComponent implements OnInit {

  @Input() item='';
  @Output() newItem=new EventEmitter<string>();
  constructor() { }

  ngOnInit(): void {
    
  }
  addItem(value:string)
  {
    this.newItem.emit(value);
  }

}
