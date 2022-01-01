package main;

import app.core.ClassRoom;
import app.core.Grade;
import app.core.Person;
import app.core.School;
import app.core.Student;
import app.core.profession;

public class SchoolStatistics {

	public static String getRandomName() {
		String[] names = { "Moshe", "Shir", "Yuval", "Dina", "Maayan", "Lidor" };
		return names[(int) (Math.random() * names.length)];
	}

	public static int getRandomAge() {
		int age = (int) (Math.random() * (Person.MAX_AGE - Person.MIN_AGE)) + Person.MIN_AGE;
		return age;
	}

	public static Student getRandomStudent() {

		Student student = new Student();
		student.setName(getRandomName());
		student.setAge(getRandomAge());

		Grade[] grades = new Grade[6];
		for (int i = 0; i < grades.length; i++) {
				int score = (int) (Math.random() * (Grade.MAX_SCORE - Grade.MIN_SCORE)) + Grade.MIN_SCORE;
				grades[i] = new Grade(profession.values()[i], score);		
		}
		student.setGrades(grades);
		return student;
	}

	public static void main(String[] args) {
		School school = new School();
		ClassRoom classroom = new ClassRoom();
		System.out.println(getRandomStudent().toString());

	}

}
