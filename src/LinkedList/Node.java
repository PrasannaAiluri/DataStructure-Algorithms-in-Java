package LinkedList;

public class Node {

	 int data;
     Node next;
     
     public Node()
     {
    	 data=0;
    	 next=null;
     }
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
     
}
