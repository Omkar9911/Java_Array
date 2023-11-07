// Q 7 Print subarray
/*Enter size of an array = 5
Enter no of element =
2
4
6
8
10
You Entered no in an array is :
2 4 6 8 10
Subarray is:

2 
2 4
2 4 6
2 4 6 8
2 4 6 8 10

4
4 6
4 6 8
4 6 8 10

6
6 8
6 8 10

8
8 10

10  */

import java.util.*;
public class q7_subarrays 
{
  public static void subarray(int number[])
  {
    for(int i=0; i<number.length; i++)
    {
      int start=i;
      for(int j=i; j<=number.length; j++){
        int end=j;
        for(int k=start; k<end; k++){     
          System.out.print(number[k] + " ");
        }
        System.out.println();
      }
    }
  }
  public static void main(String[] args) {
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
    System.out.println();

    System.err.println("Subarray is: ");
    subarray(number);
    
  }
  
}
