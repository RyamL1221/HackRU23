package HackRU23Back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import HackRU23Back.model.Student;
import HackRU23Back.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable("id") Long id) {
        Student student = studentService.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student updateStudent = studentService.updateStudent(student);
        return new ResponseEntity<>(updateStudent, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
