import java.util.*;

public class tempConverter
{
  public static void main()
  {
    Scanner s = new Scanner(System.in);
    System.out.println("temp in fahrenheit");
    double f = s.nextDouble();

    double c = (f-32.0) * (5.0/9.0);

    System.out.println("temp in celsius " + c);

    /*
temp in fahrenheit
40
temp in celsius 4.444444444444445

    */
  }
}