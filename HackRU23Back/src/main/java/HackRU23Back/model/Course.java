package HackRU23Back.model;

public class Course {
	private String name;
	private String number;
	private String grade;
	private int credits;
	
	public Course(String n, String num, String g, int c) {
		name = n;
		number = num;
		grade = g;
		credits = c;
	}
	public Course() {
		name = "";
		number = "";
		grade = "";
		credits = 0;
	}
}

