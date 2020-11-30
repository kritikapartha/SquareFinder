import javax.swing.JOptionPane;
public class SquareFinderFinal {

   
	public static void main(String[] args) {
		String num1, trick;
		int number1;
      boolean facts = false;
      
     		
		num1 = JOptionPane.showInputDialog("Three Digit Number");
		number1 = Integer.parseInt(num1);
		
      
      
      trick = (((number1/100) * (number1/100)) + (2 * (number1/100) * (number1%10)) + ((number1%10) * (number1%10))); 
            
      if ((number1 * number1) == Integer.parseInt(trick))
         {
            facts = true;
         }
		else facts = false; 
      
		JOptionPane.showMessageDialog(null, "The ACTUAL square is: " + number1 * number1 , "Square Finder", JOptionPane.PLAIN_MESSAGE );
	         
      JOptionPane.showMessageDialog(null, "The TRICK way is: " + ((number1/100) * (number1/100)) + (2 * (number1/100) * (number1%10)) + ((number1%10) * (number1%10)) , "Square Finder", JOptionPane.PLAIN_MESSAGE );
     
      JOptionPane.showMessageDialog(null, "Do they MATCH: " + facts , "Square Finder", JOptionPane.PLAIN_MESSAGE );
     
      System.exit(0);

	   

		
	}
}