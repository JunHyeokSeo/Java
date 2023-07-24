package p2023_07_24.StringEx;

//replace(oldChar, newChar);
public class ReplaceEx {
	public static void main(String[] args) {
		//자바를 Java로 치환
		String oldStr = "자바는 객체지향 언어 입니다.";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
