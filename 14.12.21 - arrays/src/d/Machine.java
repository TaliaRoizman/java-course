package d;

public class Machine {
	public static void main(String[] args) {

		String[] mode = { "On", "Off", "Stand_by" };
		int current_mode = (int) (Math.random() * 3);
		System.out.println(mode[current_mode]);
		
		switch(current_mode) {
		case 0:
			System.out.println("machine on");
			break;
		case 1:
			System.out.println("machine off");
			break;
		case 2:
			System.out.println("machine stand by");
			break;
		}

	}
}
