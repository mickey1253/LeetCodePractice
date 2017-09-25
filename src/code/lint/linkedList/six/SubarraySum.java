package code.lint.linkedList.six;

/**
 * Created by 505007855 on 9/25/2017.
 */
public class SubarraySum {

    /*
    *
    * Given an integer array, find a subarray where the sum of numbers is zero. Your code should return the index of the first number and the index of the last number.

 Notice

There is at least one subarray that it's sum equals to zero.

Have you met this question in a real interview? Yes
Example
Given [-3, 1, 2, -3, 4], return [0, 2] or [1, 3].
    *
    * */


    // JIU ZHANG's Answer
    /*
    *
    *  public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here

        int len = nums.length;

        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(0, -1);

        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];

            if (map.containsKey(sum)) {
                ans.add(map.get(sum) + 1);
                ans.add(i);
                return ans;
            }

            map.put(sum, i);
        }

        return ans;
    }
    *
    * */




    // Shuo Chang's Answer

    /*
    public ArrayList<Integer> subarraySum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        map.put(0, 0);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (map.containsKey(sum)){
                result.add(map.get(sum));
                result.add(i);
                return result;
            } else {
                map.put(sum, i + 1);
            }
        }
        return result;
    }

    */

}
