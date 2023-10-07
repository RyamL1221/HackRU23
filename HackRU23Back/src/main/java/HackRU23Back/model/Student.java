package HackRU23Back.model;
import java.util.ArrayList;

public class Student {
	private int numClasses;
    private String name;
    private String classYear; // i.e. "Freshman, Sophomore, etc."
    private int gradYear; // i.e. "2027, 2026, etc."
    private ArrayList<Course> courseList;
	private double gpa
	
    
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
		return numClasses;
	}
	public String getName() {
		return name;
	}
	public String getClassYear() {
		return classYear;
	}
	public int getGradYear() {
		return gradYear;
	}
	public ArrayList<Course> getCourseList() {
		return courseList;
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
