import java.util.ArrayList;

public class Ex001 {

	public static void main(String[] args) {
		ArrayList<Student> str = new ArrayList<Student>();
		Student a = new Student("あら",21);
		Student a1 = new Student("いう",27);
		Student a2 = new Student("わわ",1);

		str.add(a);
		str.add(a1);
		str.add(a2);

		for(int i = 0;i < str.size();i++) {
			Student a3 = str.get(i);
			System.out.println(a3.getName() + "\t" + a3.getAge());
		}
	}

}
