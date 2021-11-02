import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeroesListComponent } from './heroes-list/heroes-list.component';
import { HeroinesListComponent } from './heroines-list/heroines-list.component';
import { MoviesListComponent } from './movies-list/movies-list.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  {path:'heroes-list' ,component:HeroesListComponent},
  {path:'heroines-list' ,component:HeroinesListComponent},
  {path:'movies-list' ,component:MoviesListComponent},
  //{path: '', redirectTo: '/heroes-list', pathMatch: 'full'},
  {path:'**' ,component:PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[HeroesListComponent,HeroinesListComponent,MoviesListComponent,PageNotFoundComponent]
