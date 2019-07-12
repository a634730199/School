import java.io.IOException;
import java.io.RandomAccessFile;

public class FileWrapper{
	private String pathName;
	private String filepath;

	public FileWrapper() {
		pathName = "無題.txt";
	}

	public FileWrapper(String pathName) {
		this.pathName = pathName;
	}



	public FileWrapper(String pathName, String filepath) {
		this.pathName = pathName;
		this.filepath = filepath;
	}

	public void readFile() throws IOException{
		RandomAccessFile r = new RandomAccessFile(filepath,"r");
		r.seek(0);

	}









































	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getPathName() {
		return pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public String readTextFile() {
		String result = "";
		return result;
	}


	void


}
