package p2023_07_17;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.print(">");
            input = sc.nextLine();
            System.out.println("입력문자 : " + input);
        }while (!input.equals("q"));

        System.out.println("프로그램 종료");
        sc.close();
    }
}