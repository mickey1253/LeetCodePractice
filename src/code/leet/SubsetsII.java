package code.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Mickey on 2017/1/11.
 */
public class SubsetsII {

    public static void main(String[] args) {

        Integer[] S = {1, 2, 2, 3, 3};

        System.out.println(subsets(S));

    }

    public static ArrayList<ArrayList<Integer>> subsets(Integer[] nums) {

        // write your code here
            ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
            result.add(new ArrayList<Integer>());
            if (nums == null || nums.length == 0) {
                return result;
            }
            Arrays.sort(nums);
            ArrayList<Integer> S = new ArrayList<>();

             for (Integer num: nums) {

            S.add(num);

        }
            helper(result, S, new ArrayList<Integer>(), 0);
            return result;
        }


    private static void helper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> S, ArrayList<Integer> cur, int i) {


        for (int j = i; j < S.size(); j++) {
            if (j > i && S.get(j) == S.get(j - 1)) {
                continue;
            }
            cur.add(S.get(j));
            result.add(new ArrayList<Integer>(cur));
            helper(result, S, cur, j + 1);
            cur.remove(S.get(j));
        }
    }

}

