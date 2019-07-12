import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.Reader;

public class PipeStreamSample{

	public static void main(String[] args) throws IOException {
		PipeStreamSample obj = new PipeStreamSample();
		obj.soryout(obj.getData());

	}

	Reader getData() throws IOException{
		FileReader seiseki = new FileReader("Z:\\seiseki.csv");

		BufferedReader bin = new BufferedReader(seiseki);

		PipedWriter pipeOut = new PipedWriter();

		PipedReader pipeIn = new PipedReader(pipeOut);

		PrintWriter out = new PrintWriter(pipeOut);

		String[] arrayLine;
		String line;

		while((line = bin.readLine())!= null) {
			arrayLine = line.split(",");

			int s1 = Integer.parseInt(arrayLine[1]);
			int s2 = Integer.parseInt(arrayLine[2]);
			int s3 = Integer.parseInt(arrayLine[3]);

			int goukei = s1 + s2 + s3;

			out.println(line + "," + String.valueOf(goukei));
			out.flush();

		}
		bin.close();
		out.close();

		return pipeIn;

	}


	void soryout(Reader source) throws IOException{
		BufferedReader in = new BufferedReader(source);
		String line;
		String[][] seiseki = new String[5][5];
		int s = 0,r = 0;

		while((line = in.readLine())!=null) {
			seiseki[s] = line.split(",");
			s++;
		}
		int j = 0;

		int m = seiseki.length - 1;

		for(int i = 0;i < seiseki.length - 1;i++) {
			for(j = seiseki.length - 1;j > i;j--) {
				int s1 = Integer.parseInt(seiseki[j][m]);
				int s2 = Integer.parseInt(seiseki[j-1][m]);
				if(s1 > s2) {
					String temp[] = seiseki[j];
					seiseki[j] = seiseki[j-1];
					seiseki[j-1] = temp;

				}
			}
		}

		System.out.println("番号"+"\t"+"名前"+"\t"+"英語"+"\t"+"数学"+"\t"+"国語"+"\t"+"合計");

		for(int k = 0;k< seiseki.length;k++) {
			for(int l = 0;l<seiseki[k].length;l++) {
				System.out.print((String)seiseki[k][j]+"\t");

			}
			System.out.println();
		}
		in.close();
	}

}
