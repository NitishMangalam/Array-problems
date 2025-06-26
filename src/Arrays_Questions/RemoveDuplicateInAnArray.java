package Arrays_Questions;

import java.util.Arrays;

public class RemoveDuplicateInAnArray {
static int removeDuplicates(int[] nums) {
    int index = 1;
    for (int i = 1; i <nums.length ; i++) {
        if(nums[i] != nums[i-1]) {
          nums[index] = nums[i];
          index++;
        }
    }
    return index;
}

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 5, 7, 7, 7, 11, 13, 13, 47, 97, 97};
        int length = removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
