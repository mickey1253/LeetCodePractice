package code.leet;

/**
 * Created by Mickey on 7/18/2016.
 */
public class CompareListNode {

    public static void main(String[] args){

       // int[] ints = new int[]{50, 9,-2, -5, 5,13, 40, -15, 27, 3,21,15,30,16};
        int[] ints = new int[]{4, 5, 3, 6, -6, -1};

        int maxDiff = findMaxDiff(ints);

        System.out.print("The max difference is: " + maxDiff);

    }

    private static int findMaxDiff(int[] a) {

        int max = a[1] -  a[0];
        int maxIndex = 0;

        int min = 0;


        for (int j = 0; j < maxIndex; j++) {
            if (a[j] < min) {
                min = a[j];
            }
        }

        if (max <= min) {
            return -1;
        } else {
            return max - min;
        }
    }

}
