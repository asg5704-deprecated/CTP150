import javax.swing.JOptionPane;

public class MSUTuitionCalculator{
	public static void main(String [] args) {
	final double NON_RES_UNGRAD = 1263.00;
	final double NON_RES_GRAD = 1372.50;
	final double RESIDENT_UNGRAD = 468.75;
	final double RESIDENT_GRAD = 698.50;
	
	int numCredits = 0;
	char resStatus, level;
	double total = 0;
	
	resStatus = level = 'x';
	
	//String str = JOptionPane.showInputDialog("Are you a (R)esident or a (N)on-Resident?") *Chaining the method call
	
	level = JOptionPane.showInputDialog("Are you a (U)ndergraduate or a (G)raduate?").charAt(0);
	
	resStatus = JOptionPane.showInputDialog("Are you a (R)esident or a (N)on-Resident?").charAt(0);
	
	numCredits = Integer.parseInt(JOptionPane.showInputDialog("How many credits?")); //example of nesting method call
	
	if (resStatus == 'n' || resStatus == 'N') {
		if (level == 'u' || level == 'U')
			total = numCredits * NON_RES_UNGRAD;
		else if (level == 'g' || level == 'G')
			total = numCredits * NON_RES_GRAD;
		else
			total = -99;
	}//end if resStatus N					
	else if (resStatus == 'r' || resStatus == 'R') {
		if (level == 'u' || level == 'U')
			total = numCredits * RESIDENT_UNGRAD;
		else if (level == 'g' || level == 'G')
			total = numCredits * RESIDENT_GRAD;
		else
			total = -99; 		
	}//end if resStatus R	
	else
		total = -99;
	
	if (total < 0)  //could have tried total == -99, but floating point!
		JOptionPane.showMessageDialog(null, "Incorrect entries");
	else
		JOptionPane.showMessageDialog(null, "Total tuition due : " +
														 String.format("$%.2f", total));
														 
	//static method are called from the class name
	
	}//end main
}//end class

/*







*/