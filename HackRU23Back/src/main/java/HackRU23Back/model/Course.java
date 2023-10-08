package HackRU23Back.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course	{
	private String name;
	private String number;
	private String grade;
	private int credits;
	private double value;

	public Course(String name, String number, String grade, int credits) {
		this.name = name;
		this.number = number;
		this.grade = grade.toUpperCase();
		this.credits = credits;
		this.value = convertGradeToValue();
	}

	public double convertGradeToValue() {
		switch (grade) {
			case "A":
				return 4.0;
			case "B+":
				return 3.5;
			case "B":
				return 3.0;
			case "C+":
				return 2.5;
			case "C":
				return 2.0;
			case "D":
				return 1.0;
			case "F":
				return 0.0;
			default:
				return 0.0;
		}
	}
}

