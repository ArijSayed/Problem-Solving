package org.solver.arrays101.intro;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void test(){
        int [] arr={1,1,2};
//        System.out.println("The input is: "+Arrays.toString(arr));
        removeDuplicates(arr);
//        System.out.println(removeDuplicates(arr));
//        System.out.println("The output is: "+Arrays.toString(arr));
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


        //another solution
        int j = 0;
        if (arr.length == 0 || arr.length == 1) {
            j = arr.length;
            return j;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];
        j++;
        return j;
    }
}
