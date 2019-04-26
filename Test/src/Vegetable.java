
public class Vegetable {
	private String name;
	private int value;
	private int stock;

	public Vegetable(String name, int value, int stock) {
		this.name = name;
		this.value = value;
		this.stock = stock;
	}

	void decreaseStock(int stock) {
		//在庫数の減少
	}

	public String toString() {
		//インスタンス情報の取得
		return "名前：" + name + "\t" +
				"単価：" + value + "\t" +
				"在庫数" + stock +"\n";
	}






	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}


}
