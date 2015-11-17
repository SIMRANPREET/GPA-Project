import java.awt.Graphics;
import java.awt.Graphics2D;


public class PredictableButton extends Button {
	private String classname;
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		/*
		Statements to make rectangles of different
		sizes and at different locations. These will
		hold strings that will be inputed into a
		JTextField and will also hold a grade letter
		and its corresponding gpa value.
		*/
	}
	
	public void setClassName(String s){
		classname = s;
		/*
		 this will set the class name to whatever
		 the user puts into the text field and will
		 be the string that will be displayed on the
		 button.
		 */
	}
	/*
	 because this class extends the Button class, this
	 should be able to use the getGradeValue() method 
	 to set the letter grades to a numeric value.
	 */
}
