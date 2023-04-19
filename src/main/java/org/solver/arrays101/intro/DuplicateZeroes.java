package org.solver.arrays101.intro;

import java.util.Arrays;

public class DuplicateZeroes {

    public static void test(){
        int[] arr={1,0,2,3,0,4,5,0};
        System.out.println("The input is: "+Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println("The output is: "+Arrays.toString(arr));

    }

    public static void duplicateZeros(int[] arr) {
        int length = 0;
        for (int k : arr) {
            if (k == 0) {
                length++;
            }
        }
        for (int i = arr.length-1, j = arr.length+length-1; i < j; --i, --j) {
            if (j<arr.length)
                arr[j] = arr[i];
            if (arr[i] == 0)
                if (--j<arr.length)
                    arr[j] = arr[i];
        }
    }
}
