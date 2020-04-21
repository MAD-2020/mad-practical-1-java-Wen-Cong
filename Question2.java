import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
     System.out.println("please enter your height: ");
    Scanner h = new Scanner(System.in);
    double height = h.nextDouble();
    System.out.println("please enter your weight: ");
    Scanner w = new Scanner(System.in);
    double weight = w.nextDouble();
    System.out.println("Your height is: " + height);
    System.out.println("Your weight is: " + weight);
  }
}
