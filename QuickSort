import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	  int inputArray[] = {12,81,74,43,1093,0,8,92,17,754,912,0,6,4};
         quickSort(inputArray,0,inputArray.length-1);
    System.out.println(Arrays.toString(inputArray));
	}

public static void quickSort(int inputArray[],int start, int end)
     {
         if(start<end)
         {
             int q= partition(inputArray,start,end);// index position of the correctly placed value in the array
             quickSort(inputArray,start,q-1);//sorts the left half of the range
             quickSort(inputArray,q+1,end);// sorts the right half of the range
             
         }
     }
     
     public static int partition(int inputArray[],int start, int end)
     {
         int x = inputArray[end];// here x is taken as pivot value
         int temp;
         
         // in the first iteration , i starts from -1
         int i=start-1;
         for(int j=start;j<=end-1;j++)
        {
             if(inputArray[j]<=x)
             {
                 
                 i++;
                 // temp variable is used for swapping
                 temp= inputArray[i];
                 inputArray[i]=inputArray[j];
                 inputArray[j]=temp;
                 
             }
         }
         
         // put the pivot value in the correct slot next
         
         temp=inputArray[i+1];
         inputArray[i+1]=x;// here pivot value is placed in the correct slot of the array.
         inputArray[end]=temp;
         
         return i+1;
    }
}
