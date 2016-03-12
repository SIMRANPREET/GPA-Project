import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassFile {
	public void addClassName(String className) throws IOException{
	File file = new File("High School Career Classes");
	FileWriter fw = new FileWriter(file,true);
	fw.write("\n" + className);
	fw.close();
}
}
