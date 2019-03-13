package lesson5;

import java.util.Arrays;

public class ZhyrovHW5P3 {
    public static void main(String[] args) {
        int[] array = createArrayIntegers(8);
        System.out.println(Arrays.toString(array));
    }


    static int[] createArrayIntegers(int size) {
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for (int i = 0; i < size-1; i++) {
            array1[i] = (int) (Math.random() * 30) - 15;
            array2[i] = (int) (Math.random() * 30) - 15;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int [] array3 = new int [size];
        for (int i = 0; i < size-1; i++) {
            array3[i] = array1[i] + array2[i];
        }
        return array3;
    }
}
