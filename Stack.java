package ds.Stack;
public class Stack
{
    
   private int maxSize;
    private long[] stackArray;
    private int top;
    
    
    public Stack(int size)
    {
        this.maxSize=size;
        this.stackArray= new long[maxSize];
        this.top=-1;
    }    
    
    public void push(long data)
    {
        if(isfull())
        {
            System.out.println("Stack is full");
            
        }
        top++;
        stackArray[top]=data;
        
        
    }
    
    public long pop()
    {
        if(isEmpty())
        {
        System.out.println("Stack is already Empty");
        
        }
        
        long data= stackArray[top];
        top--;
        return data;
        
        
    }
    
    public long peek()
    {
        
        return stackArray[top];
        
    }
     public boolean isfull()
     {
         
         return(maxSize-1==top);
     }
    
    public boolean isEmpty()
    {
        return(top==-1);
    }
    
    
    public static void main(String[] args) {
	Stack st= new Stack(10);
	
		st.push(10);
		st.push(20);
		st.push(90);
		st.push(100);
	    System.out.println(st.peek());
		while(!st.isEmpty())
		{
		    
		    System.out.println(st.pop());
		}
		

		
		
	}
}
