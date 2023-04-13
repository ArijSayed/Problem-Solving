package org.solver.arrays101.intro;

import java.util.Arrays;

public class EvenNumberOfDigits {
    public static void test(){
        int[] arr={555,901,482,1771};
        int result=findNumbers(arr);
        System.out.println("The input is: "+ Arrays.toString(arr));
        System.out.println("The output is: "+result);
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for (int num : nums) {
            if ((int) (((Math.log10(num)) + 1) % 2) == 0) {
                count++;
            }
        }
        return count;
    }
}
