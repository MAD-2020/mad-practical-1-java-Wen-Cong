import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
     System.out.print("Enter a number: ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    for(int j = 0; j < num; j++) 
    {
      for(int i = 0; i < 7-j; i++)
      {
        System.out.print("*");
      }
      System.out.print("\n");
    }
    
  }
}
