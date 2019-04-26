import java.util.ArrayList;

public class Ex003 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		for(int i = 0;i < 5;i++) {
			int num1 = (int)(Math.random() * 100);
			num.add(num1);
		}
		for(int a : num) {
			System.out.print(a);
			System.out.print("\t");
		}

	}

}
