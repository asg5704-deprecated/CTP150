import java.util.Scanner;

public class DistanceTraveled {
   public static void main(String [] args) {
      double speed, hours, distance;
      String input;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter speed of vehicle in MPH: ");
      
      speed = scan.nextDouble();
      if(speed >= 1) {
         System.out.println("Enter number of hours traveled: ");
         hours = scan.nextDouble();
         
         if(hours >= 1) {
            System.out.println("Hour Distance Traveled: " +
                               "\n***********************");
         
            for (int i = 1; i <= hours; i++) {
               distance = (speed * i);
               System.out.println(i + "\t \t \t \t" + distance);
            }//end for
         }//end hours if-statement
         
         else
            System.out.println("Invalid hours!");
      }//end hours else statement
      else
         System.out.println("Invalid speed!");   
   }//end main
}//end class