package HackRU23Back.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import HackRU23Back.model.Student;

@Repository
public interface StudentRepo extends MongoRepository<Student, Long> {

    Optional<Student> findStudentById(Long id);

    void deleteStudentById(Long id);

    public long count();
    
}
