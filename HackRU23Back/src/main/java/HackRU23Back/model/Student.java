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
	private String id;
    private String name;
    private String classYear; // i.e. "Freshman, Sophomore, etc."
    private int gradYear; // i.e. "2027, 2026, etc."
    private ArrayList<Course> courseList;
	private double gpa;

	public Student(String name, String classYear, int gradYear, ArrayList<Course> courseList) {
		this.name = name;
		this.classYear = classYear;
		this.gradYear = gradYear;
		this.courseList = courseList;
		this.gpa = calcGPA();
	}

	public double calcGPA() {
		double sum = 0.0;
		int creditSum = 0;
		for (Course c : courseList) {
			sum += c.getValue() * c.getCredits();
			creditSum += c.getCredits();
		}
		sum /= creditSum;
		return sum;
	}
}
