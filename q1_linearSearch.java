// Q 1 Find the idex of element of a given array

// Enter key to find Index = 10
// Key is at index = 4

import java.util.Scanner;

public class q1_linearSearch 
{

public static int linearSearch(int number[], int key)
{
  for(int i=0; i<number.length; i++)
  {
    if(number[i] == key)
    {
      return i;
    }
  }
  return -1;
}

  public static void main(String[] args)
   {

    Scanner sc = new Scanner(System.in);
    int number[] = {2,4,6,8,10,12,14,16};

    System.out.println("Enter key to find Index = ");
    int key = sc.nextInt();

    int index=linearSearch(number, key);
    if(index== -1)
    {
      System.out.println("Not Found");
    }
    else{
      System.out.println("Key is at index = " + index);
    }
 
  }
  
}
