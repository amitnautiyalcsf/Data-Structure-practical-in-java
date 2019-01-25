import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {9,8,99,110,8,87,637,8,3,13,87,12,99};
	  System.out.println(linearSearch(inputArray,1000));
	   System.out.println(linearSearch(inputArray,13));
	}

public static int linearSearch(int inputArray[],int x) 
     {
         for(int i=0; i<inputArray.length;i++)
         {
             
             if(inputArray[i]==x)
             {
                 return i;
                 
             }
             
         }
         return -1;
         
         
     }
}
