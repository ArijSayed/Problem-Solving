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
}
