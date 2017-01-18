/**
 * Created by Mickey on 2017/1/16.
 */
public class Anagram {

    public static void main(String[] args){
        String s = "aacbb";
        String t = "bbcaa";

        Boolean result = anagram(s, t);

        System.out.println(result);
    }

    public static Boolean anagram(String s, String t) {

        boolean result = false;

        if(s == null || t == null || s.length() == 0 || t.length() == 0){
            return false;
        }

        char[] source = s.toCharArray();
        char[] target = t.toCharArray();

        int sLength = source.length;
        int tLength = target.length;

        if(sLength != tLength){
            return false;
        }

        int i = 0;
        int j = tLength-1;

       while((i < sLength) && (j >= 0)){

        if(source[i] == target[j]){
            result = true;
        }else{
            return false;
        }
           i++;
           j--;
       }

        return result;
    }
}
