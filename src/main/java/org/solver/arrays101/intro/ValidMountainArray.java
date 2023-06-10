package org.solver.arrays101.intro;

public class ValidMountainArray {
    public static void test(){
        int[] arr={0,3,2,1};
        validMountainArray(arr);
        System.out.println("The output is: "+validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        int N = arr.length;
        int i = 0;

        if (N < 3)
            return false;

        //trying to find the index of peak value
        while (i < N - 1 && arr[i] < arr[i + 1])
            i++;

        //the peak value can not be the first or last element
        if (i == 0 || i == N - 1)
            return false;

        //trying to reach the last element in array
        while(i < N-1 && arr[i]>arr[i+1])
            i++;

        return i==N-1;
    }
}
