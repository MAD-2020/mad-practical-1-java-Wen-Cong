import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    System.out.println("Enter a number: ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int ans = num * num;
    System.out.println(ans);
    
  }
}
