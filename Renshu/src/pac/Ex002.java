package pac;

import java.util.Scanner;

/*
 * 奇数　偶数　判断
 */
public class Ex002 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("数字を入力してください：");
		int num =  Input.nextInt();
		System.out.println(num  % 2 == 0 ? "偶数" : "奇数");
		Input.close();

	}

}
