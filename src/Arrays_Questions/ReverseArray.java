package Arrays_Questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] A = {101,2,3,5,7,9,11,13,47,97};
        System.out.println(Arrays.toString(A));
        reverseArray(A);
        System.out.println(Arrays.toString(A));
    }
    static void reverseArray(int[] A) {
        int left=0;
        int right = A.length-1;
       while (left<right) {
           int temp=A[left];
           A[left]=A[right];
           A[right]=temp;
           left++;
           right--;
       }
    }
}
