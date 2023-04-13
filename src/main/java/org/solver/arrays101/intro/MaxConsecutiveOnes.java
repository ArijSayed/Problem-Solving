package org.solver.arrays101.intro;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void test(){
        int[] arr ={0,1,1,0,1,1,1};
        int result = findMaxConsecutiveOnes(arr);
        System.out.print("The input is: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("The output is: "+result);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxSoFar=0;
        int count=0;

        for (int num : nums) {

            if (num == 1) {
                count++;
                if (count > maxSoFar)
                    maxSoFar = count;

            } else {
                count = 0;
            }

        }
        return maxSoFar;
    }
}
