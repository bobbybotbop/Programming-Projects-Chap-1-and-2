import java.util.*;

public class triCalc
{
  public static void main ()
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("gimme side 1 of triangle");
    double a = scan.nextDouble();
    System.out.println("gimme side 2 of triangle");
    double b = scan.nextDouble();
    System.out.println("gimme side 3 of triangle");
    double c = scan.nextDouble();

    double s = (a + b + c) / 2;

    System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));

/*
gimme side 1 of triangle
10
gimme side 2 of triangle
10
gimme side 3 of triangle
10
43.30127018922193
*/

  }
}