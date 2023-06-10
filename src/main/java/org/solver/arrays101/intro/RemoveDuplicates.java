package org.solver.arrays101.intro;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void test(){
        int [] arr={1,1,2};
        System.out.println("The input is: "+Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println(removeDuplicates(arr));
        System.out.println("The output is: "+Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] arr) {

        //solution using extra temp array
//        int j=0;
//        int[] temp=new int[arr.length];
//        if(arr.length==0 || arr.length==1){
//            j=arr.length;
//            return j;
//        }
//        for(int i=0;i< arr.length-1;i++){
//            if(arr[i]!=arr[i+1]) {
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        temp[j++]=arr[arr.length-1];
//
//        for(int i=0;i< temp.length;i++){
//            arr[i]=temp[i];
//        }
//        return j;


        //another solution time complexity O(N) space complexity O(1)
//        int j = 0;
//        if (arr.length == 0 || arr.length == 1) {
//            j = arr.length;
//            return j;
//        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                arr[j] = arr[i];
//                j++;
//            }
//        }
//        arr[j] = arr[arr.length - 1];
//        j++;
//        return j;

        //another solution using two pointers reader and writer
        if (arr == null) {
            return 0;
        }
        // The first element shouldn't be touched; it's already in its correct place.
        int writePointer = 1;
        for (int readPointer = 1; readPointer < arr.length; readPointer++) {
            if (arr[readPointer] != arr[readPointer - 1]) {
                // Copy it into the next position at the front, tracked by writePointer.
                arr[writePointer] = arr[readPointer];
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                 writePointer++;
            }
        }
        // This turns out to be the correct length value.
        return writePointer;
    }
}
