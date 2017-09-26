package code.leet;

/**
 * Created by Mickey on 7/17/2016.
 */
public class ZigZagConversion {

    public static void main(String[] args){

        String inputS = "PAYPALISHIRING";

        // PAYPALISHIRINGNOWADYSFUNYEA

        int rows = 8;

        System.out.println(convert(inputS,rows));

    }


   /* public static String convert(String s, int numRows) {

        *//**
         *   P   A   H   N
             A P L S I I G
             Y   I   R
         *
         *  //"PAHNAPLSIIGYIR";
         * *//*

        String ret = "";

        char[] chars = s.toCharArray();

        int charArraySize = chars.length;

        int firstLineSize = 0;


        for(int i = 0; i < charArraySize/numRows; i++){

            ret = ret + chars[i * (numRows  + numRows/2)];

        }

        for(int j = 0; j < charArraySize/numRows; j++){
            ret = ret + chars[j+numRows-1];

        }

        return ret;

    }*/

   /* public static String convert(String s, int nRows) {
        if(nRows <= 1) return s;
        char[]c=s.toCharArray();
        char[]result=new char[c.length];
        int r=0;
        //the size of a cycle(period)
        int cycle = 2 * nRows - 2;
        for(int j = 0; j < c.length; j = j + cycle){
            result[r++]=c[j];
        }
        for(int i = 1; i < nRows-1; ++i)
        {
            for(int j = i; j < c.length; j = j + cycle){
                result[r++]=c[j];
                int secondJ = (j - i) + cycle - i;
                if(secondJ < c.length )
                    result[r++]=c[secondJ];
            }
        }
        for(int j = nRows-1; j < c.length; j = j + cycle){
            result[r++]=c[j];
        }
        return String.valueOf(result);
    }*/

    public static String convert(String s, int numRows){

        char[] c = new char[s.length()];
        int len = s.length();
        String ret = "";

        if(numRows == 1){
            ret = s;
            return ret;
        }

        int cycle = numRows + numRows / 2;

        int loopTimes = len / cycle;



        for(int i = 0; i <= loopTimes ; i++){

            c[i*cycle] = s.charAt(i * cycle );


        }

        ret = new String(c);

        return ret;

    }

}
