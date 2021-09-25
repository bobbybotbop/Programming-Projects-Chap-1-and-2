import java.util.*;

public class calc
{
  public static void main()
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("gimme a number");
    double first = scan.nextDouble();
    System.out.println("gimme another number");
    double second = scan.nextDouble();

    double sum = first+second;
    double diff = first - second;
    double pro = first * second;

    System.out.println("sum: " + sum);
    System.out.println("difference: "+ diff);
    System.out.println("product: " + pro);

    /*
gimme a number
1.5
gimme another number
2.5
sum: 4.0
difference: -1.0
product: 3.75

    */

        
  }
}