package code.lint.binaryTreeDivideConquer.three;

/**
 * Created by 505007855 on 9/25/2017.
 */
public class BinaryTreeInorderTraversal {

    /*
    *
    * Given a binary tree, return the inorder traversal of its nodes' values.

Have you met this question in a real interview? Yes
Example
Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3


return [1,3,2].
    *
    * */

    // JIU ZHANG's Answer
    /*
    *
    * public class Solution {
     // @param root: The root of binary tree.
     // @return: Inorder in ArrayList which contains node values.

        public ArrayList<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode curt = root;
        while (curt != null || !stack.empty()) {
            while (curt != null) {
                stack.add(curt);
                curt = curt.left;
            }
            curt = stack.pop();
            result.add(curt.val);
            curt = curt.right;
        }
        return result;
    }
}
    *
    * */



    // Shuo Chang's Answer
    /*
    *
    * public class Solution {

    //  @param root: The root of binary tree.
    // @return: Inorder in ArrayList which contains node values.

    //Divide conquer
    // public ArrayList<Integer> inorderTraversal(TreeNode root) {
    //     ArrayList<Integer> result = new ArrayList<Integer>();
    //     if(root == null){
    //         return result;
    //     }
    //     ArrayList<Integer> leftResult = inorderTraversal(root.left);
    //     ArrayList<Integer> rightResult = inorderTraversal(root.right);
    //     result.addAll(leftResult);
    //     result.add(root.val);
    //     result.addAll(rightResult);


    //     return result;
    // }

    //Traversal
    public ArrayList<Integer> inorderTraversal(TreeNode root){
        ArrayList<Integer> result = new ArrayList<Integer>();
        helper(result, root);
        return result;
    }

    public void helper(ArrayList<Integer> result, TreeNode root){
        if(root == null){
            return;
        }

        helper(result, root.left);

        result.add(root.val);

        helper(result, root.right);

    }

}
    *
    * */


}
