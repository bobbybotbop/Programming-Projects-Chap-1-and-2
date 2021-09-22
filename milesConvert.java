import java.util.*;

public class milesConvert
{
  public static void main()
  {
    Scanner s = new Scanner(System.in);
    System.out.println("miles: ");
    double miles = s.nextDouble();
    double km = miles * 1.60935;
    System.out.println("ur miles in km is " + km);
    

    /*
miles: 
100
ur miles in km is 160.935



    */
  }
}