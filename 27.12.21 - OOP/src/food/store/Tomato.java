package food.store;

public class Tomato extends Vegetable {

	public Tomato() {
		super();
	}

	public Tomato(double weight, String taste) {
		super(weight, taste);
	}

	@Override
	public String toString() {
		return "Tomato [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
