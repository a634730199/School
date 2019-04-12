package pac;

public class Bird extends Animal{
	
	public Bird(String name) {
		super(name);
	}

	void fly() {
		System.out.println(name + "が飛びます");
	}
}
