import java.io.IOException;
import java.io.RandomAccessFile;

public class test {

	public static void main(String[] args) throws IOException{
		RandomAccessFile r = new RandomAccessFile("Z:\\java2\\git\\SwingSample\\src\\Calculator.txt","r");
		r.seek(0);
		for(int i = 1;i < r.length() - 1;i++) {
			if(!(r.readLine().equals(null))){
				System.out.print(r.readLine()+"\n");
			}
			System.out.print(r.getFilePointer());
		}
		r.seek(0);
		r.close();
	}

}
