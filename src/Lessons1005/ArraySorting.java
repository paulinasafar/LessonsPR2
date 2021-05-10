package Lessons1005;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        String[] str1 = {"Mama", "Papa", "Tochter", "Sohn", "Grossmutter", "Enkelin"};
        int[] int1 = {56, 76, 4684, -4846, 34256, 4152, -54, 168, -41867};
        double[] do1 = {154.584768, 86649.5468, -1864.45, -4187.756, 51478.32};
        char[] cha1 = {'a', 'B', 'g', '+', '$', 'R', 'r'};
        String[] str2 = {"ab", "Ga", "be", "$", "+", "ra", "Ra", "hd"};


        System.out.println(Arrays.toString(str1));
        Arrays.sort(str1);
        System.out.println(Arrays.toString(str1));
        System.out.println();
        System.out.println(Arrays.toString(int1));
        Arrays.sort(int1);
        System.out.println(Arrays.toString(int1));
        System.out.println();
        System.out.println(Arrays.toString(do1));
        Arrays.sort(do1);
        System.out.println(Arrays.toString(do1));
        System.out.println();
        System.out.println(Arrays.toString(cha1));
        Arrays.sort(cha1);
        System.out.println(Arrays.toString(cha1));
        System.out.println();
        System.out.println(Arrays.toString(str2));
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));
    }
}
