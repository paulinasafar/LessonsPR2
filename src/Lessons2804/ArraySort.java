package Lessons2804;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        double[] darr = {7.2, 2.4, 10000.4, 3.8, 0.2, -65.55, -0.00000047};
        String[] strin1 = {"John", "Marta", "Martina", "Anna", "Francl", "Koko"};
        System.out.println(Arrays.toString(strin1));

        // fast way to print Array
        System.out.println(Arrays.toString(darr));
        System.out.println();

        Arrays.sort(darr);
        System.out.println(Arrays.toString(darr));
        System.out.println();
        Arrays.sort(strin1);
        System.out.println(Arrays.toString(strin1));
    }
}
