package code.leet;

/**
 * Created by Mickey on 7/14/2016.
 */
public class FindWords {

            public static void main(String[] args){
            String S= "I am using hackerrank to improve programming";
            String T = "am hackerrank to improve";


            String[] arr1 = S.split(" ") ;
            String arr2[] = T.split(" ") ;
            for (int i = 0; i < arr2.length; i++){
                for (int j = 0; j < arr1.length; j++){
                    if (arr1[j].equals(arr2[i])){
                        arr1[j] = "" ;
                    }
                }
            }

            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < arr1.length; j++){
                if (!"".equals(arr1[j]) ){
                    sb.append(arr1[j] + " ") ;


                }
            }

            System.out.println("result：" + sb.toString());

                String[] ret = sb.toString().split(" ");

                for(int i =0; i< ret.length; i++ ){
                    System.out.println(ret[i]);
                }
        }




}
