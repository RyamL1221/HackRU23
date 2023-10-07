package HackRU23Back.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import HackRU23Back.model.Student;

public interface StudentRepo extends MongoRepository<Student, Long> {
    
    void deleteStudentById(Long id);

    Student findStudentbyId(Long id);

    public long count();
    
}
