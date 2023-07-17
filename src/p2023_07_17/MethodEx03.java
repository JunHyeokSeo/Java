package p2023_07_17;

import java.util.Scanner;

public class MethodEx03 {
    //키보드로 입력한 정수 중에서 최대값, 최소값 구하기
    //단, 메소드를 이용해서 작성

    //최대값
    static int max(int a, int b){
        if(a > b) return a;
        else return b;
    }
    static int min(int a, int b){
        if(a < b) return a;
        else return b;
    }
    //최소값
    public static void main(String[] args) {
        int n1, n2, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("2개의 정수를 입력하세요");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        max = max(n1, n2);
        min = min(n1, n2);

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
