package p2023_07_24;

//hello 패키지 내 모든 클래스 및 인터페이스 import
import hello.*;

public class UsePackageHelloWorld {
    public static void main( String[] args ) {
	PackageHelloWorld phw = new PackageHelloWorld();
	phw.printHello();
    }
}
