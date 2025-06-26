package Arrays_Questions;
import java.util.Arrays;
public class MoveNegativeNumbers {
    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            } else if (arr[left] >= 0 && arr[right] < 0) {
                // Swap positive on left with negative on right
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] >= 0 && arr[right] >= 0) {
                right--;
            } else {
                // arr[left] is negative, arr[right] is positive
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7};
        rearrange(arr);
        System.out.println("Rearranged: " + Arrays.toString(arr));
    }
}
