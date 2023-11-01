// Q 3 Take array from user and find the largest number in array
// Enter size of an array = 5
// Enter numbers :
// 8
// 2
// 5
// 7
// You entered number are : 
// 8 2 5 7 Smallest no is : 2

import java.util.Scanner;

public class q3_smallest_number 
{
  public static int getmini(int number[])
  {
    int getmini=Integer.MAX_VALUE;
    for(int i=0; i<number.length; i++)
    {
      if(getmini > number[i])
      {
        getmini = number[i];
      }
    }
    return getmini;
  }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array = ");
    int n = sc.nextInt();
    int number[] = new int[n];

    System.out.println("Enter numbers : ");
    for(int i=0; i<n; i++)
    {
      number[i]=sc.nextInt();
    }
    System.out.println("You entered number are : ");
    for(int i=0; i<n; i++)
    {
      System.out.print(number[i] + " ");
    }

    int getmini=getmini(number);
    System.out.println("Smallest no is : " + getmini);
  }
  
}
