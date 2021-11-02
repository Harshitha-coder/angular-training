import { Component} from '@angular/core';

@Component({
  selector: 'hello-world',
  templateUrl: './hello-world.component.html'
})

export class HelloWorldComponent  {
  //  public message:any = '';
  // canEdit = false;
  // canClick=false;

  // onEditClick() {
  //   this.canEdit = !this.canEdit;
  //   if (this.canEdit) {
  //     this.message = 'I\'m here';
  //   } 
  //   else {
  //     this.message = '';
  //   }
  // }
  // clearMessage(){
  //   this.message=null;
  // }

   currentValue="";
  onSubmit(name:string) {
   this.currentValue=name;
  }
  }
  
  

