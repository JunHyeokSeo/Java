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

		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());

		System.out.print("연락처 : ");
		String phoneNum = sc.nextLine();

		System.out.print("주소 : ");
		String location = sc.nextLine();

		list.add(new AccountingVO(name, age, phoneNum, location));
	}
	//회원 목록 확인
	void checkMemberList(){
		System.out.println("[회원 목록 출력]");
		int i = 1;
		for (AccountingVO tmp : list) {
			System.out.println("[" + i++ + ".] " + tmp.getField());
		}
		System.out.println("---------------------------------------");
	}

	//회원 정보 수정
	void modifyMember(Scanner sc){
		if (list.size() < 1){
			System.out.println("수정할 회원이 없습니다.");
			return ;
		}
		checkMemberList();
		System.out.println("수정할 회원의 번호를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		if (num < 1 || num > list.size()){
			System.out.println("회원 번호를 잘못 입력했습니다.");
			return;
		}
		System.out.println("[수정 정보 입력]");
		System.out.print("이름 : ");
		list.get(num - 1).setName(sc.nextLine());

		System.out.print("나이 : ");
		list.get(num - 1).setAge(Integer.parseInt(sc.nextLine()));

		System.out.print("연락처 : ");
		list.get(num - 1).setPhoneNum(sc.nextLine());

		System.out.print("주소 : ");
		list.get(num - 1).setLocation(sc.nextLine());
		System.out.println("---------------------------------------");
		System.out.println("[수정이 완료되었습니다]");
		checkMemberList();
	}

	//회원 삭제
	void deleteMember(Scanner sc){
		if (list.size() < 1){
			System.out.println("삭제할 회원이 없습니다.");
			return ;
		}
		checkMemberList();
		System.out.println("삭제할 회원의 번호를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		if (num < 1 || num > list.size()){
			System.out.println("회원 번호를 잘못 입력했습니다.");
			return;
		}
		list.remove(num - 1);
		System.out.println("---------------------------------------");
		System.out.println("[삭제가 완료되었습니다]");
		checkMemberList();
	}
}
