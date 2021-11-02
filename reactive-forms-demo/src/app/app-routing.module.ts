import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NameEditComponent } from './name-edit/name-edit.component';
import { ProfileEditComponent } from './profile-edit/profile-edit.component';

const routes: Routes = [
  {path:'name-edit', component:NameEditComponent},
 {path:'profile-edit', component:ProfileEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[NameEditComponent,ProfileEditComponent]
