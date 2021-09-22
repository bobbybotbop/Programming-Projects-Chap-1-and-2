import java.util.*;

public class circleCalc
{
  public static void main()
  {
    Scanner s = new Scanner(System.in);

    System.out.println("gimme a radius");
    double radius = s.nextDouble();

    double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    double sa = 4.0 * Math.PI * Math.pow(radius, 2);

    System.out.println("ur volume is " + volume);
    System.out.println("ur surface area is " + sa);

/*
gimme a radius
2
ur volume is 33.510321638291124
ur surface area is 50.26548245743669
*/
  }
}