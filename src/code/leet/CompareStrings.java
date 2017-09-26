package code.leet;

/**
 * Created by Mickey on 2017/1/16.
 */
public class CompareStrings {

    public static void main(String[] args){
        String s = "abcbacd";
        String t = "aabc";

        Boolean result = compareStrings(s, t);

        System.out.println(result);
    }

    public static Boolean compareStrings(String A, String B) {

        if (A.isEmpty() || B.isEmpty() || A.length() == 0 || B.length() == 0) {
            return false;
        }

        int[] count = new int[256];
        for (int i = 0; i < A.length(); i++) {

         //   System.out.println((int)A.charAt(i));

            count[(int) A.charAt(i)]++;
        }

        for (int i = 0; i < B.length(); i++) {
            count[(int) B.charAt(i)]--;
            if (count[(int) B.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }



}
