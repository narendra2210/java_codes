package Super150.Binary_Tree;

import java.util.*;

public class BinaryTree {
    public class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;

    public BinaryTree() {
        root = createtree();
    }

    Scanner sc = new Scanner(System.in);

    private Node createtree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            nn.left = createtree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc == true) {
            nn.right = createtree();
        }
        return nn;
    }

    public void Display(){
        Display(root);
    }

    private void Display(Node nn) {
        if(nn == null){
            return ;
        }
        String s = "";
        s = "<--" + nn.data + "-->";
        if (nn.left != null) {
            s = nn.left.data + s;

        } else {
            s = "." + s;
        }
        if (nn.right != null) {
            s = s + nn.right.data;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        Display(nn.left);
        Display(nn.right);
    }

    public int max(){
        return max(root);
    }

    public int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }

        int left = max(nn.left);
        int right  = max(nn.right);

        return Math.max(nn.data , Math.max(left , right));
    }

    public boolean find(int item){
        return find(root , item);
    }

    private boolean find(Node nn , int item){
        if(nn == null){
            return false;
        }

        if(nn.data == item){
            return true;
        }

        boolean left = find(nn.left , item);
        boolean right = find(nn.right , item);
        return left || right;
    }

    public int ht(){
        return ht(root);
    }

    private int ht(Node nn){
        if(nn == null){
            return -1; 
        }

        int lh = ht(nn.left);
        int rh = ht(nn.right);
        return Math.max(lh,rh) + 1;
    }
}
