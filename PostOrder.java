import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder{
    public static List<Integer> postOrder(Node root){
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;

        Stack<Node> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node curr = st.pop();
            result.add(curr.data);
            if(curr.left!=null) st.push(curr.left);
            if(curr.right!=null) st.push(curr.right);
        }
        return result;
    }


public class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
}