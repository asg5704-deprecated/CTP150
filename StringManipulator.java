import java.util.Scanner;

public class StringManipulator
{
   public static void main (String [] args)
   {
   String city;
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter the name of your favorite city: ");
   city = scan.nextLine();
   
   //Display number of characters
   System.out.println("Number of characters: " + city.length());
   
   //Display city name in uppercase
   System.out.println(city.toUpperCase());
   
   //Display city name in lowercase
   System.out.println(city.toLowerCase());
   
   //Display the first letter of city name
   System.out.println(city.charAt(0));
   
   }//End Main
}//End Class