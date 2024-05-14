import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        dfs(result, root);
        return result;
    }
    void dfs(List<Integer> result, TreeNode node) {
        if (node != null) {
            if(node.left != null) {
                dfs(result,node.left);
            }
            result.add(node.val);
            if(node.right != null) {
                dfs(result, node.right);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Main main = new Main();
        List<Integer> result = main.inorderTraversal(root);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}