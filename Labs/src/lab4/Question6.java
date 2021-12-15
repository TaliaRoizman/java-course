package lab4;

public class Question6 {

	public static void main(String[] args) {
		int max = (int)(Math.random()*101);
		int den = (int)(Math.random()*101);
		System.out.println("max: "+ max + ", Den: " + den);
		for(int i=0; i<=max; i++) {
			if (i%den == 0 ) {
				System.out.println(i);
			}
		}
		

	}

}
