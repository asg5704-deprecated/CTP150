import java.io.*;
import java.util.Scanner;

public class FileLetterCounter {
   public static void main(String [] args) throws IOException {
      String fileName, characterAsString;
      char searchCharacter;
      int characterCount;
      String lineAsString;
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the filename (followed by a .txt) to continue.");
      fileName = scan.nextLine();
      
      File fileObject = new File(fileName);
      if(!fileObject.exists()) {
         System.out.println("The file " + fileName + " is not found.");
         System.out.println("Try again.");
         System.exit(0);
      }//end file not found error message
      
      System.out.println("Enter a character to be searched for in the file: ");
      characterAsString = scan.nextLine();
      searchCharacter = characterAsString.charAt(0);
      
      Scanner userFile = new Scanner(fileObject);
      characterCount = 0;
      
      while(userFile.hasNext()) {
         lineAsString = userFile.nextLine();
      
      for(int i = 0; i < lineAsString.length(); i++) {
         if(searchCharacter == lineAsString.charAt(i))
         characterCount++;
      }//end for loop
      }//end while loop
      
      System.out.println("\nThe character " + searchCharacter + " appears " +
                        characterCount + " times in the file.");
                        
      userFile.close(); //Don't forget to close file
   }//end main
}//end class