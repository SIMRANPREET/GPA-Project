import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ShowClassFrame extends JFrame {
	private static final int FRAME_WIDTH = 1130;
	private static final int FRAME_HEIGHT = 550;
	public JLabel c1;
	 JPanel p = new JPanel(null);
	public ShowClassFrame() throws IOException{
	      createPanel(); 
	      setSize(FRAME_WIDTH, FRAME_HEIGHT);
	 }
	
	private void createPanel() throws IOException{
		 setClassLabel();
		 add(p);
	}
	
	private void setClassLabel() throws IOException{
		File file = new File("High School Career Classes.txt");
		Scanner files = new Scanner(file);
		int y = 0;
		int x = 10;
		int labelcount = 0;
		while(files.hasNextLine()){
		String class1 = files.nextLine();
		c1 = new JLabel(class1);
		c1.setBounds(x,y,200,50);
		p.add(c1);
		y = y + 50;
		labelcount++;
		if(labelcount==10){
			x = x + 300;
			y = 0;
		}
		if(labelcount == 20){
			x = x + 300;
			y = 0;
		}
		if(labelcount == 30){
			x = x +300;
			y = 0;
		}
		}
	}

}
