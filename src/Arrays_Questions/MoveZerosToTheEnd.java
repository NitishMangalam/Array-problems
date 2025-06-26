package Arrays_Questions;

import java.util.Arrays;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int [] Y = {0,1,0,3,5,0,0,7,9,11,0,13,0,0,0,17,0};
        System.out.println(Arrays.toString(Y));
        movesZero(Y);
        System.out.println(Arrays.toString(Y));
    }
    static void movesZero(int [] Y) {
        int index=0;
        for (int i = 0; i <Y.length ; i++) {
            if (Y[i]!=0) {
                Y[index]=Y[i];
                index++;
            }
        }
        while (index<Y.length) {
            Y[index]=0;
            index++;
        }
    }
}
