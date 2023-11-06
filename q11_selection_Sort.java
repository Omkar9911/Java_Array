// Q11 Selection sort

import java.util.Scanner;
public class q11_selection_Sort 
{
  public static void selectionSort(int arr[])
  {
    for(int i=0; i<arr.length; i++)
    {
      int minpos = i;
      for(int j=i+1; j<arr.length; j++)
      {
        if(arr[minpos] > arr[j])
        {
          minpos = j;
        }
      }
      // swap
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
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
    selectionSort(arr);

    for(int i=0; i<arr.length; i++)
      {
        System.out.print(arr[i] + " ");
      }
  }
  
}
