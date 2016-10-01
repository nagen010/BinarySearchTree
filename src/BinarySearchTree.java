/** Binary Search Tree (BST):
 * Created by nagen on 10/1/16.
 */
public class BinarySearchTree {
    private class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;

    private BinarySearchTree() {
        this.root = null;
    }

    private void insert(int v) {
        root = insertToTree(root, v);
    }

    private Node insertToTree(Node root, int v) {
        if(root == null) {
            return new Node((v));
        }

        if(root.value > v) {
            root.left = insertToTree(root.left, v);
        }
        else if (root.value < v) {
            root.right = insertToTree(root.right, v);
        }

        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(3);
        bst.insert(4);
        bst.insert(1);

        bst.inOrderTraversal();

    }

    private void inOrderTraversal() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if(root!= null) {
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
        }
    }
}
