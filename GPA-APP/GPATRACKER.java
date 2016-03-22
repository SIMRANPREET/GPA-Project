import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;




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



