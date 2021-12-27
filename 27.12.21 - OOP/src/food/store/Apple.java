package food.store;

public class Apple extends Fruit {

	public Apple() {
		super();
	}

	public Apple(double weight, String taste) {
		super(weight, taste);
	}

	@Override
	public String toString() {
		return "Apple [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
