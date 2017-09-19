package code.lint.binaryTreeDivideConquer.three;

/**
 * Created by 505007855 on 9/18/2017.
 */


class TreeNode {
     public int val;
     public TreeNode left, right;
     public TreeNode(int val) {
         this.val = val;
         this.left = this.right = null;
     }
 }



public class SubtreeWithMaximumAverage {

    private class ResultType{

        public int sum;
        public int size;

        public ResultType(int sum, int size){
            this.sum = sum;
            this.size = size;
        }

    }

    private TreeNode subTree = null;
    private ResultType subtreeResult = null;

    public TreeNode findSubtree2(TreeNode root){
        helper(root);
        return subTree;
    }

    public ResultType helper(TreeNode root){

        if(root == null){
            return new ResultType(0, 0);
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        ResultType result = new ResultType(left.sum + right.sum + root.val,
                left.size + right.size + 1);

        if (subTree == null || subtreeResult.sum * result.size < result.sum * subtreeResult.size){

            subTree = root;
            subtreeResult = result;
        }
        return result;

    }





    // JIU Zhang's Answer

    /*
    *

    version 1: Traverse + Divide Conquer
        public class Solution {
    private class ResultType {
        public int sum, size;
        public ResultType(int sum, int size) {
            this.sum = sum;
            this.size = size;
        }
    }

    private TreeNode subtree = null;
    private ResultType subtreeResult = null;


     @param root the root of binary tree
     @return the root of the maximum average of subtree

    public TreeNode findSubtree2(TreeNode root) {
        helper(root);
        return subtree;
    }

    private ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(0, 0);
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);
        ResultType result = new ResultType(
                left.sum + right.sum + root.val,
                left.size + right.size + 1
        );

        if (subtree == null ||
                subtreeResult.sum * result.size < result.sum * subtreeResult.size
                ) {
            subtree = root;
            subtreeResult = result;
        }
        return result;
    }
}
    *
   */



    // Shuo Chang's Answer

    /*
    *
    class ResultType{
    int sum;
    int num;
    public ResultType(int sum, int num){
        this.sum = sum;
        this.num = num;
    }
}
    public class Solution {

    @param root the root of binary tree
   @return the root of the maximum average of subtree

    TreeNode node;
    ResultType max;
    public TreeNode findSubtree2(TreeNode root) {
        helper(root);
        return node;
    }

    public ResultType helper(TreeNode root){
        if (root == null){
            return new ResultType(0, 0);
        }

        ResultType left = helper(root.left);
        ResultType right = helper(root.right);

        ResultType curt = new ResultType(left.sum + right.sum + root.val, left.num + right.num + 1);
        if (node == null || curt.sum * max.num > curt.num * max.sum){
            node = root;
            max = curt;
        }
        return curt;
     }
    *
    * */

}
