import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
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
	 private JTextField input1;
	 private JTextField input2;
	 private JTextField input3;
	 private JTextField input4;
	 private JTextField input5;
	 private JTextField input6;
	 private JTextField input7;
	 private JTextField input8;
	 private double b1;
	 private double b2;
	 private double b3;
	 private double b4;
	 private double b5;
	 private double b6;
	 private double b7;
	 private double b8;
	 private double gpa;
	 private double pgpa;
	 private String gpaString;
	 private String pgpaString;
	 
	 public GPAFRAME(){
	      createPanel();
	      displayGPA();
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
		 p.add(grade1);
		 p.add(grade2);
		 p.add(grade3);
		 p.add(grade4);
		 p.add(grade5);
		 p.add(grade6);
		 p.add(grade7);
		 p.add(grade8);
		 p.add(label1);
		 p.add(label2);
		 p.add(label3);
		 p.add(label4);
		 p.add(label5);
		 p.add(label6);
		 p.add(label7);
		 p.add(label8);
		 p.add(gpalabel);
		 p.add(pgpalabel);
		 p.add(gpaText);
		 p.add(pgpaText);
		 add(p);
	 }
	 
	 class AddActionListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent event)
	      {
	    	  String gl1 = input1.getText();
	    	  String gl2 = input2.getText();
	    	  String gl3 = input3.getText();
	    	  String gl4 = input4.getText();
	    	  String gl5 = input5.getText();
	    	  String gl6 = input6.getText();
	    	  String gl7 = input7.getText();
	    	  String gl8 = input8.getText();
	         if(gl1.equals("A")  || gl1.equals("A-") || gl1.equals("B+") || gl1.equals("B") || gl1.equals("B-") ||
	        	gl1.equals("C+") || gl1.equals("C")  || gl1.equals("C-") || gl1.equals("D+")|| gl1.equals("D")  ||
	        	gl1.equals("D-") || gl1.equals("F")){
	        	 grade1.setText(gl1);
	         }
	         if(gl2.equals("A")  || gl2.equals("A-") || gl2.equals("B+") || gl2.equals("B") || gl2.equals("B-") ||
	 	        	gl2.equals("C+") || gl2.equals("C")  || gl2.equals("C-") || gl2.equals("D+")|| gl2.equals("D")  ||
	 	        	gl2.equals("D-") || gl2.equals("F")){
	 	        	 grade2.setText(gl2);
	 	         }
	         if(gl3.equals("A")  || gl3.equals("A-") || gl3.equals("B+") || gl3.equals("B") || gl3.equals("B-") ||
	 	        	gl3.equals("C+") || gl3.equals("C")  || gl3.equals("C-") || gl3.equals("D+")|| gl3.equals("D")  ||
	 	        	gl3.equals("D-") || gl3.equals("F")){
	 	        	 grade3.setText(gl3);
	 	         }
	         if(gl4.equals("A")  || gl4.equals("A-") || gl4.equals("B+") || gl4.equals("B") || gl4.equals("B-") ||
	 	        	gl4.equals("C+") || gl4.equals("C")  || gl4.equals("C-") || gl4.equals("D+")|| gl4.equals("D")  ||
	 	        	gl4.equals("D-") || gl4.equals("F")){
	 	        	 grade4.setText(gl4);
	 	         }
	         if(gl5.equals("A")  || gl5.equals("A-") || gl5.equals("B+") || gl5.equals("B") || gl5.equals("B-") ||
	 	        	gl5.equals("C+") || gl5.equals("C")  || gl5.equals("C-") || gl5.equals("D+")|| gl5.equals("D")  ||
	 	        	gl5.equals("D-") || gl5.equals("F")){
	 	        	 grade5.setText(gl5);
	 	         }
	         if(gl6.equals("A")  || gl6.equals("A-") || gl6.equals("B+") || gl6.equals("B") || gl6.equals("B-") ||
	 	        	gl6.equals("C+") || gl6.equals("C")  || gl6.equals("C-") || gl6.equals("D+")|| gl6.equals("D")  ||
	 	        	gl6.equals("D-") || gl6.equals("F")){
	 	        	 grade6.setText(gl6);
	 	         }
	         if(gl7.equals("A")  || gl7.equals("A-") || gl7.equals("B+") || gl7.equals("B") || gl7.equals("B-") ||
	 	        	gl7.equals("C+") || gl7.equals("C")  || gl7.equals("C-") || gl7.equals("D+")|| gl7.equals("D")  ||
	 	        	gl7.equals("D-") || gl7.equals("F")){
	 	        	 grade7.setText(gl7);
	 	         }
	         if(gl8.equals("A")  || gl8.equals("A-") || gl8.equals("B+") || gl8.equals("B") || gl8.equals("B-") ||
	 	        	gl8.equals("C+") || gl8.equals("C")  || gl8.equals("C-") || gl8.equals("D+")|| gl8.equals("D")  ||
	 	        	gl8.equals("D-") || gl8.equals("F")){
	 	        	 grade8.setText(gl8);
	 	         }
        	 if(gl1.equals("CLEAR")){
        		 grade1.setText(null);
        	 }
        	 if(gl2.equals("CLEAR")){
        		 grade2.setText(null);
        	 }
        	 if(gl3.equals("CLEAR")){
        		 grade3.setText(null);
        	 }
        	 if(gl4.equals("CLEAR")){
        		 grade4.setText(null);
        	 }
        	 if(gl5.equals("CLEAR")){
        		 grade5.setText(null);
        	 }
        	 if(gl6.equals("CLEAR")){
        		 grade6.setText(null);
        	 }
        	 if(gl7.equals("CLEAR")){
        		 grade7.setText(null);
        	 }
        	 if(gl8.equals("CLEAR")){
        		 grade8.setText(null);
        	 }
	      }
	   }
	 private void setLetterValue1(){
		 if(input1.getText().equals("A")){
			 b1 = 4.00;
		 }
		 if(input1.getText().equals("A-")){
			 b1 = 3.67;
		 }
		 if(input1.getText().equals("B+")){
			 b1 = 3.33;
		 }
		 if(input1.getText().equals("B")){
			 b1 = 3.00;
		 }
		 if(input1.getText().equals("B-")){
			 b1 = 2.67;
		 }
		 if(input1.getText().equals("C+")){
			 b1 = 2.33;
		 }
		 if(input1.getText().equals("C")){
			 b1 = 2.00;
		 }
		 if(input1.getText().equals("C-")){
			 b1 = 1.67;
		 }
		 if(input1.getText().equals("D+")){
			 b1 = 1.33;
		 }
		 if(input1.getText().equals("D")){
			 b1 = 1.00;
		 }
		 if(input1.getText().equals("D-")){
			 b1 = 0.67;
		 }
		 if(input1.getText().equals("F")){
			 b1 = 0.00;
		 }
	 }
	 public void setLetterValue2(){
		 if(input2.getText().equals("A")){
			 b2 = 4.00;
		 }
		 if(input2.getText().equals("A-")){
			 b2 = 3.67;
		 }
		 if(input2.getText().equals("B+")){
			 b2 = 3.33;
		 }
		 if(input2.getText().equals("B")){
			 b2 = 3.00;
		 }
		 if(input2.getText().equals("B-")){
			 b2 = 2.67;
		 }
		 if(input2.getText().equals("C+")){
			 b2 = 2.33;
		 }
		 if(input2.getText().equals("C")){
			 b2 = 2.00;
		 }
		 if(input2.getText().equals("C-")){
			 b2 = 1.67;
		 }
		 if(input2.getText().equals("D+")){
			 b2 = 1.33;
		 }
		 if(input2.getText().equals("D")){
			 b2 = 1.00;
		 }
		 if(input2.getText().equals("D-")){
			 b2 = 0.67;
		 }
		 if(input2.getText().equals("F")){
			 b2 = 0.00;
		 }
	 }
	 public void setLetterValue3(){
		 if(input3.getText().equals("A")){
			 b3 = 4.00;
		 }
		 if(input3.getText().equals("A-")){
			 b3 = 3.67;
		 }
		 if(input3.getText().equals("B+")){
			 b3 = 3.33;
		 }
		 if(input3.getText().equals("B")){
			 b3 = 3.00;
		 }
		 if(input3.getText().equals("B-")){
			 b3 = 2.67;
		 }
		 if(input3.getText().equals("C+")){
			 b3 = 2.33;
		 }
		 if(input3.getText().equals("C")){
			 b3 = 2.00;
		 }
		 if(input3.getText().equals("C-")){
			 b3 = 1.67;
		 }
		 if(input3.getText().equals("D+")){
			 b3 = 1.33;
		 }
		 if(input3.getText().equals("D")){
			 b3 = 1.00;
		 }
		 if(input3.getText().equals("D-")){
			 b3 = 0.67;
		 }
		 if(input3.getText().equals("F")){
			 b3 = 0.00;
		 }
	 }
	 public void setLetterValue4(){
		 if(input4.getText().equals("A")){
			 b4 = 4.00;
		 }
		 if(input4.getText().equals("A-")){
			 b4 = 3.67;
		 }
		 if(input4.getText().equals("B+")){
			 b4 = 3.33;
		 }
		 if(input4.getText().equals("B")){
			 b4 = 3.00;
		 }
		 if(input4.getText().equals("B-")){
			 b4 = 2.67;
		 }
		 if(input4.getText().equals("C+")){
			 b4 = 2.33;
		 }
		 if(input4.getText().equals("C")){
			 b4 = 2.00;
		 }
		 if(input4.getText().equals("C-")){
			 b4 = 1.67;
		 }
		 if(input4.getText().equals("D+")){
			 b4 = 1.33;
		 }
		 if(input4.getText().equals("D")){
			 b4 = 1.00;
		 }
		 if(input4.getText().equals("D-")){
			 b4 = 0.67;
		 }
		 if(input4.getText().equals("F")){
			 b4 = 0.00;
		 }
	 }
	 public void setLetterValue5(){
		 if(input5.getText().equals("A")){
			 b5 = 4.00;
		 }
		 if(input5.getText().equals("A-")){
			 b5 = 3.67;
		 }
		 if(input5.getText().equals("B+")){
			 b5 = 3.33;
		 }
		 if(input5.getText().equals("B")){
			 b5 = 3.00;
		 }
		 if(input5.getText().equals("B-")){
			 b5 = 2.67;
		 }
		 if(input5.getText().equals("C+")){
			 b5 = 2.33;
		 }
		 if(input5.getText().equals("C")){
			 b5 = 2.00;
		 }
		 if(input5.getText().equals("C-")){
			 b5 = 1.67;
		 }
		 if(input5.getText().equals("D+")){
			 b5 = 1.33;
		 }
		 if(input5.getText().equals("D")){
			 b5 = 1.00;
		 }
		 if(input5.getText().equals("D-")){
			 b5 = 0.67;
		 }
		 if(input5.getText().equals("F")){
			 b5 = 0.00;
		 }
	 }
	 public void setLetterValue6(){
		 if(input6.getText().equals("A")){
			 b6 = 4.00;
		 }
		 if(input6.getText().equals("A-")){
			 b6 = 3.67;
		 }
		 if(input6.getText().equals("B+")){
			 b6 = 3.33;
		 }
		 if(input6.getText().equals("B")){
			 b6 = 3.00;
		 }
		 if(input6.getText().equals("B-")){
			 b6 = 2.67;
		 }
		 if(input6.getText().equals("C+")){
			 b6 = 2.33;
		 }
		 if(input6.getText().equals("C")){
			 b6 = 2.00;
		 }
		 if(input6.getText().equals("C-")){
			 b6 = 1.67;
		 }
		 if(input6.getText().equals("D+")){
			 b6 = 1.33;
		 }
		 if(input6.getText().equals("D")){
			 b6 = 1.00;
		 }
		 if(input6.getText().equals("D-")){
			 b6 = 0.67;
		 }
		 if(input6.getText().equals("F")){
			 b6 = 0.00;
		 }
	 }
	 public void setLetterValue7(){
		 if(input7.getText().equals("A")){
			 b7 = 4.00;
		 }
		 if(input7.getText().equals("A-")){
			 b7 = 3.67;
		 }
		 if(input7.getText().equals("B+")){
			 b7 = 3.33;
		 }
		 if(input7.getText().equals("B")){
			 b7 = 3.00;
		 }
		 if(input7.getText().equals("B-")){
			 b7 = 2.67;
		 }
		 if(input7.getText().equals("C+")){
			 b7 = 2.33;
		 }
		 if(input7.getText().equals("C")){
			 b7 = 2.00;
		 }
		 if(input7.getText().equals("C-")){
			 b7 = 1.67;
		 }
		 if(input7.getText().equals("D+")){
			 b7 = 1.33;
		 }
		 if(input7.getText().equals("D")){
			 b7 = 1.00;
		 }
		 if(input7.getText().equals("D-")){
			 b7 = 0.67;
		 }
		 if(input7.getText().equals("F")){
			 b7 = 0.00;
		 }
	 }
	 public void setLetterValue8(){
		 if(input8.getText().equals("A")){
			 b8 = 4.00;
		 }
		 if(input8.getText().equals("A-")){
			 b8 = 3.67;
		 }
		 if(input8.getText().equals("B+")){
			 b8 = 3.33;
		 }
		 if(input8.getText().equals("B")){
			 b8 = 3.00;
		 }
		 if(input8.getText().equals("B-")){
			 b8 = 2.67;
		 }
		 if(input8.getText().equals("C+")){
			 b8 = 2.33;
		 }
		 if(input8.getText().equals("C")){
			 b8 = 2.00;
		 }
		 if(input8.getText().equals("C-")){
			 b8 = 1.67;
		 }
		 if(input8.getText().equals("D+")){
			 b8 = 1.33;
		 }
		 if(input8.getText().equals("D")){
			 b8 = 1.00;
		 }
		 if(input8.getText().equals("D-")){
			 b8 = 0.67;
		 }
		 if(input8.getText().equals("F")){
			 b8 = 0.00;
		 }
	 }

	 public void displayGPA(){
		 setLetterValue1();
		 setLetterValue2();
		 setLetterValue3();
		 setLetterValue4();
		 setLetterValue5();
		 setLetterValue6();
		 setLetterValue7();
		 setLetterValue8();
		 if(input1.getText() != null && input2.getText() != null && input3.getText() != null && input4.getText() != null &&
				 input5.getText() != null && input6.getText() != null && input7.getText() != null && input8.getText() != null){
			 gpa = (b1+b2+b3+b4+b5+b6+b7+b8)/8;
			 gpaString = Double.toString(gpa);
			 gpaText.setText(gpaString);
	 }
	 }
	 
	 
	 private void createTextField()
	   {
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
	      ActionListener listener = new AddActionListener();
	      input1.addActionListener(listener);
	      input2.addActionListener(listener);
	      input3.addActionListener(listener);
	      input4.addActionListener(listener);
	      input5.addActionListener(listener);
	      input6.addActionListener(listener);
	      input7.addActionListener(listener);
	      input8.addActionListener(listener);
	      	 grade1 = new JButton();
			 grade2 = new JButton();
			 grade3 = new JButton();
			 grade4 = new JButton();
			 grade5 = new JButton();
			 grade6 = new JButton();
			 grade7 = new JButton();
			 grade8 = new JButton();
			 grade1.setBounds(35,70,50,50);
			 grade2.setBounds(145,70,50,50);
			 grade3.setBounds(255,70,50,50);
			 grade4.setBounds(365,70,50,50);
			 grade5.setBounds(475,70,50,50);
			 grade6.setBounds(585,70,50,50);
			 grade7.setBounds(695,70,50,50);
			 grade8.setBounds(805,70,50,50);
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
			 gpaText = new JTextArea();
			 gpaText.setBounds(890, 30, 100, 30);
			 gpaText.setEditable(false);
			 pgpaText = new JTextArea();
			 pgpaText.setBounds(1000, 30, 100, 30);
			 pgpaText.setEditable(false);
	   }
	 
	 
	 
}

