package Arrays_Questions;

public class TwoPointerSum {
    static boolean hasPairWithSum(int [] A,int target) {
        int left =0;
        int right = A.length-1;
        while (left<right) {
            int currentSum = A[left]+A[right];

            if (currentSum == target) {
                System.out.println("Pair found:" +A[left]+ ", "+ A[right] +" at "+ " index "+ left+" and "+right);
            return  true;
            } else if (currentSum<target)   {
                left++;

            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {2,3,7,11,13,23,29,47,97};
        int target = 49;
        boolean result = hasPairWithSum(A,target);
        System.out.println("result:-> " + result);
    }
}
