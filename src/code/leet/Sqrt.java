package code.leet;

/**
 * Created by Mickey on 2017/1/18.
 */
public class Sqrt {

    public static void main(String[] args){
        int x = 999999999;
        System.out.println(sqrt(x));
    }

    private static int sqrt(int x){

        if(x == 0 || x == 1){
            return x;
        }

        if(x < 0){
            return -1;
        }

        long start = 0;

        long last = x;



        while(start + 1 < last){
            long mid = start + (last - start) / 2;

            if(mid * mid == x){
                return (int)mid;
            }else if(mid * mid > x){
                last = mid;
            }else{
                start = mid;
            }
        }

        return (int)start;


    }

}
