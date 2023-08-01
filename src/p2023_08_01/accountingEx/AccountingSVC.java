package p2023_08_01.accountingEx;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountingSVC {
	// 기능 함수 정의
	ArrayList<AccountingVO> list = new ArrayList<>();

	//회원 삽입
	void insertMember(Scanner sc){
		System.out.println("[회원 정보 입력]");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println();

		System.out.print("연락처 : ");
		String phoneNum = sc.nextLine();
		System.out.println();

		System.out.print("주소 : ");
		String location = sc.nextLine();
		System.out.println();

		list.add(new AccountingVO(name, age, phoneNum, location));
	}
	//회원 목록 확인
	void checkMemberList(){
		for (AccountingVO tmp : list) {
			System.out.println(tmp.getField());
		}
	}

	//회원 정보 수정
	void modifyMember(){
		
	}

	//회원 삭제
	void deleteMember(){

	}
}
