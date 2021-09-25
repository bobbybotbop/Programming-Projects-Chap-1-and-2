import java.util.*;

public class distance
{
  public static void main()
  {
    Scanner s  = new Scanner(System.in);
    System.out.println("type in x1");
    double x1 = s.nextDouble();
    System.out.println("type in y1");
    double y1 = s.nextDouble();
    System.out.println("type in x2");
    double x2 = s.nextDouble();
    System.out.println("type in y2");
    double y2 = s.nextDouble();

    double distance = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));  //???
    
    System.out.println(distance);

/*
type in x1
3
type in y1
3
type in x2
5
type in y2
5
2.8284271247461903
*/
  }
}