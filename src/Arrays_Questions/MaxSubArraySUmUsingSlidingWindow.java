package Arrays_Questions;

public class MaxSubArraySUmUsingSlidingWindow {
    static int maxSUm(int[] A,int k ) {
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum+=A[i];

        }
        maxSum=windowSum;
        for (int end = k; end <A.length ; end++) {
            windowSum+=A[end]-A[end-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] X = {7,1,2,3,9,0,13,5,17,21,23,1,3,7};
        int k = 3;
        int result = maxSUm(X,k);
        System.out.println("Maximum sum of subArray of size "+ k+" = " + result);
    }
}
