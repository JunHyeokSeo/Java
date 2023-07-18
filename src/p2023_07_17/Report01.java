package p2023_07_17;

import java.util.Scanner;
public class Report01 {
    static int sum = 0;
    public static long factorial(long n){
        if (n == 1 || n == 0){
            System.out.println(1);
            return 1;
        }
        System.out.print(n + " * ");
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int n = sc.nextInt();
        System.out.print(n + "! = ");
        long result = factorial(n);
        System.out.println(n + " factorial = " + result);
    }
}
