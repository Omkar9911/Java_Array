// Q 2 Take array from user and find the largest number in array
// Enter size of an array = 5
// Enter no of element = 
// 2
// 8
// 6
// 3
// 7
// You Entered no in an array is :
// 2 8 6 3 7
// Largest no is = 8

import java.util.Scanner;

public class q2_largest_number 
{
  public static int getLargest(int number[])
  {
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<number.length; i++)
    {
      if(largest < number[i])
      {
        largest = number[i];

      }
    }
    return largest;
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

    for(int i=0; i<n; i++)
    {
      System.out.print( number[i]+ " " );
      
    }
    System.out.println();
    

    int getLargest=getLargest(number);
    System.out.println("Largest no is = " + getLargest);

    
  }
  
}
