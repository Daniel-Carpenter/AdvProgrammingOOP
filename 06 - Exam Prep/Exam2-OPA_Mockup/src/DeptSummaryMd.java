import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DeptSummaryMd {
	
	public static void writeFile(String filenameWithoutExtension, Department dept) throws IOException {
		
		String extension = ".md";
		String filename = filenameWithoutExtension + extension;
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write("# Summary for " + dept.getDeptName() + "\n\n"
					+ "## Employees and Employment Attributes");
		writer.write(dept.toString());
		writer.close();
	}

}
