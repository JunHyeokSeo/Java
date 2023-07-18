package p2023_07_18;

public class ArrayEx04 {
    public static void main(String[] args) {
        //배열값중 최대 최소
        double  arr[] = {9.5, 7, 13.6, 7.5, 10.5},
                max = arr[0],
                min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
