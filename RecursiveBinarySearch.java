import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {2,5,6,9,10,14,18,90,100,109,303,1009,1990};
	  System.out.println(recursiveBinarySearch(inputArray,90,0,12));
	   System.out.println(recursiveBinarySearch(inputArray,1008,0,12));
	}

public static int recursiveBinarySearch(int inputArray[],int x,int start,int end )
     {
         if(start>end)
         {
             return -1;
             
         }
         else{
             
             int mid= (start+end)/2;
             if(inputArray[mid]==x)
             {
                 return mid;
                 
             }
             else if(inputArray[mid]>x)
             {
                 return recursiveBinarySearch(inputArray,x,start,mid-1);
                 
             }
             else{
                 
                return recursiveBinarySearch(inputArray,x,mid+1,end);
             }
    
             
         }
         
        
     }
}
