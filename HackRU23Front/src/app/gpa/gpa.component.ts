import { NgForm } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { StudentService } from './student.service';
import { Student } from './student';
import { Course } from './course';


@Component({
  selector: 'app-gpa',
  templateUrl: './gpa.component.html',
  styleUrls: ['./gpa.component.css']
})

export class GpaComponent {

  public students: Student[] = [];
  public classNum = 8;

  constructor(private studentService: StudentService) {}

  ngOnInit() {
    this.getStudents();
  }

  public getStudents(): void {
    this.studentService.getStudents().subscribe(
      (response: Student[]) => {
        this.students = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  };

  public counter(i: number) {
    return new Array(i);
}

  onSelected(value: string): void {
    console.log("it works");
    this.classNum = Number('value');
  }

  onAddStudent(addForm: NgForm): void {
    document.getElementById('add-student-form')?.click();
    this.studentService.addStudent(addForm.value).subscribe(
      (response: Student) => {
        this.getStudents();
        addForm.reset;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
  public num1 = 0;
  public update(): void{
    const num = document.getElementById("membership") as HTMLSelectElement
    const courses = []
    courses[0] = document.getElementById("1") as HTMLDivElement
    courses[1] = document.getElementById("2") as HTMLDivElement
    courses[2] = document.getElementById("3") as HTMLDivElement
    courses[3] = document.getElementById("4") as HTMLDivElement
    courses[4] = document.getElementById("5") as HTMLDivElement
    courses[5] = document.getElementById("6") as HTMLDivElement
    courses[6] = document.getElementById("7") as HTMLDivElement
    courses[7] = document.getElementById("8") as HTMLDivElement
    for (let i = 0; i < courses.length; i++) {
      courses[i].style.display = "block";
    }

    for (let i = courses.length-1; i >= parseInt(num.value); i--) {
      courses[i].style.display = "none";
    }
  }
}



