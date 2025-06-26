package Arrays_Questions;

public class KadaneAlgorithm {
    public static void main(String [] args) {
        int [] X = {2,-3,5,-7,11,-191,17,-10,21,-13,47,1,-20,51,2,47,-97};
        int maxSum = kadaneMaxSum(X);
        System.out.println("Maximum subArray Sum:" + maxSum);
    }
    public static int kadaneMaxSum (int [] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            currentSum = Math.max(nums[i],currentSum+nums[i] );
            maxSum = Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
