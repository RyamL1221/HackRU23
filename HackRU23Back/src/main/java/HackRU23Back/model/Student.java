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
	@Column(name="gradYear")
    private String gradYear; // i.e. "2027, 2026, etc."
	@Column(name="courseList")
    private String courseList;
	@Column(name="gpa")
	private String gpa;
	@Column(nullable = false, updatable = false)
	private String code;

	public Student(String numClasses, String name, String classYear, String gradYear, String courseList, String gpa) {
		this.numClasses = numClasses;
		this.name = name;
		this.classYear = classYear;
		this.gradYear = gradYear;
		this.courseList = courseList;
		this.gpa = gpa;
		
	}	

	public Student() {}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumClasses() {
		return this.numClasses;
	}

	public void setNumClasses(String numClasses) {
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

	public String getGradYear() {
		return this.gradYear;
	}

	public void setGradYear(String gradYear) {
		this.gradYear = gradYear;
	}

	public String getCourseList() {
		return this.courseList;
	}

	public void setCourseList(String courseList) {
		this.courseList = courseList;
	}

	public String getGpa() {
		return this.gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
    
	

}
