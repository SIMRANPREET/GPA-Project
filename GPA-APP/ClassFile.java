import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassFile {
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
