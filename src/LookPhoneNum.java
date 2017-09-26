import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Mickey on 7/25/2016.
 */
public class LookPhoneNum {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String,Integer> myMap = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here

           if(myMap.containsKey(s)){
                System.out.println(s+"=" + myMap.get(s));
            }else {
                System.out.print("Not found");
            }

        }
        in.close();

        
    }
}



