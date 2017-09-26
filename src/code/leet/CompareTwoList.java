package code.leet; /**
 * Created by Mickey on 7/13/2016.
 */
import java.util.*;

/**
 *
 */

/**
 * @author Anurag
 *
 */
public class CompareTwoList {

    /**
     *
     */
    public CompareTwoList() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
//    public static void main(String[] args) {
//        List<String> ls1 = new ArrayList<String>();
//        ls1.add("a");
//        ls1.add("b");
//        ls1.add("c");
//        ls1.add("d");
//
//
//        List<String> ls2 = new ArrayList<String>();
//        ls2.add("a");
//        ls2.add("b");
//        ls2.add("c");
//        ls2.add("d");
//        ls2.add("e");
//
//
//        Set<String> set1 = new HashSet<String>();
//        set1.addAll(ls1);
//
//        Set<String> set2 = new HashSet<String>();
//        set2.addAll(ls2);
//
//        set2.removeAll(set1);
//
//
//        for (String diffElement : set2) {
//            System.out.println(diffElement.toString());
//        }
//    }


    public static void main(String[] args)
    {
        Integer[] i1 = {1, 2, 3, 4, 5, 4};

        Integer[] i2 = {3, 4, 5, 6, 7, 4};

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));

        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));

        set1.retainAll(set2) ;

        ArrayList arrayList = new ArrayList();

        for(Integer in: set1){
            arrayList.add(in.toString());
        }

       for(Object s:  arrayList.toArray()) {
           System.out.println((String)s);     //Output : [3, 4, 5]
       }
    }


}