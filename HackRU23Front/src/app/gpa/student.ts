import { Course } from "./course";

export interface Student {

    name: String;
    classYear: String;
    gradYear: number;
    courseList: Course[];
    gpa: number;
    
}