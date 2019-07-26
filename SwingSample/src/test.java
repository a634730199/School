import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
	final static String pathName = "C:/Users/18yn0108/Desktop/Calculator.txt";
	public static void main(String[] args){
		File f = new File(pathName);
		FileReader fr = null;
		BufferedReader r = null;
		try{
			String str = null;
			fr = new FileReader(f);
			r = new BufferedReader(fr);
			while ((str = r.readLine()) != null) {
                System.out.print(str + "\n");
            }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(r != null)
					r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
