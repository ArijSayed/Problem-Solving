package org.solver.arrays101.intro;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void test(){
        int[] arr={17,18,5,4,6,1};
        System.out.println("The input is: "+ Arrays.toString(arr));
        System.out.println("The output is: "+Arrays.toString(replace(arr)));
    }
    public static int[] replace(int[] arr){

//        time complexity O(N*N) space complexity O(1)
        if(arr==null)
            return null;

        for(int i=0;i< arr.length;i++) {
            int max=-1;
            for (int j = i + 1; j < arr.length; j++) {
                max = Math.max(max, arr[j]);
            }
            arr[i]=max;
        }
        return arr;
    }
}
