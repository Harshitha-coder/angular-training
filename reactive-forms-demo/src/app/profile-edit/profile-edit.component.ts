import { Component, OnInit } from '@angular/core';
import { FormControl,FormGroup,Validators} from '@angular/forms';

@Component({
  selector: 'app-profile-edit',
  templateUrl: './profile-edit.component.html',
  styleUrls: ['./profile-edit.component.css']
})
export class ProfileEditComponent implements OnInit {

  profileForm=new FormGroup({
    firstName:new FormControl('',[Validators.required,Validators.minLength(3)]),
    lastName:new FormControl('',[Validators.required,Validators.minLength(1)]),
    address:new FormGroup({
      street: new FormControl('',[Validators.required,Validators.minLength(4),Validators.maxLength(10)]),
      city:new FormControl('',[Validators.required,Validators.minLength(4),Validators.maxLength(10)]),
      country:new FormControl('',[Validators.required,Validators.minLength(4),Validators.maxLength(10)]),
      state:new FormControl('',[Validators.required,Validators.minLength(4),Validators.maxLength(10)]),
      zip:new FormControl('',[Validators.required,Validators.minLength(4),Validators.maxLength(10)])
    })
  });
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit() {
    console.warn(this.profileForm.value);
  }
  updateProfile() {
    this.profileForm.patchValue({
      firstName: 'Harshitha',
      address: {
        street: '#7 BB road Street'
      }
    });
  }
}
