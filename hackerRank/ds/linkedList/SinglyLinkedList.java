package hackerRank.ds.linkedList;

import java.util.Scanner;

public class SinglyLinkedList {
	static Scanner sc = new Scanner(System.in);
	static Node head = null;

	public static void main(String[] args) {

		int elements = sc.nextInt();

		for (int i = 0; i < elements; i++) {
			Node node = new Node();

			node.data = sc.nextInt();
			node.next = null;

			AddNodeToFront(node);

		}
		Node back = new Node(9,null);
		
		AddNodeAtPosition(back, 3);
		System.out.println("Printing nodes data");
		printLinkedList();
		back = new Node(19,null);
		System.out.println("Added a node at the back");
		AddNodeToBack(back);
		printLinkedList();
		System.out.println("deleting a node");
		DeleteNodeAtPosition(7);
		printLinkedList();
		System.out.println("Printing reverse");
		printReverse();
		sc.close();
	}
	
	/*
	 * Adding a Node to the front of the already existing linked list
	 * 
	 * parameter Node : to be added to the front linked list
	 * */
	public static void AddNodeToFront(Node node) {
		Node temp = head;
		if (temp == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	/*Adding a Node to the back of the already existing linked list
	 * 
	 * parameter Node : to be added to the back of the linked list
	 * */
	public static void AddNodeToBack(Node node){
		Node temp = head;
		if(temp == null)
			head = node;
		else{
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	/*
	 * Adding a node to a particular position in the linked list
	 * 
	 * parameter node : is the node to be added. 
	 * parameter pos : is the position where the node to be added.
	 * */
	public static void AddNodeAtPosition(Node node, int pos){
		Node temp = head;
		int count=0;
		if(head == null){
			head = node;
		}
		
		if(pos == 0){
			node.next = temp;
			temp = node;
		}
		else {
			while(temp.next != null && count < (pos-1)){
				temp = temp.next;
				count++;
			}
			if(temp.next != null){
				node.next = temp.next;
				temp.next = node;
			}
			else{
				temp.next = node;
			}
		}
	}
	
	/* This function delete a node at a particular position in the linked list
	 * 
	 * Parmeter pos : Position where the node to be deleted */
	public static void DeleteNodeAtPosition(int pos){
		Node temp = head;
		int count = 0;
		if(head == null){
			return;
		}
		if(pos == 0)
			head = temp.next;
		else{
			while(temp.next != null && (count < pos-1)){
				temp = temp.next;
				count++;
			}
		    if (temp == null || temp.next == null)
		            return;
		 
		        // Node temp->next is the node to be deleted
		        // Store pointer to the next of node to be deleted
		    Node next = temp.next.next;
		    temp.next = next;
		}
		System.out.println("deleted");
	}

	/* Print the nodes in the linked list from front to
	 * back
	 */
	public static void printLinkedList() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
	public static void printReverse(){
		Node temp = head;
		Node tempHead = reverse(temp);
		
		while(tempHead !=null){
			System.out.println(tempHead.data);
			tempHead = tempHead.next;
		}
	}
	
	public static Node reverse(Node temp){
		
		Node current = temp;
		Node previous = null;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			
			current = next;
		}
		
		return previous;
	}

}
