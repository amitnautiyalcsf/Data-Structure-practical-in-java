package ds.SinglyLinkedList;

public class SinglyLinkedList
{
    static private Node first;

    public static boolean isEmpty()
{
    return (first==null);
}

// used to insert at the begining of the list 
    
public static void insertFirst(int data)
{
    
    Node newNode= new Node();
    newNode.data=data;
    newNode.next=first;
    first=newNode;
    
}

//used to delete at the begining of the list

public static Node deleteFirst()
{
    Node temp= first;
    first=first.next;
    return temp;
    
    
}

//displaying the list 

public static void displayList()
{
    System.out.println("List (first -----> last)");
    
    Node current = first;
    while(current!=null)
    {
     current.displayNode();
     current=current.next;
        
    }
    System.out.println();
    
}

//used to insert data at the end

public static void insertLast(int data)

{

Node current=first;
while(current.next!=null)
{
    current=current.next; // we will loop untill current.next is null
    
}

Node newNode = new Node();
newNode.data=data;
current.next=newNode;

}


public static void main(String args[])
{
insertFirst(100);
insertFirst(200);
insertFirst(50);
insertFirst(90);
insertFirst(40);
displayList();
insertLast(99999);
displayList();

}
}

