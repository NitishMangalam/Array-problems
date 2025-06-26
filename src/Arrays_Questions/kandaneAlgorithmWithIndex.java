package Arrays_Questions;

public class kandaneAlgorithmWithIndex {
    public static void main(String[] args) {
        int[] X = {2, -3, 5, -7, 11, -9, 17, -10, 21, -13, 47, 1, -200, 51, 2, 47, -97};
        kadaneWithIndex(X);
    }

    public static void kadaneWithIndex(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        int start = 0;   // Start index of current subarray
        int tempStart = 0; // Temporary start (when we reset)
        int end = 0;     // End index of best subarray

        for (int i = 1; i < nums.length; i++) {
            // If current element is better than extending the previous subarray
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i; // Start new subarray
            } else {
                currentSum += nums[i]; // Extend current subarray
            }

            // Update max sum and store the indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Output the result
        System.out.println("Maximum subarray sum: " + maxSum);
        System.out.println("Start index: " + start + ", End index: " + end);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
