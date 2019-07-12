import java.io.IOException;
import java.io.RandomAccessFile;

public class test {

	public static void main(String[] args) throws IOException{
		RandomAccessFile r = new RandomAccessFile("Z:\\java2\\git\\SwingSample\\src\\Calculator.txt","r");
		long pos = r.length() - 1;
		String[] str = new String[(int)pos];
		while(pos > 0) {
			pos--;
			r.seek(pos);
			if(r.readByte()=='\n') {
				str[(int)pos] = r.readLine()+"\n";
			}
		}


		for(long i = r.length() - 2;i > 0;i--) {
			System.out.print(str[(int) i]);
		}

		r.seek(0);
		r.close();
	}

}
