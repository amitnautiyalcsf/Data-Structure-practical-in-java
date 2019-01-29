package ds.doublyLinkedList;

public class DoublyLinkedList
{

    private static  Node first=null;
    private static Node last=null;

public static void insertFirst(int data)
{
    Node newNode= new Node();
    newNode.data=data;
    if(isEmpty())
    {
        last=newNode;
        
    }
    
    newNode.next=first;// newNode points to old first.
    first=newNode;// newNode becomes First.
}

public static boolean isEmpty()
{
    return first==null;
    
}


public static void insertLast(int data)

{
    
    Node newNode= new Node();
    newNode.data=data;
    if(isEmpty())
    {
        
        first=newNode;
        
    }
    else{
    
    last.next=newNode;// the next value of the last Node will point to the newNode.
    last=newNode;// we make the newNode which we created be the last one in the list.
    
    }
}
public static int deleteFirst()
{
    int temp=first.data;
    if(first.next==null)
    {
        last=null;
        
    }
    first=first.next;// first will point to old next value.
    return temp;
    
    
    
}
public static void displayList()
{
    Node current=first;
    System.out.println("List (first----->last)");
    while(current!=null)
    {
        current.displayNode();
        current=current.next;
        
    }
    System.out.println();
    
}

public static void main(String args[])
{


insertFirst(100);
insertFirst(200);
insertFirst(50);
insertFirst(90);
insertFirst(40);
insertLast(999999);

displayList();
System.out.println(deleteFirst());
displayList();

}
}
