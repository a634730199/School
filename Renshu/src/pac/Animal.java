package pac;

public class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}

	void walk() {
		System.out.println(name+"が歩きます");
	}
}
