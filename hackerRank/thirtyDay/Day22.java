package hackerRank.thirtyDay;

import java.util.*;

class Node1{
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}
    
public class Day22 {
	public static int getHeight(Node1 root){
	      //Write your code here
	    int Left = 0;
	    int Right = 0;

	    if (root.left != null) {
	        Left = getHeight(root.left) + 1;
	    }
	    if (root.right != null) {
	        Right = getHeight(root.right) + 1;
	    }

	  return (Left > Right ? Left : Right);
	    }
	public static Node1 insert(Node1 root,int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node1 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
            sc.close();
        }	

}
