package HackRU23Back.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import HackRU23Back.exception.StudentNotFoundException;
import HackRU23Back.model.Student;
import HackRU23Back.repo.StudentRepo;

@Service
@Transactional
public class StudentService {
    
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        student.setCode(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student findStudentById(Long id) {
        return studentRepo.findStudentbyId(id)
            .orElseThrow(() -> new StudentNotFoundException("Student with id " + id + " was not fonud."));
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteStudentById(id);
    }



}
