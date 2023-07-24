package p2023_07_24.StringEx;

public class SubstringEx {
	public static void main(String[] args) {
		//주민번호 통해 남여 구분
		String jumin = "951007-1234567";
		String sex = jumin.substring(7, 8);
		if (sex.equals("2") || sex.equals("4")) System.out.println("여자");
		else if (sex.equals("1") || sex.equals("3")) System.out.println("남자");
		else System.out.println("wrong input");

//		char sex = jumin.charAt(7);
//		if (sex == '2' || sex == '4') System.out.println("여자");
//		else System.out.println("남자");
	}
}
