import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {

	public static void main(String[] args) {
		File outputFile = new File ("streamData1.txt");
		try {
			FileOutputStream out = new FileOutputStream(outputFile);
			int i = 0 , c;
			for(c = 0;c < 51;c++) {
				out.write(c);
			}
			for(c = 250;c < 256;c++) {
				out.write(c);
			}
			out.close();

			FileInputStream in = new FileInputStream(outputFile);
			while((c = in.read()) != -1) {
				String d = String.format("%d", c);
				System.out.print("  " + d);
				if(++i % 20 == 0) {
					System.out.println();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
