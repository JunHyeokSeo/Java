package p2023_07_20;

import java.util.Scanner;

class MemberInfo{
	private String name;
	private int age;
	private String email;
	private String address;

	//생성자 통한 필드 초기화
	MemberInfo(String name, int age, String email, String address){
		this.name = name;
		this.age = age;
		this.email = email;
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
		String[] input = new String[4];
		int age = 0, member = 0;

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 회원의 수를 입력하세요");
		member = sc.nextInt();
		input[0] = sc.nextLine(); //버퍼 비우기
		MemberInfo[] infoArr = new MemberInfo[member];
		for (int i = 0; i < member; i++){
			System.out.printf("[%d번째 회원의 정보를 입력하세요]\n", i + 1);
			for (int j = 0; j < strArr.length; j++){
				System.out.printf("%d. %s : ", (j + 1), strArr[j]);
				if (strArr[j].equals("age")){
					age = sc.nextInt();
					input[j] = sc.nextLine();
				}
				else input[j] = sc.nextLine();
			}
			infoArr[i] = new MemberInfo(input[0], age, input[2], input[3]);
		}

		//출력
		for (int i = 0; i < member; i++) {
			System.out.printf("[%d번째 회원님의 정보를 출력합니다]\n", i + 1);
			infoArr[i].print();
		}
		sc.close();
	}
}
