package Arrays_Questions;

import java.util.Arrays;

public class RotateArrayByKTimes {
    static void rotate(int [] nums,int k) {
        int n = nums.length;
        k=k%n;
        //right Rotation
//        reverse(nums,0,n-1);
//        reverse(nums,0,k-1);
//        reverse(nums,k,n-1);
        // left Rotation
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
    static void reverse(int[] nums,int start,int end) {
        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] A = {2,3,5,7,9,11,13};
        int z= 3;
        System.out.println(Arrays.toString(A));
        rotate(A,z);
        System.out.println(Arrays.toString(A));
    }
}
