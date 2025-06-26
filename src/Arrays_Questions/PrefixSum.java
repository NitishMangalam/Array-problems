package Arrays_Questions;

public class PrefixSum {
    public static void main(String[] args) {
        int [] A = {2,3,5,7,9,11,3,21,47,53,97};
        int[] prefix = new int[A.length];
        prefix[0]= A[0];
        for (int i = 1; i <A.length ; i++) {
            prefix[i] = prefix[i-1] + A[i];
        }
        int left = 0;
        int right = 7;
        int sum = prefix[right]-(left>0?prefix[left-1] :0 );
        System.out.println("Sum from Index " + left + " to " + right + "= " + sum);
    }
}
