package pac;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(num != -1) {
			System.out.print("数字を入力してください：");
			num = Input.nextInt();
			sum += num;
		}
		System.out.println("合計"+(sum + 1));
		Input.close();
		///meixiewan

	}

}
