import java.io.BufferedReader;
import java.io.FileReader;

public class FileWrapper{
	private String pathName;
	private String filepath;
	String str;

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


String ReadFile() {
		try(BufferedReader r = new BufferedReader(new FileReader(pathName))){
			while ((str = r.readLine()) != null) {
                str += r.readLine();
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return str;

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


}
