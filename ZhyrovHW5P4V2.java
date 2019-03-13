package lesson5;

import java.util.Arrays;

public class ZhyrovHW5P4V2 {
    public static void main(String[] args) {
        int[] array = createArrayIntegers(10);
    }


    static int[] createArrayIntegers(int size) {
        int[] array1 = new int[size];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 30) - 15;
        }
        System.out.println(Arrays.toString(array1));
        int positiv = 0;
        int negativ = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0){
                positiv++;
            }
            if (array1[i] < 0){
                negativ++;
            }
        }
        int [] arrayPositiv = new int [positiv];
        int p = 0;
        int [] arrayNegativ = new int [negativ];
        int n = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 0){
               arrayPositiv[p] = array1[i];
               p++;
            }
            if (array1[i] < 0){
                arrayNegativ[n] = array1[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(arrayPositiv));
        System.out.println(Arrays.toString(arrayNegativ));
        return array1;
    }
}
