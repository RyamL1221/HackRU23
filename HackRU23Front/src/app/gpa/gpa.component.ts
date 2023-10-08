import { Component } from '@angular/core';

@Component({
  selector: 'app-gpa',
  templateUrl: './gpa.component.html',
  styleUrls: ['./gpa.component.css']
})
export class GpaComponent {

  public update(): void{
    const courses = []
    courses[0] = document.getElementById("1") as HTMLDivElement
    courses[1] = document.getElementById("2") as HTMLDivElement
    courses[2] = document.getElementById("3") as HTMLDivElement
    courses[3] = document.getElementById("4") as HTMLDivElement
    courses[4] = document.getElementById("5") as HTMLDivElement
    courses[5] = document.getElementById("6") as HTMLDivElement
    courses[6] = document.getElementById("7") as HTMLDivElement
    courses[7] = document.getElementById("8") as HTMLDivElement
    const num = document.getElementById("membership") as HTMLSelectElement
    for (let i = 0; i < courses.length; i++) {
      courses[i].style.display = "block";
    }
    for (let i = courses.length-1; i >= parseInt(num.value); i--) {
      courses[i].style.display = "none";
    }
  }
}



