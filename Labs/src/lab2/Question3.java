package lab2;

public class Question3 {

	public static void main(String[] args) {
//		double salary = 5999.568097364226;
		double salary = (Math.random() * 1001) + 5000;
		System.out.println("Current salary: " + salary);
		double newSalary = salary*1.1; 
		newSalary = Math.round(newSalary);
		if (newSalary < 6000) {
			salary = newSalary;
		} else {
			salary = salary * 1.05;
		}
		System.out.println("Update salary: " +salary);
	}
}
