package code.leet;

import java.util.Scanner;

/**
 * Created by Mickey on 7/17/2016.
 */
public class DataTypeInput {

    public static void main(String args[] ){

        Scanner scan2 = new Scanner(System.in);
        scan2.useDelimiter("\\n");

        int i = scan2.nextInt();
        double d = scan2.nextDouble();
        String s = scan2.next();


        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        scan2.close();

    }


}
