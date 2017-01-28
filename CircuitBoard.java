 import javax.swing.JOptionPane;
 
 public class CircuitBoard
 {
 	public static void main(String [] args)
 	{
 		String answer;
 		double retailPrice;
 		double profit;
 		double rate = 0.4;
 		String formatter;
 		
 		answer = JOptionPane.showInputDialog("What is the retail price of your circuit board?");
 		retailPrice = Double.parseDouble(answer); //Parses String data to find double
 		
    profit = retailPrice * rate;
    formatter = String.format("%.2f", profit); //Formats string to two-decimal places
 		
    JOptionPane.showMessageDialog(null, "You entered $" + retailPrice + " Your profit is $" + formatter);
 		
 	}//end main
 }//end class