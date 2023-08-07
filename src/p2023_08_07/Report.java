package p2023_08_07;

import java.io.File;

public class Report {

	public static void main(String[] args) {
		try {
			String fileName = "test";
			File testDirectory = new File(fileName);
			deleteFolder(testDirectory);
		} catch (Exception e) {
		}
	}

	public static boolean deleteFolder(File folder){
		if (folder.isDirectory()){
			for (File file : folder.listFiles()) {
				deleteFolder(file);
			}
		}
		System.out.println("삭제 한 파일 : " + folder.getAbsoluteFile());
		return folder.delete();
	}
}
