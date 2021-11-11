import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../user';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent implements OnInit {

  public users:any;

  constructor( private userService:UserServiceService) { }

  ngOnInit(): void {
    
  }
     onSubmit(f:NgForm)
     {
      this.userService.addUser(f.value).subscribe();
      console.log(f)
     }
}
