package org.solver.arrays101.intro;

import java.util.Arrays;

public class MoveZeroes {

    public static void test() {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("The input is: " + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("The output is: " + Arrays.toString(arr));
    }
    public static void moveZeroes(int[] arr){
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0) {
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i=count;i< arr.length;i++){
            arr[i]=0;
        }

    }
}
