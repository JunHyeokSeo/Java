package p2023_08_02.queueEx;

import java.util.LinkedList;
import java.util.Queue;

class LinkedListTest {
	public static void main(String[] args) {

//		큐(Queue) : FIFO(First Input First Output)구조
		
		// Queue는 인터페이스이기 때문에 자체적으로 객체 생성을 할 수 없다.
//		Queue q = new Queue();
		
		Queue my = new LinkedList();			// 업캐스팅
		LinkedList myQue = new LinkedList();
		myQue.offer("1-자바");
		myQue.offer("2-C++");
		myQue.offer("3-API");
		myQue.offer("4-MFC");

		//poll - 현재 큐에 요소가 있는지 확인 후 요소 반환, 비어 있는 큐라면 null 반환
		//pop - 별도의 확인 없이 removeFirst(), 비어있는 큐라면 예외 발생
		System.out.println(myQue.poll()); // 1-자바
		System.out.println(myQue.poll()); // 2-C++
		System.out.println(myQue.poll()); // 3-API
		System.out.println(myQue.poll()); // 4-MFC
		System.out.println(myQue.poll()); // null
		// 큐(Queue)가 비어 있으면 null값을 리턴함
		
//		while (myQue.peek() != null) // 큐가 비어있지 않다면
//		  System.out.println(myQue.poll()); // 큐에서 데이터를 꺼내온다.
	}
}


