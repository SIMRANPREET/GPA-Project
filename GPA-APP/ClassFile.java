import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * A class that creates a file and then writes to it only.
 * Does not read file.
 */
public class ClassFile {
	/*
	 * This method gets the text that is entered into the
	 * textbox (above the save button on the GUI) and writes 
	 * it to the file. 
	 * @param className
	 * @throws IOException
	 */
	public void addClassName(String className) throws IOException{
		String upperCaseClassName = className.toUpperCase();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(upperCaseClassName.split(" ")));
		File allClasses = new File("High School Career Classes.txt");
		BufferedWriter tw = new BufferedWriter(new FileWriter(allClasses,true));
		tw.write(upperCaseClassName);
		tw.newLine();
		tw.close();
		File mathFile = new File("Math Classes.txt");
		File englishFile = new File("English Classes.txt");
		File scienceFile = new File("Science Classes.txt");
		File socialStudiesFile = new File("Social Studies Classes.txt");
		File electiveFile = new File("Elective Classes.txt");
		if(list.contains("MATH") || list.contains("CALCULUS") || list.contains("STATISTICS")){
			BufferedWriter bw = new BufferedWriter(new FileWriter(mathFile,true));
			bw.write(upperCaseClassName);
			bw.newLine();
			bw.close();
		}
		if(list.contains("ENGLISH")){
			BufferedWriter bw = new BufferedWriter(new FileWriter(englishFile,true));
			bw.write(upperCaseClassName);
			bw.newLine();
			bw.close();
		}
		if(list.contains("BIOLOGY") || list.contains("CHEMISTRY") || list.contains("PHYSICS")){
			BufferedWriter bw = new BufferedWriter(new FileWriter(scienceFile,true));
			bw.write(upperCaseClassName);
			bw.newLine();
			bw.close();
		}
		if(list.contains("HISTORY") || list.contains("PYSCHOLOGY") || list.contains("TOK")){
			BufferedWriter bw = new BufferedWriter(new FileWriter(socialStudiesFile,true));
			bw.write(upperCaseClassName);
			bw.newLine();
			bw.close();
		}
		if(!list.contains("MATH") && !list.contains("CALCULUS") && !list.contains("STATISTICS") 
				&& !list.contains("ENGLISH") && !list.contains("BIOLOGY") && !list.contains("CHEMISTRY") 
				&& !list.contains("PHYSICS") && !list.contains("HISTORY") && !list.contains("PYSCHOLOGY")
				&& !list.contains("TOK")){
			BufferedWriter bw = new BufferedWriter(new FileWriter(electiveFile,true));
			bw.write(upperCaseClassName);
			bw.newLine();
			bw.close();
		}
	}
}
