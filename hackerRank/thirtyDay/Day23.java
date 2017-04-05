package hackerRank.thirtyDay;

import java.util.*;

class Node2{
    Node2 left,right;
    int data;
    Node2(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23 {
	
    static void levelOrder(Node2 root){
        //Write your code here
    	if(root != null){
    		LinkedList<Node2> l = new LinkedList<Node2>();
    		l.add(root);
    		while(root != null){
    			System.out.println(root.data);
    		}
    	}
     
       }
	
	public static Node2 insert(Node2 root,int data){
        if(root==null){
            return new Node2(data);
        }
        else{
            Node2 cur;
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
            Node2 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
            sc.close();
            
        }
}
