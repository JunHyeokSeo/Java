package p2023_07_17;

public class ArrayEx01 {
    public static void main(String[] args) {
        //배열 : 동일한 자료형의 데이터를 저장하기 위한 정적인 자료구조
        //변수 -> 배열 -> 자료구조(List)
        //형식 1. - 값 지정 X
        int[] score = new int[3];
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);

        score[0] = 80;
        score[1] = 90;
        score[2] = 100;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        //형식 2. - 값 지정 O
    }
}
