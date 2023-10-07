package HackRU23Back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import HackRU23Back.repo.StudentRepo;

@SpringBootApplication
@EnableMongoRepositories
public class HackRu23BackApplication{

	@Autowired
	StudentRepo studentRepo;
	public static void main(String[] args) {
		SpringApplication.run(HackRu23BackApplication.class, args);
	}

}
