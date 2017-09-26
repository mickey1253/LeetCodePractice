package code.leet;

/**
 * Created by Mickey on 2017/1/11.
 */
public class StrStr {

    public static void main(String[] args){

        String source = "abdslfdslkfdfsf";

        String target = "ds";

        System.out.print("The index of target is: " + strStr(source, target));

    }

    public static int strStr(String source, String target) {
        //write your code here
        if (source !=null && target != null && source.contains(target)){

            if(source.equals(target)){

                return 0;

            }

            String[] arr = source.split(target);
            char[] a;
            a = arr[0].toCharArray();
            return a.length;
        }
        return -1;
    }

}
