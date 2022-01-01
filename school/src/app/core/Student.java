package app.core;

import java.util.Arrays;

public class Student extends Person {

	private Grade[] grades = new Grade[6];

	public Student() {
		super();
	}

	public Student(String name, int age, Grade[] grades) {
		super(name, age);
		this.grades = grades;
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", age=" + getAge() + ", grades=" + Arrays.toString(grades) + "]";
	}

}
