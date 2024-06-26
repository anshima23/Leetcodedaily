import java.util.Vector;

class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class linkedlist_to_binarytree {
    public static Tree convert(Node head, Tree node) {
        Vector<Tree> v = new Vector<>();
        
        while(head!=null){
            Tree temp = new Tree(head.data);
            v.add(temp);
            head = head.next;
        }
        
        int n = v.size();
        
        for(int i =0;i<n/2;i++){
            if(2*i+1<n){v.get(i).left = v.get(2*i+1);}
            if(2*i+2<n){v.get(i).right = v.get(2*i+2);}    
        }
        
        return v.get(0);
    }
}
