package app.core;

import java.util.Arrays;

public class ClassRoom {
	
	private String name;
	private Teacher teacher;
	private Student[] student = new Student[15];
	
	public ClassRoom() {
	}

	public ClassRoom(String name, Teacher teacher, Student[] student) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student[] getStudent() {
		return student;
	}

	public void setStudent(Student[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", teacher=" + teacher + ", student=" + Arrays.toString(student) + "]";
	}
	
}
