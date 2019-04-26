import java.util.ArrayList;

public class Ex004 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		int num1 = -1;
		while(num.size() < 5){
			num1 = (int)(Math.random() * 100 + 1);
			if(!(num.contains(num1))) {
				num.add(num1);
			}
		}
		for(int a : num) {
			System.out.print(a);
			System.out.print("\t");
		}

	}

}
