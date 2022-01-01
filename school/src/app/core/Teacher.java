package app.core;

public class Teacher extends Person {

	private profession profession;

	public Teacher() {
	}

	public Teacher(String name, int age, profession profession) {
		super(name, age);
		this.profession = profession;
	}

	public profession getProfession() {
		return profession;
	}

	public void setProfession(profession profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Teacher [ name=" + getName() + ", age=" + getAge() + ", profession=" + profession + "]";
	}

}
