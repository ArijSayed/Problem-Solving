package org.solver.arrays101.intro;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void test(){
        int[] arr={-5,-3,-2,-1};
        System.out.println("The input is: "+ Arrays.toString(arr));
        int[] result=sortedSquares(arr);
        System.out.println("The output is: "+Arrays.toString(result));
    }
    public static int[] sortedSquares(int[] nums) {

        int[] squaredArray = nums;

        for (int i = 0; i < nums.length; i++) {
            squaredArray[i] = (int) (Math.pow(nums[i], 2));
        }

        //using Bubble sort
        for (int i = 0; i < (squaredArray.length - 1); i++) {
            for (int j = 0; j <= (squaredArray.length - 2); j++) {
                if (squaredArray[j] > squaredArray[j + 1]) {
                    int temp;
                    temp = squaredArray[j];
                    squaredArray[j] = squaredArray[j + 1];
                    squaredArray[j + 1] = temp;
                }
            }
        }
        return squaredArray;
    }
}
