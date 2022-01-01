package app.core;

public class Person {

	private String name;
	private int age = 20;
	public static final int MIN_AGE = 20;
	public static final int MAX_AGE = 120;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {
		if (age >= MIN_AGE && age <= MAX_AGE) {
			this.age = age;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	

}
