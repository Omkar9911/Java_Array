// Q10 Bubble Sort

import java.util.Scanner;
public class q10_bubble_Sort 
{
  public static void bubbleSort(int arr[])
  {
    for(int i=0; i<arr.length; i++)
    {
      for(int j=0; j<arr.length-1-i; j++)
      {
        if(arr[j] > arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of an array = ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter no of element = ");

    for(int i=0; i<n; i++)
    {
      arr[i]=sc.nextInt();
    }

    System.out.println("You Entered no in an array is :");
    // print array
    for(int i=0; i<n; i++)
    {
      System.out.print( arr[i]+ " " );
    }
    System.out.println();
    bubbleSort(arr);
    
    for(int i=0; i<arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
  }
}
