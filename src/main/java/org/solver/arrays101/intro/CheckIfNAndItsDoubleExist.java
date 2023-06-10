package org.solver.arrays101.intro;


public class CheckIfNAndItsDoubleExist {
    public static void test(){
        int [] arr={10,2,0,3,5};
        checkIfExist(arr);
        System.out.println("The output is: "+ checkIfExist(arr) );
    }
    public static boolean checkIfExist(int[] arr){
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr.length;j++) {
                if (i != j) {
                    if (arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    //another solution using binary search algorithm
//    if (arr == null || arr.length < 2) {
//        return false;
//    }
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; ++i) {
//        int currentValue = arr[i];
//        int idx = Arrays.binarySearch(arr, 2 * currentValue);
//        if (idx >= 0 && idx != i) {
//            return true;
//        }
//    }
//
//        return false;
}
