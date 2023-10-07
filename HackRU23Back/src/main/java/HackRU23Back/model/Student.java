package HackRU23Back.model;
import java.util.ArrayList;

public class Student {
	private int numClasses;
    private String name;
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
	public Student() {
		numClasses = 0;
		name = "";
		classYear = "";
		gradYear = 0;
		courseList = new ArrayList<Course>();
		gpa = 0.0;
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
		return this.gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	public ArrayList<Course> getCourseList() {
		return this.courseList;
	}

	public void setCourseList(ArrayList<Course> courseList) {
		this.courseList = courseList;
	}

	public double getGPA() {
		return this.gpa;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	
	public double calcGPA(ArrayList<Course> courses) {
		int total = 0;
		for (Course c : courses) {
			total += c
		}
	}
    
}
