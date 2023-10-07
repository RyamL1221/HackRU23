package HackRU23Back.model;

public class Course {
	private String name;
	private String number;
	private String grade;
	private int credits;
	private double value;
	
	
	public Course(String n, String num, String g, int c) {
		name = n;
		number = num;
		grade = g;
		credits = c;
		value = 
	}
	public Course() {
		name = "";
		number = "";
		grade = "";
		credits = 0;
		value = 0;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	
	
}

