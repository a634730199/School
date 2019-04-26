import java.util.ArrayList;

public class Ex005 {

	public static void main(String[] args) {
		ArrayList<Vegetable> list = new ArrayList<Vegetable>();

		Vegetable vegetable = new Vegetable("ピーマン",100,10);
		Vegetable vegetable1 = new Vegetable("トマト",290,10);
		Vegetable vegetable2 = new Vegetable("キャベツ",150,10);
		Vegetable vegetable3 = new Vegetable("すいか",1000,10);

		list.add(vegetable);
		list.add(vegetable1);
		list.add(vegetable2);
		list.add(vegetable3);


		for(Vegetable a : list) {
			System.out.print(a.toString());
		}

		POS pos = new POS(list);

	}

}
