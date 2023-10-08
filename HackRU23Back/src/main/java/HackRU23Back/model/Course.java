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
	private Long id;
	private String name;
	private String number;
	private String grade;
	private int credits;
	private double value;
	private String code;
}

