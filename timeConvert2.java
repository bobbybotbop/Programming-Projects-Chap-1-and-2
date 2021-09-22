import java.util.*;

public class timeConvert2
{
  public static void main ()
  {
    Scanner s = new Scanner(System.in);
    
    System.out.println("enter seconds");

    int seconds = s.nextInt();
    int hours = seconds / 3600;

    int min = seconds - (hours * 3600);
    min = min/60;

    int sec = seconds - ((hours * 3600) + (min * 60));

    System.out.println(hours+ " hours");
    System.out.println(min+ " mins");
    System.out.println(sec+ " secs");
/*
enter seconds
9999
2 hours
46 mins
39 secs

*/


  }
}