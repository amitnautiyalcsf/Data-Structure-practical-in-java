
public class ReverseStringStack
{
    
   private int maxSize;
    private char[] stackArray;
    private int top;
    
    
    public ReverseStringStack(int size)
    {
        this.maxSize=size;
        this.stackArray= new char[maxSize];
        this.top=-1;
    }    
    
    public void push(char data)
    {
        if(isfull())
        {
            System.out.println("Stack is full");
            
        }
        top++;
        stackArray[top]=data;
        
        
    }
    
    public char pop()
    {
        if(isEmpty())
        {
        System.out.println("Stack is already Empty");
        
        }
        
        char data= stackArray[top];
        top--;
        return data;
        
        
    }
    
    public char peek()
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
    
     public static String reverseString(String str)
     {
    
    int stackSize= str.length();
    ReverseStringStack st= new ReverseStringStack(stackSize);
    
    for(int i =0;i<str.length();i++)
    {
        char ch= str.charAt(i);
        st.push(ch);
        
    }
    String result ="";
    while(!st.isEmpty())
    {
        char ch= st.pop();
        result= result + ch;
        
    }
     return result;
         
}
    
    public static void main(String[] args) 
    {
        System.out.println(reverseString("Hello Ammy"));
    }
}
