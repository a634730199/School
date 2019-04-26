import java.util.List;

public class POS {
	List<Vegetable> vegetables ;

	public POS(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}

	void dispVegetables() {
		//List中の野菜の名前をすべて表示


		for(Vegetable a : vegetables) {
			System.out.print(a.getName());
		}
	}

	void dispValue(String name) {
		//単価表示
	}


}
