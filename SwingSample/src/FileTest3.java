import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("test.txt");
		String path = file.getAbsolutePath();
		System.out.println("絶対パス"+path);

	}

}
