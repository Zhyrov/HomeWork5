package lesson5;

import java.util.Arrays;

public class ZhyrovHW5P1 {
    public static void main(String[] args) {
        int[] array = createArrayIntegers(8);
        System.out.println(Arrays.toString(array));
        System.out.print("[");
        for (int j = array.length-1; j >= 0; j--){
            System.out.print(array[j]);
            if (j > 0){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }


    static int[] createArrayIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 15;
        }
        return array;
    }
}