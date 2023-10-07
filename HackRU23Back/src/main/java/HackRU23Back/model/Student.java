package HackRU23Back.model;
import java.util.ArrayList;

public class Student {
	private int numClasses;
    private String name;
    private String classYear; // i.e. "Freshman, Sophomore, etc."
    private int gradYear
    private ArrayList<Course> courseList;
	private double gpa;
    
	public Student(int nC, String n, String cY, int gY, ArrayList<Course> cL) {
		numClasses = nC;
		name = n;
		classYear = cY;
		gradYear = gY;
		courseList = cL;
		gpa = calcGPA()
	}
	
	public double calcGPA(ArrayList<Course> courses) {
		
	}
    
}
