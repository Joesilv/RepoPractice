// Name: SelectionSort
// Purpose: Find scope of selection sort
// Date: 09-13-16
// Author: Joseph Silva

public class SelectionSort {

   public static void main(String args[]) {
   
      // Variables
      int counter = 0;
      int counterTwo = 0;
      int[] arr = new int[10];
      
      System.out.println("Randomized Array: ");
      
      //Randomize , Initialize, print array
      for(int i = 0;i < arr.length;i++) {
         // Generate random number 1-10
         arr[i] = (int)(Math.random()* 10)+ 1;
         System.out.println(arr[i]);
      }
      
      System.out.println("\nSorted Array: ");
      
      //Sort the array arr[]
           for (int i = 0; i < arr.length - 1; i++) { //outer
               int index = i;
               for (int j = i + 1; j < arr.length; j++)
                   if (arr[j] < arr[index]) index = j;    
               int smallerNumber = arr[index];  // is smallerNumber initialization inside the if statement?
               arr[index] = arr[i];
               arr[i] = smallerNumber;
               System.out.println(arr[i]);
           }//for i
      
      System.out.println("Array Length: " + arr.length);
                                                    
   }// end main
}// end class

