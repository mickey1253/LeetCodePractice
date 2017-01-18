import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mickey on 2017/1/11.
 */
public class Subsets {

    public static void main(String[] args) {

        Integer[] S = {1, 2, 3, 7, 5, 4};

        System.out.println(subsets(S));

    }

    public static ArrayList<ArrayList<Integer>> subsets(Integer[] nums) {
        // write your code here

     /*   Arrays.sort(nums);

        ArrayList<ArrayList<Integer>> arrOuter = new ArrayList<>();

        for (Integer num1 : nums) {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            arrayList1.add(num1);
            arrOuter.add(arrayList1);
        }

        for (int i = 0; i < nums.length - 1; i++) {

          for (int j = 1; j < nums.length; j++) {

              if(nums[i] >= nums[j]){
                  continue;
              }

              ArrayList<Integer> arrayList2 = new ArrayList<>();
                arrayList2.add(nums[i]);
                arrayList2.add(nums[j]);
                arrOuter.add(arrayList2);
            }

        }

            ArrayList<Integer> arrayList3 = new ArrayList<>();

            for (Integer num2 : nums) {

                arrayList3.add(num2);
            }



        arrOuter.add(arrayList3);
        arrOuter.add(new ArrayList<>());

            return arrOuter;

            */

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        ans.add(new ArrayList<Integer>());

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i ++) {

            int curSize = ans.size();

            for (int j = 0; j < curSize; j ++) {

                ArrayList<Integer> cur = new ArrayList<Integer>(ans.get(j));

                cur.add(nums[i]);

                ans.add(cur);

            }

        }

        return ans;

        }

    }

