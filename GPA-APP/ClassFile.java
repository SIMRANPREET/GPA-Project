import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClassFile {
	private void addClassName(String className){
	try{
	File file = new File("High School Career Classes");
	PrintWriter pw = new PrintWriter(file);
	pw.println(className);
	pw.close();
	} catch(FileNotFoundException e){
		System.out.println("FileNotFoundException " + e.getMessage());
}
}
}
