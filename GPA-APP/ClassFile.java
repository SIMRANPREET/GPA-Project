import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* 
 * A class that creates a file and then writes to it only.
 * Does not read file.
 */
public class ClassFile {
	/*
	 * This method gets the text that is entered into the
	 * textbox (above the save button on the GUI) and writes 
	 * it to the file. 
	 */
	public void addClassName(String className) throws IOException{
	File file = new File("High School Career Classes.txt");
	BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
	if(className != null && !className.isEmpty()){
	bw.write(className);
	bw.newLine();
	}
	bw.close();
}
}
