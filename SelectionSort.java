import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {12,81,74,43,1093,0,8,92,17,754,912,0,6,4};
	    selectionSort(inputArray);
	  for(int i=0;i<inputArray.length;i++)
	  {
	  System.out.println(inputArray[i]);    
	  }
	}

public static void selectionSort(int inputArray[])
     {
         for(int i=0; i<inputArray.length-1;i++)
         {
             
             int minimum=i;
             for(int j=i+1; j<inputArray.length;j++)
             {
                 if(inputArray[j]<inputArray[minimum])
                 {
                     minimum=j;
                     
                 }
                 
             }
             int temp=inputArray[i];
             inputArray[i]=inputArray[minimum];
             inputArray[minimum]=temp;
             
        }
    
        
     }
}
