package p2023_07_14;

public class While04 {

	public static void main(String[] args) {
		//while문을 이용해서 구구단(2~9단)까지 출력
		int dan= 2, i;
		while(dan <= 9) {
			i = 1;
			System.out.println("[" + dan + "단]");
			while(i <= 9) {
				System.out.println(dan + "*" + i + "=" + dan * i);
				i++;
			}
			dan++;
			System.out.println();
		}
	}
}
