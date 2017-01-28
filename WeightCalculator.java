import javax.swing.JOptionPane;

public class WeightCalculator
{
	public static void main(String [] args)
	{
	final double MERCURY = 0.38;
   final double VENUS = 0.91;
   final double MOON = 0.17;
   final double MARS = 0.38;
   final double JUPITER = 2.36;
   final double SATURN = 0.91;
   final double URANUS = 0.89;
   final double NEPTUNE = 1.13;
   final double PLUTO = 0.07;
	
	double weightEarth,
			 totalWeight;
   
   totalWeight = weightEarth = 0.00;
   			 
	weightEarth = Double.parseDouble(JOptionPane.showInputDialog
   ("Enter your weight (lbs) on Earth: "));
	
	String reply = JOptionPane.showInputDialog("Select a planet (or number)? \n" +
															 "	1) Mercury \n" +
															 "	2) Venus \n" +
															 "	3) Earth's Moon \n" +
															 "	4) Mars \n" +
                                              " 5) Jupiter \n" +
                                              " 6) Saturn \n" +
                                              " 7) Uranus \n" +
                                              " 8) Neptune \n" +
                                              " 9) Pluto* \n");
	byte choice = Byte.parseByte(reply);
   
	switch(choice) 
	{
		case 1: totalWeight = MERCURY * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Mercury is: " + totalWeight);
			break;
		case 2: totalWeight = VENUS * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Venus is: " + totalWeight);
			break;
		case 3: totalWeight = MOON * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Earth's Moon is: " + totalWeight);
			break;
		case 4: totalWeight = MARS * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Mars is: " + totalWeight);
         break;
		case 5: totalWeight = JUPITER * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Jupiter is: " + totalWeight);						 
			break;
      case 6: totalWeight = SATURN * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Saturn is: " + totalWeight);
         break;
      case 7: totalWeight = URANUS * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Uranus is: " + totalWeight);
         break;
      case 8: totalWeight = NEPTUNE * weightEarth;
         JOptionPane.showMessageDialog(null, "Your weight on Neptune is: " + totalWeight);
         break;
      case 9: totalWeight = PLUTO * weightEarth;
         JOptionPane.showMessageDialog(null, "Technically Pluto is no longer a planet!");
         JOptionPane.showMessageDialog(null, "However, your weight would be: " + totalWeight);
         break;
		default: totalWeight = 0;
	}//end switch
	}//end main
}//end class