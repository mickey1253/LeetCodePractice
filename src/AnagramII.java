/**
 * Created by Mickey on 2017/1/16.
 */
public class AnagramII {

    public static void main(String[] args){
        String s = "aabcc";
        String t = "bccaa";

        Boolean result = anagram(s, t);

        System.out.println(result);
    }

    public static Boolean anagram(String s, String t) {

        /**
         *  if (s.length() != t.length()) {
         return false;
         }

         int[] count = new int[256];
         for (int i = 0; i < s.length(); i++) {
         count[(int) s.charAt(i)]++;
         }
         for (int i = 0; i < t.length(); i++) {
         count[(int) t.charAt(i)]--;
         if (count[(int) t.charAt(i)] < 0) {
         return false;
         }
         }
         return true;
         */

        boolean result = false;

        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return false;
        }

        char[] source = s.toCharArray();
        char[] target = t.toCharArray();

        int sLength = source.length;
        int tLength = target.length;

        if (sLength != tLength) {
            return false;
        }

        System.out.println("---------");

        for (int i = 0; i < sLength; i++) {
            int sCount = 0;
            int tCount = 0;

            System.out.println(source[i]);

            for (int j = 0; j < sLength; j++) {
                System.out.println(source[j]);
                if (source[i] == source[j]) {
                    sCount++;
                }
            }

            System.out.println(sCount);

            for (int k = 0; k < tLength; k++) {
                System.out.println(target[k]);
                if (source[i] == target[k]) {
                    tCount++;
                }
            }

            System.out.println(tCount);

            if (sCount == tCount) {
                result = true;
            } else {
                return false;
            }

        }

        return result;
    }

}
