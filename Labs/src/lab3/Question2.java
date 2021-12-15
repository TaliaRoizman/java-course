package lab3;

public class Question2 {

	public static void main(String[] args) {
		double tax = 0;
//		double salary = (Math.random()*200001);
		double salary = 50000;
		System.out.println("Salary before tax: " + salary);
		
		if (salary <= 23000) {
			tax = salary*0.1;
		} else if ((salary >= 23000) && salary < 50000) {
			tax =  (23000*0.1) + (salary-23000*0.2);
		} else if ((salary >= 50000) && (salary < 100000)) {
			tax = (23000*0.1) + ((50000-23000)*0.2) + ((salary-50000)*0.3);
		} else if ((salary >= 100000)) {
			tax = (23000*0.1) + ((50000-23000)*0.2) + ((50000)*0.3) + ((salary-100000)*0.4);
		}
		
		System.out.println("tax: " + tax);
		System.out.println("Update salary: " + (salary - tax));
	}
}
