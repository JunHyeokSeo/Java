package p2023_07_28;

public abstract class AbsClass {  // 추상 클래스
	int a;
	
	// 추상메소드:메소드 이름만 있고, 내용이 없는 메소드
	public abstract void check(); // 추상메소드
	public void check01() {
		System.out.println("일반 메소드");
	}

}
