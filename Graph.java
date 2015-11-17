import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;


public class Graph extends JComponent {
	double datapoint;
	double predictedgrade;
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		/*
		 This will draw the graph design, lines,
		 and points depending on the numeric values
		 gathered from the user by the predictable
		 button class. The x-axis are the terms, and 
		 the y-axis is the numeric value corresponding
		 to the letter grade retrieved from the
		 predictable button. It will also draw a 
		 trend line based on the data entered.
		 */	
	}
	
	public void setDataPoint(double i){
		datapoint = i;
		/*
		 sets datapoint to what the numeric
		 value of the grade that is held by
		 the predictable button. This datapoint
		 will now be added to the graph via the
		 paintComponenet method.
		 */
	}
	
	public void predictedGrade(){
		/*
		 contains statements that gets the value
		 one after the latest term using the 
		 trendline from the graph. This estimate
		 is rounded to the closest letter grade value
		 as seen in class Button. Sets predictedgrade
		 to this trend line estimate.
		 */
	}
	
	public double getTrendLineEstimate(){
		return predictedgrade;
		/*
		 A method that just returns the predicted grade value
		 so that it can be used by the CalculatedAverage class.
		 */
	}
}
