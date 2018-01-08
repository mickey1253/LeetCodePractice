package code.lint.four.breadthFirstSearch;

import java.util.ArrayList;

/*
*
* Design an algorithm and write code to serialize and deserialize a binary tree.
* Writing the tree to a file is called 'serialization' and reading back from the file
* to reconstruct the exact same binary tree is 'deserialization'.

 Notice

There is no limit of how you deserialize or serialize a binary tree,
LintCode will take your output of serialize as the input of deserialize,
it won't check the result of serialize.

Have you met this question in a real interview? Yes
Example
An example of testdata: Binary tree {3,9,20,#,#,15,7}, denote the following structure:

  3
 / \
9  20
  /  \
 15   7
Our data serialization use bfs traversal. This is just for when you got
wrong answer and want to debug the input.

You can use other method to do serializaiton and deserialization.

二叉树的序列化和反序列化

设计一个算法，并编写代码来序列化和反序列化二叉树。将树写入一个文件被称为“序列化”，
读取文件后重建同样的二叉树被称为“反序列化”。

如何反序列化或序列化二叉树是没有限制的，你只需要确保可以将二叉树序列化为一个字符串，
并且可以将字符串反序列化为原来的树结构
*
* */
public class BinaryTreeSerialization {

    /**
     * This method will be invoked first, you should design your own algorithm
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if(root == null){
            return "{}";
        }

        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);

        for(int i = 0; i < queue.size(); i++){
            TreeNode node = queue.get(i);
            if(node == null){
                continue;
            }

            queue.add(node.left);
            queue.add(node.right);
        }

        while(queue.get(queue.size() - 1) == null){
            queue.remove(queue.size() - 1);
        }

        StringBuilder sb = new StringBuilder();

        sb.append("{");
        sb.append(queue.get(0).val);

        for(int i = 1; i < queue.size(); i++){
            if(queue.get(i) == null){
                sb.append(",#");
            }else {
                sb.append(",");
                sb.append(queue.get(i).val);
            }
        }

        sb.append("}");
        return sb.toString();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here

        if(data.equals("{}")){
            return null;
        }

        String[] vals = data.substring(1, data.length()-1).split(",");

        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();

        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));

        queue.add(root);

        int index = 0;
        boolean isLeftChild = true;

        for(int i = 1; i < vals.length; i++){

            if(!vals[i].equals("#")){
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if(isLeftChild){
                    queue.get(index).left = node;
                }else{
                    queue.get(index).right = node;
                }
                queue.add(node);
            }

            if(!isLeftChild){
                index++;
            }

            isLeftChild = !isLeftChild;

        }

        return root;
    }


    // Jiu Zhang's Answer
    /*

     public String serialize(TreeNode root) {
        if (root == null) {
            return "{}";
        }

        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);

        for (int i = 0; i < queue.size(); i++) {
            TreeNode node = queue.get(i);
            if (node == null) {
                continue;
            }
            queue.add(node.left);
            queue.add(node.right);
        }

        while (queue.get(queue.size() - 1) == null) {
            queue.remove(queue.size() - 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(queue.get(0).val);
        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i) == null) {
                sb.append(",#");
            } else {
                sb.append(",");
                sb.append(queue.get(i).val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.equals("{}")) {
            return null;
        }
        String[] vals = data.substring(1, data.length() - 1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < vals.length; i++) {
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    queue.get(index).left = node;
                } else {
                    queue.get(index).right = node;
                }
                queue.add(node);
            }
            if (!isLeftChild) {
                index++;
            }
            isLeftChild = !isLeftChild;
        }
        return root;
    }

    * */


    //Shuo Chang's Answer


    /*
    *
    * public String serialize(TreeNode root) {
        if (root == null) {
            return "{}";
        }

        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);

        for (int i = 0; i < queue.size(); i++) {
            TreeNode node = queue.get(i);
            if (node == null) {
                continue;
            }
            queue.add(node.left);
            queue.add(node.right);
        }

        while (queue.get(queue.size() - 1) == null) {
            queue.remove(queue.size() - 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(queue.get(0).val);
        for (int i = 1; i < queue.size(); i++) {
            if (queue.get(i) == null) {
                sb.append(",#");
            } else {
                sb.append(",");
                sb.append(queue.get(i).val);
            }
        }
        sb.append("}");
        return sb.toString();
    }

   // This method will be invoked second, the argument data is what exactly
   // you serialized at method "serialize", that means the data is not given by
   // system, it's given by your own serialize method. So the format of data is
   // designed by yourself, and deserialize it here as you serialize it in
   // "serialize" method.

     public TreeNode deserialize(String data) {
        if (data.equals("{}")) {
            return null;
        }
        String[] vals = data.substring(1, data.length() - 1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < vals.length; i++) {
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    queue.get(index).left = node;
                } else {
                    queue.get(index).right = node;
                }
                queue.add(node);
            }
            if (!isLeftChild) {
                index++;
            }
            isLeftChild = !isLeftChild;
        }
        return root;
    }
    *
    * */
}
