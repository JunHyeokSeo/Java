package p2023_07_18;

import java.util.Scanner;

public class ArrayEx03 {
    public static void main(String[] args) {
        //키보드로 5과목의 점수를 입력, 총점과 평균 구하기
        int arr[] = new int[5], sum = 0;
        double avg;
        Scanner sc = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        avg = sum / 5.0;
        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.2f\n", avg);
    }
}
