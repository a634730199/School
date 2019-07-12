import java.io.File;

public class Filetest2 {

	public static void main(String[] args) {
		File cdiretory = new File("Z:\\");
		File filelist[] = cdiretory.listFiles();
		for(int i = 0;i<filelist.length;i++) {
			if(filelist[i].isFile()) {
				System.out.println("[F]"+filelist[i].getName());
			}else if(filelist[i].isDirectory()) {
				System.out.println("[D]"+filelist[i].getName());
			}else {
				System.out.println("[?]"+filelist[i].getName());
			}


		}

	}

}
