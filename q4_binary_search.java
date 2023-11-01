// Q 4 Binary Search array

// Enter size of an array = 7
// Enter no of element =
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// You Entered no in an array is :
// 2 4 6 8 10 12 14 enter key = 

// 12
// key found at index : 5

import java.util.Scanner;

public class q4_binary_search 
{
  public static int binarySearch(int number[],int key)
  {
    int start = 0, end = number.length-1;
     
    
    while (start <= end)                
    {
      
     int mid = (start + end ) /2;
      // comparisons
      if(number[mid] == key)
      {
        return mid; // found
      }
      if(number[mid] < key) // right
      {
        start = mid+1;
      }
      else{          // left
        end = mid - 1;
      }
    }
    return -1;

  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array = ");
    int n = sc.nextInt();
    int number[] = new int[n];

    System.out.println("Enter no of element = ");

    for(int i=0; i<n; i++)
    {
      number[i]=sc.nextInt();
    }

    System.out.println("You Entered no in an array is :");
    // print array
    for(int i=0; i<n; i++)
    {
      System.out.print( number[i]+ " " );
      
    }
     System.out.println("enter key = ");
     System.out.println();        
    int key = sc.nextInt();

    
    int bs=binarySearch(number, key);
    if(bs == -1)
    {
      System.out.println("Not found");
    }
    else{
      System.out.println("key found at index : " + bs);
    }
    
  }
  
}
