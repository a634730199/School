package pac;
/*
 * 9 * 9
 */
public class Ex001 {

	public static void main(String[] args) {
		int num;
		for(int i = 1;i < 10;i++) {
			for(int j = 1;j <= i;j++) {
				num = i * j;
				System.out.print(i + "*" + j + "=" + num + "   ");
			}
			System.out.println();
		}

	}

}
