import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {2,5,6,9,10,14,18,90,100,109,303,1009,1990};
	  System.out.println(BinarySearch(inputArray,14));
	   System.out.println(BinarySearch(inputArray,303));
	}

public static int BinarySearch(int inputArray[],int x)
     {
         int start=0;
         int end=inputArray.length-1;
        
        while(start<=end)
        {
            int mid =(start+end)/2;
            if(inputArray[mid]>x)
            {
                
                end=mid-1;
            }
            else if (inputArray[mid]==x)
            {
                
                return mid;
                
            }
            else
            {
                start=mid+1;
                
            }
            
        }
        return -1;
         
         
     }
}
