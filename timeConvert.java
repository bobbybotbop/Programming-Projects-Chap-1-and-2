import java.util.*;


public class timeConvert
{
  public static void main()
  {
    Scanner s = new Scanner(System.in);

    System.out.println("hours: ");
    double hour = s.nextDouble();
    System.out.println("mins: ");
    double min = s.nextDouble();
    System.out.println("seconds: ");
    double sec = s.nextDouble();
    System.out.println("thats equal to " + ((hour*3600) + (min * 60) + sec) + " seconds");

  }
/*


hours: 
1
mins: 
5
seconds: 
3
thats equal to 3903.0 seconds



*/
}