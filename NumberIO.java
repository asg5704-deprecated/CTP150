import javax.swing.JOptionPane;

public class NumberIO {
   public static void main(String [] args){
   
   int userNum;
   String input;
   
   input = JOptionPane.showInputDialog("Enter a number between 1 and 35");
   byte choice = Byte.parseByte(input);
   
   if(choice <= 9 && choice > 0)
      JOptionPane.showMessageDialog(null, "Your number is  " + choice);
   else
      switch(choice)
      {
      case 10: JOptionPane.showMessageDialog(null, "Your letter is A");
         break;
      case 11: JOptionPane.showMessageDialog(null, "Your letter is B");
         break;
      case 12: JOptionPane.showMessageDialog(null, "Your letter is C");
         break;
      case 13: JOptionPane.showMessageDialog(null, "Your letter is D");
         break;
      case 14: JOptionPane.showMessageDialog(null, "Your letter is E");
         break;
      case 15: JOptionPane.showMessageDialog(null, "Your letter is F");
         break;
      case 16: JOptionPane.showMessageDialog(null, "Your letter is G");
         break;
      case 17: JOptionPane.showMessageDialog(null, "Your letter is H");
         break;
      case 18: JOptionPane.showMessageDialog(null, "Your letter is I");
         break;
      case 19: JOptionPane.showMessageDialog(null, "Your letter is J");
         break;
      case 20: JOptionPane.showMessageDialog(null, "Your letter is K");
         break;
      case 21: JOptionPane.showMessageDialog(null, "Your letter is L");
         break;
      case 22: JOptionPane.showMessageDialog(null, "Your letter is M");
         break;
      case 23: JOptionPane.showMessageDialog(null, "Your letter is N");
         break;
      case 24: JOptionPane.showMessageDialog(null, "Your letter is O");
         break;
      case 25: JOptionPane.showMessageDialog(null, "Your letter is P");
         break;
      case 26: JOptionPane.showMessageDialog(null, "Your letter is Q");
         break;
      case 27: JOptionPane.showMessageDialog(null, "Your letter is R");
         break;
      case 28: JOptionPane.showMessageDialog(null, "Your letter is S");
         break;
      case 29: JOptionPane.showMessageDialog(null, "Your letter is T");
         break;
      case 30: JOptionPane.showMessageDialog(null, "Your letter is U");
         break;
      case 31: JOptionPane.showMessageDialog(null, "Your letter is V");
         break;
      case 32: JOptionPane.showMessageDialog(null, "Your letter is W");
         break;
      case 33: JOptionPane.showMessageDialog(null, "Your letter is X");
         break;
      case 34: JOptionPane.showMessageDialog(null, "Your letter is Y");
         break;
      case 35: JOptionPane.showMessageDialog(null, "Your letter is Z");
         break;
      default: JOptionPane.showMessageDialog(null, "I'm sorry you didn't enter a number between 1 - 35");
  
      }//end switch
     }//end main
}//end class