package p2023_08_01.vectorEx;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumIterVector {

	public static void main(String[] args) {

		// Vector 객체 생성
		Vector v = new Vector(1, 1);

		// Vector에 Object 저장
		v.add(30);
		v.addElement(new Integer(10));
		v.addElement("johnharu");
		v.addElement("gracedew");
		
//		방법1. vector 자료구조에 저장된 데이터 출력
		System.out.println(v);
		
//		방법2.
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
		System.out.println();

//		방법3.
//		나열형(Enumeration): 30, 10, johnharu, gracedew
		Enumeration e = v.elements();		
		while (e.hasMoreElements()) { //가져올 데이터가 있을때 true리턴	
			System.out.print(e.nextElement()+"\t");
		}
		System.out.println();

//		방법4.
//		반복자(Iterator) : 30, 10, johnharu, gracedew
		Iterator ie = v.iterator();
		while (ie.hasNext()) { //가져올 데이터가 있을때 true리턴	
			System.out.print(ie.next()+"\t");
		}

	} // main end
}
