import { Component, OnInit } from '@angular/core';
import { GpaComponent } from '../gpa/gpa.component';
import { StudentService } from '../gpa/student.service';
import { Student } from '../gpa/student';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-gpa-history',
  templateUrl: './gpa-history.component.html',
  styleUrls: ['./gpa-history.component.css']
})
export class GpaHistoryComponent {

  public students: Student[] = [];

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
}
