package org.solver.arrays101.intro;

import java.util.Arrays;

public class RemoveElement {
    public static void test(){
        int val=2;
        int[] arr={0,1,2,3,0,4,2};
        System.out.println("The input is: "+Arrays.toString(arr));
        delete(arr,val);
        System.out.println("The output is: "+ Arrays.toString(arr));
    }
    

    public static int delete(int[] arr, int val){
        
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }

        return count;
    }
}
