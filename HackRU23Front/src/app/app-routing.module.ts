import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home';
import { GpaComponent } from './gpa';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'gpa', component: GpaComponent},

  //directs to home in all other cases
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
