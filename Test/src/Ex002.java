import java.util.ArrayList;

public class Ex002 {

	public static void main(String[] args) {
		ArrayList<Student> str = new ArrayList<Student>();
		Student a = new Student("あら",21);
		Student a1 = new Student("いう",27);
		Student a2 = new Student("わわ",1);

		str.add(a);
		str.add(a1);
		str.add(a2);

		for(Student st : str) {
			System.out.println(st.getName() + "\t" + st.getAge());
		}
	}

}