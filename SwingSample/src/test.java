import java.io.BufferedReader;
import java.io.FileReader;

public class test {
	final String pathName = "Z:/java2/git/SwingSample/src/Calculator.txt";
	public static void main(String[] args){

	}
	String ReadFile(String pathName) {
		String str = null;
		try(BufferedReader r = new BufferedReader(new FileReader(pathName))){
			while ((str = r.readLine()) != null) {
                str += r.readLine();
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return str;

	}
}
