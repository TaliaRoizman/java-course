package e.operators;

public class Demo1 {
	
	public static void main(String[] args) {
		
	int x = 5;
	int y = 67;
	int sum = x + y; // binary operator;
	int max = x > y ? x : y; // ternary operator ?:
	System.out.println(sum);
	System.out.println(max);
	System.out.println(x++); // print then increment
	System.out.println(++x); // increment then print
	
	int a = 5;
	int b = ++a; // a=6, b=6 
	int c = a++; // c=6, a=7
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	}

}
