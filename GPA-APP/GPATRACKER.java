import java.io.IOException;

import javax.swing.JFrame;


/*
 * The class with the entry point. Creates the main GUI frame
 * and also loads a frame that displays all the courses in 
 * the file. (the file that saves all the course names using
 * the ClassFile class)
 */

public class GPATRACKER{

	public static void main(String[] args) throws IOException {
		GPAFRAME frame = new GPAFRAME();
		ShowClassFrame scf = new ShowClassFrame();
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      scf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	      scf.setVisible(true);
	}

}



