import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  public message:any = '';
  canSubmit = false;

 submit(register:any) {
    // this.canSubmit = !this.canSubmit;
    // if (this.canSubmit) {
    //   this.message = "account created successfully";
    // } 
    // else{
    //   this.message="account is not created";
    // }
    console.log("account created",register)
}


}