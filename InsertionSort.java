import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	  int inputArray[] = {9,8,99,110,8,87,637,8,3,13,87,12,99};
	    insertionSort(inputArray);
	  for(int i=0;i<inputArray.length;i++)
	  {
	  System.out.println(inputArray[i]);    
	  }
	}

public static void insertionSort(int inputArray[])// In insertionSort we maintain sorting in the sorted area 
     {
         for(int i=1; i<inputArray.length;i++)
         {
             
             int element=inputArray[i];
             int j=i-1;
          while(j>=0 && inputArray[j]>element)
          {
              inputArray[j+1]=inputArray[j];
              j--;
              
          }
          inputArray[j+1]=element;
         }
         
         
    
        
     }
}
