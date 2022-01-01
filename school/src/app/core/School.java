package app.core;

import java.util.Arrays;

public class School {
	
	private ClassRoom[] classroom = new ClassRoom[5];
	
	public School() {
	}

	public School(ClassRoom[] classroom) {
		this.classroom = classroom;
	}

	public ClassRoom[] getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassRoom[] classroom) {
		this.classroom = classroom;
	}

	@Override
	public String toString() {
		return "School [classroom=" + Arrays.toString(classroom) + "]";
	}
	
}
