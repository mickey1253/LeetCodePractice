package code.lint.binary.two;

/**
 * Created by 505007855 on 9/11/2017.
 */
public class ClosetNumber {

    /*
    * Given a target number and an integer array A sorted in ascending order, find the index i in A such that A[i] is closest to the given target.

Return -1 if there is no element in the array.

 Notice

There can be duplicate elements in the array, and we can return any of the indices with same value.

Have you met this question in a real interview? Yes
Example
Given [1, 2, 3] and target = 2, return 1.

Given [1, 4, 6] and target = 3, return 1.

Given [1, 4, 6] and target = 5, return 1 or 2.

Given [1, 3, 3, 4] and target = 2, return 0 or 1 or 2.

Challenge
O(logn) time complexity.
    *
    * */

    public static void main(String[] args){




    }


    public int shuoChangAnwser(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        int mid;
        if (A.length == 0){
            return -1;
        }
        while (start + 1 < end){
            mid = start + (end - start) / 2;
            if (A[mid] == target){
                return mid;
            } else if (A[mid] < target){
                start = mid;
            } else {
                end = mid;
            }
        }
        if (Math.abs(A[end] - target) < Math.abs(A[start] - target)){
            return end;
        }
        return start;
    }

 /* JIU ZHANG Answer */
    public int closestNumber(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int index = firstIndex(A, target);
        if (index == 0) {
            return 0;
        }
        if (index == A.length) {
            return A.length - 1;
        }

        if (target - A[index - 1] < A[index] - target) {
            return index - 1;
        }
        return index;
    }

    private int firstIndex(int[] A, int target) {
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < target) {
                start = mid;
            } else if (A[mid] > target) {
                end = mid;
            } else {
                end = mid;
            }
        }

        if (A[start] >= target) {
            return start;
        }
        if (A[end] >= target) {
            return end;
        }
        return A.length;
    }


}
