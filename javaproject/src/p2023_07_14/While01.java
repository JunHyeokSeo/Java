package p2023_07_14;

public class While01 {
	public static void main(String[] args) {
		//while문을 이용해서 '사랑해요' 메세지를 10번 출력하는 프로그램
		int i = 1;		//초기값
		while(i < 10) {	//조건식
			System.out.println(i + " 사랑해요~!!");
			i++;		//증감식
		}
	}
}
