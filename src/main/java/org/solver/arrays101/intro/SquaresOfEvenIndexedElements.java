package org.solver.arrays101.intro;

import java.util.Arrays;

public class SquaresOfEvenIndexedElements {
    public static void test(){
        int[] arr={9, -2, -9, 11, 56, -12, -3};
        System.out.println("The input is: "+ Arrays.toString(arr));
        squaresOfEvenElements(arr);
        System.out.println("The output is: "+Arrays.toString(arr));
    }

    //using O(N) space complexity solution:
//    public static int[] squaresOfEvenElements(int[] arr){
//        //edge cases
//        if(arr==null)
//            return null;
//        int[] temp=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            if(i%2==0) {
//                temp[i]=arr[i]*arr[i];
//            }else
//                temp[i]=arr[i];
//        }
//        return temp;
//    }

    //using O(1) space complexity solution:
    public static int[] squaresOfEvenElements(int[] arr){
        if(arr==null)
            return null;
        for(int i=0;i< arr.length;i++){
            if(i%2==0)
                arr[i]*=arr[i];
        }
        return arr;
    }

}
