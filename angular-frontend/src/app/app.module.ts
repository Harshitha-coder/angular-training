import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';


import { AppComponent} from './app.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { UpdateUserComponent } from './update-user/update-user.component';


@NgModule({
  declarations: [
    AppComponent,
    UserDetailsComponent,
    RegisterPageComponent,
    UpdateUserComponent,
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path: 'user-details', component: UserDetailsComponent},
      {path: 'register-page', component: RegisterPageComponent},    
    ]),   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
