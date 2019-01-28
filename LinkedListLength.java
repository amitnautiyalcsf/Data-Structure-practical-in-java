class Node
{
    Node next=null;
    int data;
    
}
public class LinkedListLength
{
	public static void main(String[] args) {
	Node nodeA= new Node();
	nodeA.data=4;
	Node nodeB=new Node();
	
	nodeB.data=6;
	
	Node nodeC= new Node();
	nodeC.data=10;
	
	Node nodeD= new Node();
	nodeD.data=16;
	
	nodeA.next=nodeB;
	nodeB.next=nodeC;
	nodeC.next=nodeD;
	System.out.println("Length of the list is"+ listLength(nodeA));
	
	System.out.println("Length of the list is "+ listLength(nodeB));
	
	}


public static int listLength(Node aNode)
{
    
    int length=0;
    Node current = aNode;
    while(current.next!=null)
    {
        length++;
        current=current.next;
    }
    
    return length;
    
}

}
