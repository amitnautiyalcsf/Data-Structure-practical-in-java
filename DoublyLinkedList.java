package ds.doublyLinkedList;
public class DoublyLinkedList
{
    private static  Node first=null;
    private static Node last=null;
    
    public static boolean isEmpty()
    {
        return first==null;
        
    }
    
    public static void insertFirst(int data)
    {
        Node newNode= new Node();
        newNode.data=data;
        if(isEmpty())
        {
            last=newNode; //if empty last will refer to the newNode being created.
            
            
        }
        else
        {
            
            
            first.previous=newNode;
            
        }
        newNode.next=first; // the new node's next field will point to the old first
        first=newNode;
        
    }
    public static void insertLast(int data)
    {
    
    Node newNode= new Node();
    newNode.data=data;
    if(isEmpty())
    {
        first=newNode;
    }
    else
    {
        last.next=newNode;// assigning old last to newNode
        newNode.previous=last;//old last will be the newNode's previous
        last=newNode;// the linked List's last field should point to the new Node.
        
    }
    }
    //assume non empty list 
    
    public static int deleteFirst()
    {
        int  temp=first.data;
        if(first.next==null)// there is only one node in the list.
        {
            last=null;
            
        }
        else
        {
        first.next.previous=null;
        }
        
        first=first.next;// we are assigning the refrence of the node following old first node to the first field in the Linked list obejct.
        
        return temp;
    }
    
    //assume Non-empty list
    
    public static int deleteLast()
    {
        int temp= last.data;
        if(first.next==null)
        {
            first=null;
            
        }
        else{
            
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
        
    }
    
    //assume Non-empty list
    
    public static void insertAfter(int key, int data)
    {
        Node newNode = new Node();
        newNode.data=data;
        
        Node current=first;// we start from the begining of the list.
        while(current.data!=key)// as long as we have not found the key in a particular node.
        {
            current=current.next;
            if(current==null)
            {
                return;
                
            }
            
        }
        
        if(current==last)
        {
         current.next=newNode;
         last=newNode;
        }
        else
        {
        newNode.next=current.next;// newNode's next field should point to the node ahead of the current
        current.next.previous=newNode;// the node ahead of the current, its previous field should point to the new node.
            
        }
        
        newNode.previous=current;
        current.next=newNode;
    }
    
    //assume Non-empty List
    
    public static Node deleteKey(int key)
    {
        Node current=first;// start from the begining.
        while(current.data!=key)
        {
            
            current=current.next;
            if(current==null)
            {
                return null;
                
            }
        }
        if(current==first)
        {
            
            first=current.next;// make the first field point to the node following current since current will be deleted.
            
        }
        else
        {
        current.previous.next=current.next;
        }
        if(current==last)
        {
            
            last=current.previous;
            
        }
        else{
            current.next.previous=current.previous;
            
        }
        return current;
        
    }
    
    public static void displayBackward()
    {   
        System.out.println("List(Last---->first)");
        Node current=last;
        while(current!=null)
        {
            current.displayNode();
            current=current.previous;
            
            
            
        }
        System.out.println();
        
    }
    

public static void displayForward()
{
    System.out.println("List(first----->last)");
    Node current= first;
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
insertAfter(999999,3434);
insertAfter(50,1009);
deleteFirst();
deleteLast();
deleteKey(999999);
displayForward();
displayBackward();

}
}
