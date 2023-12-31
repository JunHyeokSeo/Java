package p2023_07_12;

import java.util.ArrayList;
import java.util.List;

public class Variable {
	public static void main(String[] args) {
//변수 : 메모리 상에 데이터를 저장하기 위한 기억 공간
//변수를 만드는 방법 : <자료형> <변수명> = 데이터(값);

//	기본 자료형 변수
//		1. 정수형 변수
		byte b1 = 10;		// -128 ~ 127
//		byte b2 = 130;		// 오버플로우 발생
		short s = 100;		// -32768 ~ 32767
		int i = 1000;		// -21억 ~ 21억
		long l = 100000L; 
		
		System.out.println("b1 = " + b1);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

//		2. 실수형 변수
		float ft1 = 3.14f;			//float형은 f를 붙여야함
		float ft2 = 3.14F;			//대소문자 상관없음
		float ft3 = (float)3.14;	//double형을 float형으로 강제 형변환
		double d = 42.195;
		
		System.out.println("ft1 = " + ft1);
		System.out.println("ft2 = " + ft2);
		System.out.println("ft3 = " + ft3);
		System.out.println("d = " + d);
		System.out.printf("%.1f\n", d);		//소수 첫째자리까지 출력 : 42.2(반올림)
		System.out.printf("%.2f\n", d);		//소수 둘째자리까지 출력 : 42.20(반올림)
	
//		3. 문자형 변수(char - 2Byte)
		char c1 = 'A';
//		char c2 = 'AB';		//오류 발생
		char c3 = '안';		//한글 한글자 = 2Byte : 저장가능
		System.out.println("c1 = " + c1);
		System.out.println("c3 = " + c3);
		
//		4. 논리형 변수
		boolean bn1 = true;
		boolean bn2 = false;
		System.out.println("bn1 = " + bn1);
		System.out.println("bn2 = " + bn2);

//	참조형 : 실제 값이 저장된 주소를 저장
//	참조형 변수 : 클래스
		String s1 = "자바";
		String s2 = new String("자바");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		//주소를 비교
		if (s1 == s2) System.out.println("같은 주소");
		else System.out.println("다른 주소");
		
		//데이터(값)을 비교
		if(s1.equals(s2)) System.out.println("같은 값");
		else System.out.println("다른 값");

//	참조형 변수 : 배열 - 동일한 자료형의 데이터를 저장하는 정적인 자료구조
		int[] score = {80, 90, 100};
		//hard coding
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		//loop
		for (int j = 0; j < score.length; j++)
			System.out.print(score[j] + "\t");
		System.out.println();
//	참조형 변수 : 인터페이스(List)
		//	List 특징(배열이 갖지 못하는 기능을 가짐)
		//	1. 순차적인 자료구조
		//	2. 여러가지 자료형의 데이터를 모두 저장할 수 있다
		//	3. 동적으로 공간의 크기를 늘릴 수 있다
		
		// 인터페이스는 자체적으로 객체 생성을 할 수 없다
		// 상속을 받는 구현 클래스를 정의해두고, 상속을 받아 사용.
		// 배열과 유사하게 인덱스 순서대로 저장.
		// 기억공간을 필요에 의해 늘리고 줄일 수 있다
		// 서로 다른 자료형 저장 가능
		// List list = new List(); // 오류 발생
		List list = new ArrayList();	//형변환이 이루어짐
		list.add(30);
		list.add(3.14);
		list.add('j');
		list.add(true);
		list.add("자바");
		
		for (int k = 0; k < list.size(); k++)
			System.out.print(list.get(k) + "\t");
	}
}
