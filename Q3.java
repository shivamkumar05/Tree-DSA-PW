import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
 
class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
 
public class Q3
{
    public static void reverseLevelOrderTraversal(Node root)
    {
        if (root == null) {
            return;
        }
 
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
 
        Deque<Integer> stack = new ArrayDeque<>();
 
        
        Node curr;
 
     
        while (!queue.isEmpty())
        {
            curr = queue.poll();
 
            stack.push(curr.key);
 
           
            if (curr.right != null) {
                queue.add(curr.right);
            }
 
            if (curr.left != null) {
                queue.add(curr.left);
            }
        }
 

        while (!stack.isEmpty()) {
            System.out.print(stack.poll() + " ");
        }
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
 
        reverseLevelOrderTraversal(root);
    }
}