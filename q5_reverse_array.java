import java.util.Scanner;

public class q5_reverse_array 
{
  public static void reverse(int number[])
  {
    int first = 0, last = number.length-1;

    while (first < last)
     {
      int temp = number[last];
      number[last] = number[ first];
      number[first] = temp;
      first++;
      last--;
      
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
    System.out.println();
    System.out.println("Reverse array is : ");

    reverse(number);
    for(int i=0; i<number.length ; i++)
    {
    System.out.print(  number[i] + " ");
    }
    
  }
  
}
