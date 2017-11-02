package code.lint.dynamic.nine;

/*
*
* Given an array of non-negative integers,
* you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Have you met this question in a real interview? Yes
Example
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2.
 (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
*
* */

public class JumpGameII {

    /*
    * @param A: A list of integers
    * @return: An integer
    */
    public int jump(int[] A) {
        // write your code here

        int[] steps = new int[A.length];

        steps[0] = 0;

        for(int i = 1; i < A.length; i++){
            steps[i] = Integer.MAX_VALUE;
        }

        for(int i = 1; i < A.length; i++){
            for(int j = 0; j < i; j++){
                if (steps[j] != Integer.MAX_VALUE && j + A[j] >= i){
                    steps[i] = Math.min(steps[i], steps[j] + 1);
                }
            }
        }

        return steps[A.length - 1];


    }


    // Jiu Zhang's Answer

    /*
    *
    *  public int jump(int[] A) {
        // state
        int[] steps = new int[A.length];

        // initialize
        steps[0] = 0;
        for (int i = 1; i < A.length; i++) {
            steps[i] = Integer.MAX_VALUE;
        }

        // function
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < i; j++) {
                if (steps[j] != Integer.MAX_VALUE && j + A[j] >= i) {
                    steps[i] = Math.min(steps[i], steps[j] + 1);
                }
            }
        }

        // answer
        return steps[A.length - 1];
    }
    *
    * */

    /*
    *
    * // version 2: Greedy
public class Solution {
    public int jump(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = 0, jumps = 0;
        while (end < A.length - 1) {
            jumps++;
            int farthest = end;
            for (int i = start; i <= end; i++) {
                if (A[i] + i > farthest) {
                    farthest = A[i] + i;
                }
            }
            start = end + 1;
            end = farthest;
        }
        return jumps;
    }
    *
    * */

    // Shuo Chang's Answer
    /*
    // Version 1
     public int jump(int[] A) {
        if (A == null || A.length == 0){
            return 0;
        }

        int[] dp = new int[A.length];
        dp[0] = 0;
        for (int i = 1; i < A.length; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i < A.length; i++){
            for (int j = 0; j < i; j++){
                if (dp[j] != Integer.MAX_VALUE && j + A[j] >= i){
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[A.length - 1];
    }
    *
    * */

    /*
    *
    * // version 2: Greedy
    public class Solution {
    public int jump(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0, end = 0, jumps = 0;
        while (end < A.length - 1) {
            jumps++;
            int farthest = end;
            for (int i = start; i <= end; i++) {
                if (A[i] + i > farthest) {
                    farthest = A[i] + i;
                }
            }
            start = end + 1;
            end = farthest;
        }
        return jumps;
    }
    *
    * */
}
