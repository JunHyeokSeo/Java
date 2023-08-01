package p2023_08_01.mapEx;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class HashTableTest {
	public static void main(String[] args) {
		
		//1.업캐스팅이 되면 참조 가능한 영역의 축소가 일어난다.
		//2.업캐스팅이 되면 부모가 상속해준 메소드만 접근할 수 있다.
		//3.keys()메소드는 부모인 Map이 상속해준 메소드가 아니기 때문에
		//  업캐스팅 방식으로 Map객체를 생성하면 사용할 수 없다.
		
//		Map ht = new Hashtable();		// 업캐스팅
		Hashtable ht= new Hashtable();
		
//		put(Object key, Object value)
		ht.put("딸기", "StrawBerry");		// 업캐스팅
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");
		ht.put("count", 10);

//	방법1. key를 알고 있는 경우
		// Object get(Object key)
		// Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");		// 다운캐스팅
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}

		String s = (String) ht.get("딸기");		// 다운캐스팅
		String a = (String) ht.get("사과");
		Integer it = (Integer)ht.get("count");  // 다운캐스팅
		int i = it.intValue();					// 언박싱
		
		// 다운캐스팅 + 언박싱
		int ii = ((Integer)ht.get("count")).intValue();
		
//  방법2. key를 모르는 경우	
//		열거형(Enumeration) : 딸기, 사과, 포도
		Enumeration Enum = ht.keys();	// Map의 모든 key를 구해옴
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
