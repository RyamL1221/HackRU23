package HackRU23Back.model;
import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int numClasses;
    private String name;
    private String classYear; // i.e. "Freshman, Sophomore, etc."
    private int gradYear; // i.e. "2027, 2026, etc."
    private String courseList;
	private double gpa;
	private String code;
}
