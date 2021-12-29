package food.store;

public class Carrot extends Vegetable {

	public Carrot() {
		super();
	}

	public Carrot(double weight, String taste) {
		super(weight, taste);
	}

	@Override
	public String toString() {
		return "Carrot [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

	
}
