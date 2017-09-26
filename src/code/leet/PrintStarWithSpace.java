package code.leet;

/**
 * Created by Mickey on 2/25/2016.
 */
public class PrintStarWithSpace {

    public static void main(String[] args) {
        int n = 6;

        printStar(n);

        System.out.println(sum(new int[]{5,1,2,3,4,5}));


    }

    public static void printStar(int n){

        for (int i=0; i < n; i++){
            for(int j = 1; j < n - i; j++ ) {
                   System.out.print(" ");
               }
            for(int q = n - i - 1; q < n ; q++ ) {
                System.out.print("*");
            }
            System.out.println();
            }

        }

    public static int sum(int[] num){

        int sum = 0;
        for(int i = 0; i < num[0]; i++){
            sum = sum + num[i+1];
        }

        return sum;
    }



}
