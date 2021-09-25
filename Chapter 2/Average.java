//William Chen 
import java.util.*;

public class Average
{
  public static void main ()
  {
    Scanner s = new Scanner(System.in);

    System.out.println("gimme a number");
    int first = s.nextInt();
    System.out.println("gimme a number");
    int second = s.nextInt();
    System.out.println("gimme a number");
    int third = s.nextInt();
    int average = (first + second + third) / 3;
    System.out.println(average);


    /*
gimme a number
10
gimme a number
6
gimme a number
8
8

    */
  }
}