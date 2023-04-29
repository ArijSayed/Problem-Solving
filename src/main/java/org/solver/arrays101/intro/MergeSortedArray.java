package org.solver.arrays101.intro;

import java.util.Arrays;

public class MergeSortedArray {
    public static void test(){
        int[] nums1={4,5,6,0,0,0};
        int m=3;
        int[] nums2={1,2,3};
        int n=3;
        merge(nums1,m,nums2,n);
        sort(nums1);
        System.out.println("The output is: "+Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;){
            for (int k : nums2) {
                nums1[i] = k;
                i++;
            }
        }
//        System.out.println(Arrays.toString(nums1));
    }

    public static void sort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j<= arr.length-2;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
