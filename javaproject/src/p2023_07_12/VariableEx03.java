package p2023_07_12;

// p66
// \t : 탭만큼 띄움
// \n : 줄 바꿈
// \r : 캐리지리턴(커서를 맨 앞으로 이동)
// \" : " 출력
// \' : ' 출력
// \\ : \ 출력
// \\u16진수 : 16진수 유니코드에 해당하는 문자 출력

public class VariableEx03 {
	public static void main(String[] args) {
		System.out.println("번호\t\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.print("봄\\여름\\가을\\겨울\\");
		System.out.println("hello\rworld"); //world만 출력
	}
}
