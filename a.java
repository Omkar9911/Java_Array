package Java_Array;

import java.util.Scanner;

public class a {
  public static void main(String[] args) {
    
    int marks[] = new int [50];

    Scanner sc = new Scanner(System.in);

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("phy = " + marks[0]);
    System.out.println("che = " + marks[0]);
    System.out.println("maths = " + marks[0]);

  }
  
}
