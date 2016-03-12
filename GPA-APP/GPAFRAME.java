import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GPAFRAME extends JFrame{
	 private static final int FRAME_WIDTH = 1130;
	 private static final int FRAME_HEIGHT = 500;
	 
	 private JTextArea gpaText;
	 private JTextArea pgpaText;
	 private JButton grade1;
	 private JButton grade2;
	 private JButton grade3;
	 private JButton grade4;
	 private JButton grade5;
	 private JButton grade6;
	 private JButton grade7;
	 private JButton grade8;
	 private JButton saveButton;
	 private JLabel label1;
	 private JLabel label2;
	 private JLabel label3;
	 private JLabel label4;
	 private JLabel label5;
	 private JLabel label6;
	 private JLabel label7;
	 private JLabel label8;
	 private JLabel gpalabel;
	 private JLabel pgpalabel;
	 private JLabel enterclasshere;
	 private JTextField input1;
	 private JTextField input2;
	 private JTextField input3;
	 private JTextField input4;
	 private JTextField input5;
	 private JTextField input6;
	 private JTextField input7;
	 private JTextField input8;
	 private JTextField enterclassheretext;
	 
	 public GPAFRAME(){
	      createPanel(); 
	      
	      setSize(FRAME_WIDTH, FRAME_HEIGHT);
	 }
	 private void createPanel(){
		 JPanel p = new JPanel(null);
		  createTextField();
		 p.add(input1);
		 p.add(input2);
		 p.add(input3);
		 p.add(input4);
		 p.add(input5);
		 p.add(input6);
		 p.add(input7);
		 p.add(input8);
		 p.add(enterclassheretext);
		 p.add(grade1);
		 p.add(grade2);
		 p.add(grade3);
		 p.add(grade4);
		 p.add(grade5);
		 p.add(grade6);
		 p.add(grade7);
		 p.add(grade8);
		 p.add(saveButton);
		 p.add(label1);
		 p.add(label2);
		 p.add(label3);
		 p.add(label4);
		 p.add(label5);
		 p.add(label6);
		 p.add(label7);
		 p.add(label8);
		 p.add(enterclasshere);
		 p.add(gpalabel);
		 p.add(pgpalabel);
		 p.add(gpaText);
		 p.add(pgpaText);
		 add(p);
	 }
	 
	 
	 
	 
	 
	 class AddActionListener3 implements ActionListener{
		 public void actionPerformed(ActionEvent event){
			 ClassFile saveFile = new ClassFile();
			 try {
				saveFile.addClassName(enterclassheretext.getText());
			} catch (IOException e) {
				e.printStackTrace();
			}
			 enterclassheretext.setText("");
		 }
	 }
	 
	 
	 public void createTextField(){
	      input1 = new JTextField();
	      input1.setBounds(10, 30, 100, 30);
	      input2 = new JTextField();
	      input2.setBounds(120, 30, 100, 30);
	      input3 = new JTextField();
	      input3.setBounds(230, 30, 100, 30);
	      input4 = new JTextField();
	      input4.setBounds(340, 30, 100, 30);
	      input5 = new JTextField();
	      input5.setBounds(450, 30, 100, 30);
	      input6 = new JTextField();
	      input6.setBounds(560, 30, 100, 30);
	      input7 = new JTextField();
	      input7.setBounds(670, 30, 100, 30);
	      input8 = new JTextField();
	      input8.setBounds(780, 30, 100, 30);
	      enterclassheretext = new JTextField();
	      enterclassheretext.setBounds(24,240,150,30);
	      input1.addKeyListener(new InputKeyListener());
	      input2.addKeyListener(new InputKeyListener());
	      input3.addKeyListener(new InputKeyListener());
	      input4.addKeyListener(new InputKeyListener());
	      input5.addKeyListener(new InputKeyListener());
	      input6.addKeyListener(new InputKeyListener());
	      input7.addKeyListener(new InputKeyListener());
	      input8.addKeyListener(new InputKeyListener());
	      
	      	 grade1 = new JButton();
			 grade2 = new JButton();
			 grade3 = new JButton();
			 grade4 = new JButton();
			 grade5 = new JButton();
			 grade6 = new JButton();
			 grade7 = new JButton();
			 grade8 = new JButton();
			 saveButton = new JButton("save");
			 ActionListener listener3 = new AddActionListener3();
			 grade1.setBounds(35,70,50,50);
			 grade2.setBounds(145,70,50,50);
			 grade3.setBounds(255,70,50,50);
			 grade4.setBounds(365,70,50,50);
			 grade5.setBounds(475,70,50,50);
			 grade6.setBounds(585,70,50,50);
			 grade7.setBounds(695,70,50,50);
			 grade8.setBounds(805,70,50,50);
			 saveButton.setBounds(50,280,90,30);
			 saveButton.addActionListener(listener3);
			 label1 = new JLabel("Grade for A1");
			 label1.setBounds(24, 5, 100, 30);
			 label2 = new JLabel("Grade for A2");
			 label2.setBounds(134, 5, 100, 30);
			 label3 = new JLabel("Grade for A3");
			 label3.setBounds(244, 5, 100, 30);
			 label4 = new JLabel("Grade for A4");
			 label4.setBounds(354, 5, 100, 30);
			 label5 = new JLabel("Grade for B1");
			 label5.setBounds(464, 5, 100, 30);
			 label6 = new JLabel("Grade for B2");
			 label6.setBounds(574, 5, 100, 30);
			 label7 = new JLabel("Grade for B3");
			 label7.setBounds(684, 5, 100, 30);
			 label8 = new JLabel("Grade for B4");
			 label8.setBounds(794, 5, 100, 30);
			 gpalabel = new JLabel("        GPA");
			 gpalabel.setBounds(904, 5, 100, 30);
			 pgpalabel = new JLabel("Predicted GPA");
			 pgpalabel.setBounds(1008, 5, 100, 30);
			 enterclasshere = new JLabel("Enter the Class's name here");
			 enterclasshere.setBounds(24,200,200,30);
			 gpaText = new JTextArea();
			 gpaText.setBounds(890, 30, 100, 30);
			 gpaText.setEditable(false);
			 pgpaText = new JTextArea();
			 pgpaText.setBounds(1000, 30, 100, 30);
			 pgpaText.setEditable(false);
	 }
	 
	 public String getenterclassheretext(){
		 return enterclassheretext.getText();
	 }
	 
	 private class InputKeyListener implements KeyListener
	   {
	     public void keyTyped(KeyEvent e){}
	     public void keyPressed(KeyEvent e){
	    	 if(e.getKeyCode() == KeyEvent.VK_ENTER){
	         if(input1.getText() != null){
	        	 grade1.setText(input1.getText());
	         }
	         if(input2.getText() != null){
	 	        	 grade2.setText(input2.getText());
	 	         }
	         if(input3.getText() != null){
	 	        	 grade3.setText(input3.getText());
	 	         }
	         if(input4.getText() != null){
	 	        	 grade4.setText(input4.getText());
	 	         }
	         if(input5.getText() != null){
	 	        	 grade5.setText(input5.getText());
	 	         }
	         if(input6.getText() != null){
	 	        	 grade6.setText(input6.getText());
	 	         }
	         if(input7.getText() != null){
	 	        	 grade7.setText(input7.getText());
	 	         }
	         if(input8.getText() != null){
	 	        	 grade8.setText(input8.getText());
	 	         }
       	 if(input1.equals("CLEAR")){
       		 grade1.setText(null);
       	 }
       	 if(input2.equals("CLEAR")){
       		 grade2.setText(null);
       	 }
       	 if(input3.equals("CLEAR")){
       		 grade3.setText(null);
       	 }
       	 if(input4.equals("CLEAR")){
       		 grade4.setText(null);
       	 }
       	 if(input5.equals("CLEAR")){
       		 grade5.setText(null);
       	 }
       	 if(input6.equals("CLEAR")){
       		 grade6.setText(null);
       	 }
       	 if(input7.equals("CLEAR")){
       		 grade7.setText(null);
       	 }
       	 if(input8.equals("CLEAR")){
       		 grade8.setText(null);
       	 }
       	double s1=0;
		double s2=0;
		double s3=0;
		double s4=0;
		double s5=0;
		double s6=0;
		double s7=0;
		double s8=0;
		if(input1.getText().equals("A")){
			s1 = 4.00;
			grade1.setBackground(Color.GREEN);
		}
		if(input1.getText().equals("A-")){
			s1 = 3.67;
			grade1.setBackground(Color.GREEN);
		}
		if(input1.getText().equals("B+")){
			s1 = 3.33;
			grade1.setBackground(new Color(200, 250, 0));
		}
		if(input1.getText().equals("B")){
			s1 = 3.00;
			grade1.setBackground(new Color(200, 250, 0));
		}
		if(input1.getText().equals("B-")){
			s1 = 2.67;
			grade1.setBackground(new Color(200, 250, 0));
		}
		if(input1.getText().equals("C+")){
			s1 = 2.33;
			grade1.setBackground(new Color(250, 250, 0));
		}
		if(input1.getText().equals("C")){
			s1 = 2.00;
			grade1.setBackground(new Color(250, 250, 0));
		}
		if(input1.getText().equals("C-")){
			s1 = 1.67;
			grade1.setBackground(new Color(250, 250, 0));
		}
		if(input1.getText().equals("D+")){
			s1 = 1.33;
			grade1.setBackground(new Color(250, 200, 0));
		}
		if(input1.getText().equals("D")){
			s1 = 1.00;
			grade1.setBackground(new Color(250, 200, 0));
		}
		if(input1.getText().equals("D-")){
			s1 = 0.67;
			grade1.setBackground(new Color(250, 200, 0));
		}
		if(input1.getText().equals("F")){
			s1 = 0.00;
			grade1.setBackground(Color.RED);
		}
		if(input2.getText().equals("A")){
			s2 = 4.00;
			grade2.setBackground(Color.GREEN);
		}
		if(input2.getText().equals("A-")){
			s2 = 3.67;
			grade2.setBackground(Color.GREEN);
		}
		if(input2.getText().equals("B+")){
			s2 = 3.33;
			grade2.setBackground(new Color(200, 250, 0));
		}
		if(input2.getText().equals("B")){
			s2 = 3.00;
			grade2.setBackground(new Color(200, 250, 0));
		}
		if(input2.getText().equals("B-")){
			s2 = 2.67;
			grade2.setBackground(new Color(200, 250, 0));
		}
		if(input2.getText().equals("C+")){
			s2 = 2.33;
			grade2.setBackground(new Color(250, 250, 0));
		}
		if(input2.getText().equals("C")){
			s2 = 2.00;
			grade2.setBackground(new Color(250, 250, 0));
		}
		if(input2.getText().equals("C-")){
			s2 = 1.67;
			grade2.setBackground(new Color(250, 250, 0));
		}
		if(input2.getText().equals("D+")){
			s2 = 1.33;
			grade2.setBackground(new Color(250, 200, 0));
		}
		if(input2.getText().equals("D")){
			s2 = 1.00;
			grade2.setBackground(new Color(250, 200, 0));
		}
		if(input2.getText().equals("D-")){
			s2 = 0.67;
			grade2.setBackground(new Color(250, 200, 0));
		}
		if(input2.getText().equals("F")){
			s2 = 0.00;
			grade2.setBackground(Color.RED);
		}
		if(input3.getText().equals("A")){
			s3 = 4.00;
			grade3.setBackground(Color.GREEN);
		}
		if(input3.getText().equals("A-")){
			s3 = 3.67;
			grade3.setBackground(Color.GREEN);
		}
		if(input3.getText().equals("B+")){
			s3 = 3.33;
			grade3.setBackground(new Color(200, 250, 0));
		}
		if(input3.getText().equals("B")){
			s3 = 3.00;
			grade3.setBackground(new Color(200, 250, 0));
		}
		if(input3.getText().equals("B-")){
			s3 = 2.67;
			grade3.setBackground(new Color(200, 250, 0));
		}
		if(input3.getText().equals("C+")){
			s3 = 2.33;
			grade3.setBackground(new Color(250, 250, 0));
		}
		if(input3.getText().equals("C")){
			s3 = 2.00;
			grade3.setBackground(new Color(250, 250, 0));
		}
		if(input3.getText().equals("C-")){
			s3 = 1.67;
			grade3.setBackground(new Color(250, 250, 0));
		}
		if(input3.getText().equals("D+")){
			s3 = 1.33;
			grade3.setBackground(new Color(250, 200, 0));
		}
		if(input3.getText().equals("D")){
			s3 = 1.00;
			grade3.setBackground(new Color(250, 200, 0));
		}
		if(input3.getText().equals("D-")){
			s3 = 0.67;
			grade3.setBackground(new Color(250, 200, 0));
		}
		if(input3.getText().equals("F")){
			s3 = 0.00;
			grade3.setBackground(Color.RED);
		}
		if(input4.getText().equals("A")){
			s4 = 4.00;
			grade4.setBackground(Color.GREEN);
		}
		if(input4.getText().equals("A-")){
			s4 = 3.67;
			grade4.setBackground(Color.GREEN);
		}
		if(input4.getText().equals("B+")){
			s4 = 3.33;
			grade4.setBackground(new Color(200, 250, 0));
		}
		if(input4.getText().equals("B")){
			s4 = 3.00;
			grade4.setBackground(new Color(200, 250, 0));
		}
		if(input4.getText().equals("B-")){
			s4 = 2.67;
			grade4.setBackground(new Color(200, 250, 0));
		}
		if(input4.getText().equals("C+")){
			s4 = 2.33;
			grade4.setBackground(new Color(250, 250, 0));
		}
		if(input4.getText().equals("C")){
			s4 = 2.00;
			grade4.setBackground(new Color(250, 250, 0));
		}
		if(input4.getText().equals("C-")){
			s4 = 1.67;
			grade4.setBackground(new Color(250, 250, 0));
		}
		if(input4.getText().equals("D+")){
			s4 = 1.33;
			grade4.setBackground(new Color(250, 200, 0));
		}
		if(input4.getText().equals("D")){
			s4 = 1.00;
			grade4.setBackground(new Color(250, 200, 0));
		}
		if(input4.getText().equals("D-")){
			s4 = 0.67;
			grade4.setBackground(new Color(250, 200, 0));
		}
		if(input4.getText().equals("F")){
			s4 = 0.00;
			grade4.setBackground(Color.RED);
		}
		if(input5.getText().equals("A")){
			s5 = 4.00;
			grade5.setBackground(Color.GREEN);
		}
		if(input5.getText().equals("A-")){
			s5 = 3.67;
			grade5.setBackground(Color.GREEN);
		}
		if(input5.getText().equals("B+")){
			s5 = 3.33;
			grade5.setBackground(new Color(200, 250, 0));
		}
		if(input5.getText().equals("B")){
			s5 = 3.00;
			grade5.setBackground(new Color(200, 250, 0));
		}
		if(input5.getText().equals("B-")){
			s5 = 2.67;
			grade5.setBackground(new Color(200, 250, 0));
		}
		if(input5.getText().equals("C+")){
			s5 = 2.33;
			grade5.setBackground(new Color(250, 250, 0));
		}
		if(input5.getText().equals("C")){
			s5 = 2.00;
			grade5.setBackground(new Color(250, 250, 0));
		}
		if(input5.getText().equals("C-")){
			s5 = 1.67;
			grade5.setBackground(new Color(250, 250, 0));
		}
		if(input5.getText().equals("D+")){
			s5 = 1.33;
			grade5.setBackground(new Color(250, 200, 0));
		}
		if(input5.getText().equals("D")){
			s5 = 1.00;
			grade5.setBackground(new Color(250, 200, 0));
		}
		if(input5.getText().equals("D-")){
			s5 = 0.67;
			grade5.setBackground(new Color(250, 200, 0));
		}
		if(input5.getText().equals("F")){
			s5 = 0.00;
			grade5.setBackground(Color.RED);
		}
		if(input6.getText().equals("A")){
			s6 = 4.00;
			grade6.setBackground(Color.GREEN);
		}
		if(input6.getText().equals("A-")){
			s6 = 3.67;
			grade6.setBackground(Color.GREEN);
		}
		if(input6.getText().equals("B+")){
			s6 = 3.33;
			grade6.setBackground(new Color(200, 250, 0));
		}
		if(input6.getText().equals("B")){
			s6 = 3.00;
			grade6.setBackground(new Color(200, 250, 0));
		}
		if(input6.getText().equals("B-")){
			s6 = 2.67;
			grade6.setBackground(new Color(200, 250, 0));
		}
		if(input6.getText().equals("C+")){
			s6 = 2.33;
			grade6.setBackground(new Color(250, 250, 0));
		}
		if(input6.getText().equals("C")){
			s6 = 2.00;
			grade6.setBackground(new Color(250, 250, 0));
		}
		if(input6.getText().equals("C-")){
			s6 = 1.67;
			grade6.setBackground(new Color(250, 250, 0));
		}
		if(input6.getText().equals("D+")){
			s6 = 1.33;
			grade6.setBackground(new Color(250, 200, 0));
		}
		if(input6.getText().equals("D")){
			s6 = 1.00;
			grade6.setBackground(new Color(250, 200, 0));
		}
		if(input6.getText().equals("D-")){
			s6 = 0.67;
			grade6.setBackground(new Color(250, 200, 0));
		}
		if(input6.getText().equals("F")){
			s6 = 0.00;
			grade6.setBackground(Color.RED);
		}
		if(input7.getText().equals("A")){
			s7 = 4.00;
			grade7.setBackground(Color.GREEN);
		}
		if(input7.getText().equals("A-")){
			s7 = 3.67;
			grade7.setBackground(Color.GREEN);
		}
		if(input7.getText().equals("B+")){
			s7 = 3.33;
			grade7.setBackground(new Color(200, 250, 0));
		}
		if(input7.getText().equals("B")){
			s7 = 3.00;
			grade7.setBackground(new Color(200, 250, 0));
		}
		if(input7.getText().equals("B-")){
			s7 = 2.67;
			grade7.setBackground(new Color(200, 250, 0));
		}
		if(input7.getText().equals("C+")){
			s7 = 2.33;
			grade7.setBackground(new Color(250, 250, 0));
		}
		if(input7.getText().equals("C")){
			s7 = 2.00;
			grade7.setBackground(new Color(250, 250, 0));
		}
		if(input7.getText().equals("C-")){
			s7 = 1.67;
			grade7.setBackground(new Color(250, 250, 0));
		}
		if(input7.getText().equals("D+")){
			s7 = 1.33;
			grade7.setBackground(new Color(250, 200, 0));
		}
		if(input7.getText().equals("D")){
			s7 = 1.00;
			grade7.setBackground(new Color(250, 200, 0));
		}
		if(input7.getText().equals("D-")){
			s7 = 0.67;
			grade7.setBackground(new Color(250, 200, 0));
		}
		if(input7.getText().equals("F")){
			s7 = 0.00;
			grade7.setBackground(Color.RED);
		}
		if(input8.getText().equals("A")){
			s8 = 4.00;
			grade8.setBackground(Color.GREEN);
		}
		if(input8.getText().equals("A-")){
			s8 = 3.67;
			grade8.setBackground(Color.GREEN);
		}
		if(input8.getText().equals("B+")){
			s8 = 3.33;
			grade8.setBackground(new Color(200, 250, 0));
		}
		if(input8.getText().equals("B")){
			s8 = 3.00;
			grade8.setBackground(new Color(200, 250, 0));
		}
		if(input8.getText().equals("B-")){
			s8 = 2.67;
			grade8.setBackground(new Color(200, 250, 0));
		}
		if(input8.getText().equals("C+")){
			s8 = 2.33;
			grade8.setBackground(new Color(250, 250, 0));
		}
		if(input8.getText().equals("C")){
			s8 = 2.00;
			grade8.setBackground(new Color(250, 250, 0));
		}
		if(input8.getText().equals("C-")){
			s8 = 1.67;
			grade8.setBackground(new Color(250, 250, 0));
		}
		if(input8.getText().equals("D+")){
			s8 = 1.33;
			grade8.setBackground(new Color(250, 200, 0));
		}
		if(input8.getText().equals("D")){
			s8 = 1.00;
			grade8.setBackground(new Color(250, 200, 0));
		}
		if(input8.getText().equals("D-")){
			s8 = 0.67;
			grade8.setBackground(new Color(250, 200, 0));
		}
		if(input8.getText().equals("F")){
			s8 = 0.00;
			grade8.setBackground(Color.RED);
		}
		double average = (s1+s2+s3+s4+s5+s6+s7+s8)/8;
		String gpastring = new Double(average).toString();
		gpaText.setText(gpastring);
	      }
	    	 
	     }
	     public void keyReleased(KeyEvent e){}
	   }
}

