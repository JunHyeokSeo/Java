package p2023_08_07.fileEx;// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		try {
			// File 객체 생성
			File temp = new File("C:/java01", "temp");
			File tempFile = new File("test");

			// 디렉토리 생성(mkdirs()는 디렉토리를 만들면 true를 반환함)
			// 실제 디렉토리 생성 시점
			System.out.println("create directory state : " + temp.mkdirs());
			System.out.println("create directory state : " + tempFile.mkdirs());

			// 1. 디렉토리 삭제 : 비어있는 디렉토리 삭제
//			tempFile.delete();
			// 2. 비어있지 않는 디렉토리 삭제
//			if (deleteFolder(tempFile)){
//				System.out.println("파일 삭제 성공 : " + tempFile.getName());
//			} else {
//				System.out.println("파일 삭제 실패 : " + tempFile.getName());
//			}
			// 3. 자식 디렉토리 삭제
//			temp.delete();
			// 4. 부모 디렉토리 삭제
//			temp.getParentFile().delete();

			// File 클래스에서 제공하는 메소드로 파일 시스템에 대한
			// 여러가지 정보를 얻을수 있음
			System.out.println("temp canRead : " + temp.canRead());
			System.out.println("temp canWrite : " + temp.canWrite());
			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
			System.out.println("temp getName : " + temp.getName());
			System.out.println("temp getParent : " + temp.getParent());
			System.out.println("temp getPath : " + temp.getPath());
			System.out.println("temp isDirectory : " + temp.isDirectory());
			System.out.println("temp isFile : " + temp.isFile());
		} catch (Exception e) {
		}
	}

//	public static boolean deleteFolder(File folder){
//		if(folder.isDirectory()){
//			for (File file : folder.listFiles()) {
//				deleteFolder(file);
//			}
//		}
//		System.out.println("삭제 대상 : " + folder.getAbsolutePath());
//		return folder.delete();
//	}
}
