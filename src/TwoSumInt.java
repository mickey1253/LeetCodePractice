import javax.tools.ToolProvider;

/**
 * Created by Mickey on 7/15/2016.
 *
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSumInt {

    public static int[] twoSum(int[] nums, int target) {

        int idx1 = 0;
        int idx2 = 0;
        int[] anArray;
        anArray = new int[2];

        for(int i = 0; i < nums.length; i++){

            int num1 = target - nums[i];

            for (int j = 0; j < nums.length; j++){
                if (i != j && num1 == nums[j]){

                    idx1 = i;
                    idx2 = j;
                    anArray[0] = idx2;
                    anArray[1] = idx1;

                }
            }

        }

        return anArray;
    }

    public static void main(String args[]){

        int[] nums;
        nums = new int[3];
        nums[0] = 0;
        nums[1] = 2;
        nums[2] = 0;

        int target = 0;

        int[] anArray = twoSum(nums, target);

        for (int a: anArray) {
            System.out.println(a);
        }



    }
}
