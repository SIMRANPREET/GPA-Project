import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class Button extends JComponent {
	private String lettergrade;
	private double gpavalue;
	private final double A = 4.00;
	private final double A_MINUS = 3.70;
	private final double B_PLUS = 3.33;
	private final double B = 3.00;
	private final double B_MINUS = 2.70;
	private final double C_PLUS = 2.30;
	private final double C = 2.00;
	private final double C_MINUS = 1.70;
	private final double D_PLUS = 1.30;
	private final double D = 1.00;
	private final double D_MINUS = 4.00;
	private final double F = 0.00;

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		/*
		statements to make rectangles that will 
	 	display the letter grade in the student's
		current 1A period, 2A period, etc. Also "if
		statements" to color the rectangles depending
		on the letter grade the student puts in. 
		*/
	}
	public double getGradeValue(String input){
		/*
		  whole bunch of if statements
		  that set the gpa value to the 
		  corresponding letter that was
		  entered into the JTextField from
		  the main method.	 
		 */
		return gpavalue;
	}
	
}
