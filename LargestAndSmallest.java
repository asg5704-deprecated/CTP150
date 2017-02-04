import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class LargestAndSmallest {
   public static void main(String [] args) throws IOException {
      File infile = new File("numbers.txt");
      if(!infile.exists()) {
         System.out.println("File not found. Exiting...");
         System.exit(0);
      }//end find file
      double lowerBound, upperBound;
      double number, sum, positive, negative, multipleOf5;
      number = sum = positive = negative = multipleOf5 = 0;
      
      DecimalFormat formatter = new DecimalFormat("#,##0.000");
   
      Scanner scan = new Scanner(infile);
      Scanner scan2 = new Scanner(System.in);
      
      while(scan.hasNext()) {
         number = scan.nextDouble();
         sum += number;
            if(number < 0)
               negative = number;
            if(number > 0)
               positive = number;
            if(number % 5 == 0)
               multipleOf5 = number;     
      System.out.println("The sum of all numbers are: " + formatter.format(sum));
      System.out.println("The average of all numbers are: " + formatter.format(sum/50.0));
      System.out.println("The number of positive numbers are: " + positive);
      System.out.println("The number of negative numbers are: " + negative);
      System.out.println("The number of divisble by 5 are: " + multipleOf5);
      
      System.out.println("Enter a lower bound: "); 
      lowerBound = scan2.nextDouble();
      System.out.println("Enter an upper bound: "); 
      upperBound = scan2.nextDouble();
         if(lowerBound > upperBound) 
            lowerBound = upperBound;  
         if(lowerBound < 0 || lowerBound > 10000)
            lowerBound = upperBound; //end error-trap
      }//end while  
   }//end main
}//end class