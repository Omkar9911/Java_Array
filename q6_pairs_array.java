//Q 6 Pairs in an array 
// Enter size of an array = 5
// Enter no of element =
// 2
// 4
// 6
// 8
// 10
// You Entered no in an array is :
// 2 4 6 8 10 Pairs of array is :
// (2,4)(2,6)(2,8)(2,10)
// (4,6)(4,8)(4,10)
// (6,8)(6,10)
// (8,10)

import java.util.Scanner;
public class q6_pairs_array 
{
  public static void printpairs(int number[])
  {
    for(int i=0; i<number.length; i++)
    {
      int curr= number[i];
      {
        for(int j=i+1; j<number.length; j++)
        {
          System.out.print("(" + curr + "," + number[j] + ")");
        }
        System.out.println();
      }
    }
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

    System.out.println("Pairs of array is : ");
    printpairs(number);
    
  }
}
