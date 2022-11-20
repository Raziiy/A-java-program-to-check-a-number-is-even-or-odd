import java.util.Scanner;
 class evenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.print("Enter a number: ");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num % 2 == 0 )
      System.out.println(num+" is an even number.");
    else
      System.out.println(num+" is an odd number.");
  }
}