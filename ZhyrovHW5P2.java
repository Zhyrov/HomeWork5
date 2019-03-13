package lesson5;

import java.util.Arrays;

public class ZhyrovHW5P2 {
    public static void main(String[] args) {
        int[] array = createArrayIntegers(18);
    }


    static int[] createArrayIntegers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 15;
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++){
            if (array [i]<0){
                num++;
                sum = sum + array [i];
            }
        }
        System.out.println("Array consist " + num + " negative elements");
        System.out.println("Sum of negative elements =" + sum);
        return array;
    }
}
