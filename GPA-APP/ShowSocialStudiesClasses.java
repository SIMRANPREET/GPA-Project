import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * This class is another frame that displays all
 * the courses that have been saved by the user in 
 * the file created in the ClassFile class.
 */
public class ShowSocialStudiesClasses extends JFrame {
	private static final int FRAME_WIDTH = 1130;
	private static final int FRAME_HEIGHT = 1050;
	public JLabel c1;
	JPanel p = new JPanel(null);
	 
	/*
	 * Calls the setClassLabel method which displays
	 * the contents of the file.
	 * @throws IOException
	 */
	public ShowSocialStudiesClasses() throws IOException{
		setClassLabel();
		add(p);
	    setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	/*
	 * This method opens the file that was created in the
	 * ClassFile class for reading. Only reads the file not 
	 * writes to it. It creates a new JLabel for every course
	 * in the file and displays it with a maximum of 10 courses 
	 * per column and a maximum of 4 columns.
	 * @throws IOException
	 */
	private void setClassLabel() throws IOException{
		Scanner files = new Scanner(new File("Social Studies Classes.txt"));
		int y = 0;
		int x = 10;
		int labelcount = 0;
		while(files.hasNextLine()){
			String class1 = files.nextLine();
			c1 = new JLabel(class1);
			c1.setBounds(x,y,260,50);
			p.add(c1);
			y = y + 50;
			labelcount++;
			if(labelcount == 20){
				x = x + 300;
				y = 0;
			}
			if(labelcount == 40){
				x = x + 300;
				y = 0;
			}
			if(labelcount == 60){
				x = x + 300;
				y = 0;
			}
			if(labelcount == 80){
				x = x + 300;
				y = 0;
			}
			if(labelcount == 100){
				x = x + 300;
				y = 0;
			}
		}
		files.close();
	}
}
