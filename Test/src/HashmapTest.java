import java.util.HashMap;

public class HashmapTest {

	public static void main(String[] args) {
		HashMap<Integer , String> hm = new HashMap<Integer , String>();
		
		hm.put(1, "山田太郎");
		hm.put(2, "山田一郎");
		hm.put(3, "山田次郎");
		hm.put(4, "山田三郎");
		
		hm.forEach((k,v) -> System.out.println(k + v));
		

	}

}
