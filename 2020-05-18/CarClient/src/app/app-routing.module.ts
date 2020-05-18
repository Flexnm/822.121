import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AllcarsComponent } from './components/allcars/allcars.component';
import { OnecarComponent } from './components/onecar/onecar.component';
import { AddcarComponent } from './components/addcar/addcar.component';


const routes: Routes = [
  {path: "allcars", component: AllcarsComponent},
  {path: "onecar", component: OnecarComponent},
  {path: "addcar", component: AddcarComponent},
  {path: "", redirectTo:"allcars", pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
