package p2023_07_31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Collections01 {
	public static void main(String[] args) {
		
		// Set은 인터페이스이기 때문에 자체적으로 객체를 생성할 수 없다.
//		Set s = new Set();				// 오류발생
		
		Set set = new HashSet();		// 업캐스팅	
//		HashSet	set = new HashSet();
		
		System.out.println("요소의 갯수->" + set.size()); // 0개
		
//		boolean add(Object e)	
		set.add("하나");					// 업캐스팅
		set.add(2);
		set.add(3.42);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);				
		
		// Set은 중복 데이터를 저장할 수 없다.	
		System.out.println("요소의 갯수->" + set.size()); // 6개
		System.out.println(set);

//		Iterator(반복자) : 2, 6, 넷, 하나, 3.42, five
		Iterator elements = set.iterator();
		while (elements.hasNext()) { // 가져올 데이터가 있을때 true리턴
			System.out.println("\t\t" + elements.next());
		}	// next() : 데이터를 1개씩 가져오는 역할

		/*
		 * Vector에만 적용 Enumeration enu = set.elements(); while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}
