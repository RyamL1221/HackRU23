package HackRU23Back.model;
import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;

@Table(name = "student")
@Document("student")
@Entity
public class Student implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(name="numClasses")
	private String numClasses;
	@Column(name="name")
    private String name;
	@Column(name="classYear")
    private String classYear; // i.e. "Freshman, Sophomore, etc."
    private int gradYear; // i.e. "2027, 2026, etc."
    private ArrayList<Course> courseList;
	private double gpa;
	
    
	public Student(int nC, String n, String cY, int gY, ArrayList<Course> cL) {
		numClasses = nC;
		name = n;
		classYear = cY;
		gradYear = gY;
		courseList = cL;
		gpa = this.calcGPA();
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	// put default constructor (figure it out), inherent calls to super() in constructor
	

	public int getNumClasses() {
		return this.numClasses;
	}

	public void setNumClasses(int numClasses) {
		this.numClasses = numClasses;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassYear() {
		return this.classYear;
	}

	public void setClassYear(String classYear) {
		this.classYear = classYear;
	}
	public int getGradYear() {
		return gradYear;
	}

	public ArrayList<Course> getCourseList() {
		return this.courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}
	public double getGPA() {
		return gpa;
	}
	public void setNumClasses(int nC) {
		numClasses = nC;
	}
	public void setName(String n) {
		name = n;
	}
	public void setClassYear(String cY) {
		classYear = cY;
	}
	public void setGradYear(int gY) {
		gradYear = gY;
	}
	public void setCourseList(ArrayList<Course> cL) {
		courseList = cL;
	}
	public void setGPA(double g) {
		gpa = g;
	}
	
	
	public double calcGPA(ArrayList<Course> courses) {
		for (Course c : courses) {
			
		}
	}
    
}
