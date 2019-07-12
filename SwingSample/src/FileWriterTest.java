import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {

		String strFileName = "Z:\\file.txt";
		String[] data = {"lion","tiger","wolf","cat","dog","mouse"};

		System.out.println("出力処理を開始します");
		System.out.println("File : "+ strFileName);

		try {
			FileWriter fw = new FileWriter(strFileName ,false);
			fw.write(data[0]);
			for(int i = 1;i < data.length;i++) {
				fw.write(','+data[i]);
			}
			fw.close();
		}catch(IOException e) {
			System.out.println("IOException ERROR");
			System.out.println(e);
		}finally {
			System.out.println("出力処理終了しました");
		}

		System.out.println("入力処理を開始します");
		try {
			FileReader fr = new FileReader("Z:\\\\file.txt");
			int ch;
			while ((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
			System.out.println();
			fr.close();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("入力処理終了しました");
		}

	}

}
