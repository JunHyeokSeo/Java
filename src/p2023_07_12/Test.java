package p2023_07_12;

//java.lang 패키지 안에 들어있는 클래스는 import를 생략할 수 있다.
//import java.lang.System;
//import java.lang.String;

//import java.util.* - util 패키지 내부의 모든 클래스 및 인터페이스 import
import java.util.Date;
import java.util.Random;

//public - 접근제어자
//Test - 사용자 정의 클래스
public class Test {
	// static - 정적메소드(공유를 위한 개념)
	// main() 메소드는 자바가상머신(JVM:java.exe)이 가장 먼저 호출하는 메소드이다.
	// 1개의 클래스가 독립적으로 실행되기 위해서는 반드시 main 메소드가 필요하다
	public static void main(String[] args) {
		System.out.println("java 출력 성공");
		System.out.println("자바");
		System.out.println("오라클");
		System.out.println("파이썬");
		
		//Date 객체 생성
		Date d = new Date();
		System.out.println(d);
		
		//Random 객체 생성
		Random r = new Random();
		System.out.println(r.nextInt(10)); // 0 ~ 9 사이의 난수 발생
	}
}