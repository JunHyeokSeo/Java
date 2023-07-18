package p2023_07_18;

public class ArrayEx06 {
    public static void main(String[] args) {
        //p198, 확장 for문
        //형식 : for( 변수 : 순차 자료구조(Array, List))
        int[] scores = {95, 75, 84, 93, 87};
        int sum = 0;

        // 확장 for
        for (int score : scores)
            sum += score;
        System.out.println("sum : " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("avg : " + avg);
    }
}
