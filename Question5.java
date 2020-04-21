import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    System.out.print("Enter a number: ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    for(int j = 0; j < num; j++) 
    {
      Scanner i = new Scanner(System.in);
      int l = i.nextInt();
      a.add(l);
    }
    int max = 0;
    int mode = 0;
    for (int i = 0; i < a.size(); i++) 
    {
    int n = a.get(i);
    int count = 0;
    for (int j = 0; j < a.size(); j++)
    {
      int m = a.get(j);
      if(m == n){
        count += 1;
      }
      if(count > max){
        max = count;
        mode = n;
      }
    }
    }
    System.out.println("The mode is: " + mode);
    
  }
}
