package com.springboot.datastructuresandalgo.basicdsa;

public class TreeExample {

    // Tree (Binary Search Tree - BST)
    // Left subtree contains smaller values than the root.
    // Right subtree contains greater values than the root.
    // Time Complexity: O(log n) for insertion, search, and deletion (on average).

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);

        System.out.println("Inorder traversal of the BST:");
        tree.inorder(tree.root);  // Output: 20 30 40 50 70
    }

}

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    // Insert method
    TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Inorder Traversal (Left, Root, Right)
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}

