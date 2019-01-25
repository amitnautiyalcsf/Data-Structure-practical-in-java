import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {9,8,99,110,8,87,637,8,3,13,87,12,99};
	  System.out.println(recursiveLinearSearch(inputArray,1000,0));
	   System.out.println(recursiveLinearSearch(inputArray,13,0));
	}

public static int recursiveLinearSearch(int inputArray[],int x, int i)
     {
         if(i>inputArray.length-1)
         {
             return -1;
             
         }
         
         else if(inputArray[i]==x)
         {
             return i;
             
         }
         else
         {
        System.out.println("Index at position i " +i);
        return recursiveLinearSearch(inputArray,x,i+1);
         }
         
     }
}
