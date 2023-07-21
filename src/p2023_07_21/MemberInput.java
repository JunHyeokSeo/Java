package p2023_07_21;

import java.util.Scanner;

class MemberInfo{
	private String name;
	private int age;
	private String email;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//method 통한 출력
	void print(){
		System.out.println("name \t\t: " + name);
		System.out.println("age \t\t: " + age);
		System.out.println("email \t\t: " + email);
		System.out.println("address \t: " + address);
	}
}

public class MemberInput {
	public static void main(String[] args) {
		String[] strArr = {"name", "age", "email", "address"};
		int member = 0;

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 회원의 수를 입력하세요");
		member = Integer.parseInt(sc.nextLine());
		MemberInfo[] infoArr = new MemberInfo[member];
		for (int i = 0; i < member; i++){
			infoArr[i] = new MemberInfo();
			System.out.printf("[%d번째 회원의 정보를 입력하세요]\n", i + 1);
			System.out.print(strArr[0] + "\t: "); infoArr[i].setName(sc.nextLine());
			System.out.print(strArr[1] + "\t\t: "); infoArr[i].setAge(sc.nextLine());
			System.out.print(strArr[2] + "\t: "); infoArr[i].setEmail(sc.nextLine());
			System.out.print(strArr[3] + "\t: "); infoArr[i].setAddress(sc.nextLine());
		}
		//출력
		for (int i = 0; i < member; i++) {
			System.out.printf("[%d번째 회원님의 정보를 출력합니다]\n", i + 1);
			infoArr[i].print();
		}
		sc.close();
	}
}
