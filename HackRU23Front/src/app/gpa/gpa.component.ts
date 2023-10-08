import { NgForm } from '@angular/forms';
import { assertPlatform, Component, OnInit } from '@angular/core';
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
  public addStudent: Student = {name:"-1", classYear:"-1", gradYear: -1, courseList: [], gpa: 0}
  public numCourses = 0;
  public addCourse: Course = {name: "course", number:"01", grade: "?", credits: -1, value: 4}
  public courses: Course[] = [];
  public numArray: number[] = [];

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

  public loopNumArray(n: number): number[] {
    for(let i = 0; i < n; i++) {
      this.numArray.push(i);
    }
    return this.numArray;
  }

  onSubmit(addForm: NgForm): void {
    console.log(JSON.stringify(this.addStudent));
    this.studentService.addStudent(this.addStudent).subscribe(
      (response: Student) => {
        console.log(response);
        this.getStudents();
        addForm.reset();
      },  
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    )
  }


  public update(): void{
    const num = document.getElementById("membership") as HTMLSelectElement
    this.numCourses = Number('num');
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



