package c.scope;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		int id;
		id = 10;
		System.out.println(id); // local
		System.out.println(this.id); // the value of the Person.id
		return this.id;
	}

}
