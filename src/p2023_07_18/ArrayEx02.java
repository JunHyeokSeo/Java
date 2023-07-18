package p2023_07_18;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] score = {83, 90, 87};
        int sum = 0;
        double avg;

        for (int i = 0; i < score.length; i++) {
            System.out.printf("score[%d] : %d\n", i, score[i]);
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        avg = (double) sum / 3;
        System.out.printf("평균 : %.2f\n", avg);
    }
}