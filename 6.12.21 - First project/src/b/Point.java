package b;

public class Point {
	int x;
	int y;
	
	void print() {
		System.out.print("(");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.print(")");
	}
	
	void moveRight() {
		x++;
	}
	void moveLeft() {
		x--;
	}
	void moveUp() {
		y++;
	}
	void moveDown() {
		y--;
	}
}


