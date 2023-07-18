package p2023_07_18;

public class ArrayEx05 {
    public static void main(String[] args) {
        int[] score = {83, 90, 87};
        int sum1 = 0, sum2;
        for (int i : score)
            sum1 += i;
        sum2 = add(score);
        System.out.println("sum : " + sum1);
        System.out.println("sum : " + sum2);
    }

    public static int add(int[] score){
        int sum = 0;
        for (int i : score)
            sum += i;
        return sum;
    }
}
