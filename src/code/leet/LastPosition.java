package code.leet;

import java.util.Arrays;

/**
 * Created by Mickey on 2017/1/18.
 */
public class LastPosition {

    public static void main(String[] args){
        int[] nums = {67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,67,
                67,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,
                68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,
                68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,68,70,70,70,70,70,70,
                70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,
                70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,72,72,72,
                72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,
                72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,72,
                72,72,72,72,72,72,72,72,72,72,72,73,73,73,73,73,73,73,73,73,73,73,73,
                73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,73,
                73,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,74,
                74,74,74,74,74,74,74,74,74,74,74,74,74,75,75,75,75,75,75,75,75,75,75,
                75,75,75,75,75,75,75,75,75,75,75,77,77,77,77,77,77,77,77,77,77,77,77,
                77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,77,79,79,79,79,79,79,
                79,79,79,79,79,79,79,79,79,79,79,79,79,80,80,82,82,82,82,82};
        int target = 74;

        System.out.println(lastPosition(nums, target));
    }

    private static int lastPosition(int[] nums, int target){

        if(nums == null || nums.length==0){
            return -1;
        }

       /*
        Arrays.sort(nums);

        for(int i = nums.length-1; i >=0; i--){
            if(target == nums[i]){
                return i;
            }
        }
*/

/*
        int mid = nums.length / 2;
        int max = nums.length - 1;
        int min = 0;

        if(target == nums[max]){
            return max;
        }

        if(target == nums[mid]){
            return mid;
        }

        if(target < nums[mid]){
            max = mid;
            for(int i = max; i >= 0; i--){
                if(target == nums[i]){
                    return i;
                }
            }
        }

        if(target > nums[mid]){
            for(int j = max; j > mid; j--){
                if(target == nums[j]){
                    return j;
                }
            }
        }


        return -1;
        */


        int start = 0;
        int last = nums.length - 1;


        while(start+1 < last){
            if(nums[last] == target){
                return last;
            }
            int mid = start + (last - start) / 2;
            if(nums[mid] == target){
                start = mid;
            }else if(nums[mid] < target){
                start = mid;
            }else{
                last = mid;
            }

        }

        if(nums[last] == target){
            return last;
        }

        if(nums[start] == target){
            return start;
        }

        return -1;

    }

}
