
class node
{
    node left;
    node right;
    int data;
    node(int data)
    {
        this.left=null;
        this.right=null;
        this.data=data;

    }

    void preOrderTraversal(node root)
    {
        if(root==null)
        return;
        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
public class temp
{
    public static void main(String[] args) {
        node root= new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        root.preOrderTraversal(root);
    }
}