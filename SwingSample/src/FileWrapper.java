import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrapper{
	private String pathName;

	public FileWrapper(String pathName) {
		this.pathName = pathName;
	}



public String ReadFile() {
	File f = new File(pathName);
	FileReader fr = null;
	BufferedReader r = null;
	String str = "";
		try{
			fr = new FileReader(f);
			r = new BufferedReader(fr);
			while (r.readLine() != null) {
                str += r.readLine() + "\n";
            }
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(r != null) {
				try {
					r.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return str;

	}
public void WriteFile(String data) {
	File f = new File(pathName);
	BufferedWriter br = null;
	FileWriter fw = null;
	try{
		fw = new FileWriter(f);
		br = new BufferedWriter(fw);
		br.write(data);
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}



	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}


}
