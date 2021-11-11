import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  public users:any;
  constructor(private userService:UserServiceService) { }

  ngOnInit(): void {
    this.userService.getUsers().subscribe((response)=>
    {

      this.users=response;
    });
  }

  deleteUser(id:number)
  {
    this.userService.deleteUser(id).subscribe()
    this.ngOnInit

  }
 
}
