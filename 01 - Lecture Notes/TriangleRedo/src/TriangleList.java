import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class TriangleList 
{
	private ArrayList<Triangle> triangleList;
	
	private DecimalFormat PERC_FORMAT = new DecimalFormat("0.0%");

	// Error and Success Count
		private int successCount	= 0;
		private int errorCount		= 0;
	
	public TriangleList()
	{
		this.triangleList = new ArrayList<Triangle>();
	}

	public void add(Triangle triangle) 
	{
		this.triangleList.add(triangle);
	}

	public Triangle getTriangle(int index) 
	{
		return triangleList.get(index);
	}
	
	public void readFromFile(String filename) throws IOException
	{
	    // Create reader
	        BufferedReader reader = new BufferedReader(new FileReader(filename));
	
	    // Read first line of .txt file
	        String line = reader.readLine();
	
	    // Read lines until meets last line of .txt file (null)
	        while (line != null)
	        {        		
	        	// Localize Vars
		        	int sideA = Character.getNumericValue(line.charAt(0));
					int sideB = Character.getNumericValue(line.charAt(2));
					int sideC = Character.getNumericValue(line.charAt(4));
		        
				// Add line to triangle list
		        	this.triangleList.add(new Triangle(sideA, sideB, sideC));
		        	
		        // Tell user if there was an error
		        	if (new Triangle(sideA, sideB, sideC).isTriangle(sideA, sideB, sideC))
		        	{
		        		this.addSuccess();
		        	}
		        	else
		        	{
		        		this.addError();
		        	}
		        
		        // Move to the next line
	        		line = reader.readLine();	
	        }
	        
	    // Close Reader
	        reader.close();
	}
	
	public void addSuccess()
	{
		++this.successCount;
	}
	
	public void addError()
	{
		++this.errorCount;
	}
	
	public String getErrorStats()
	{
		double successRate = (double) this.successCount / (this.errorCount + this.successCount);
		double errorRate   = (double) this.errorCount   / (this.errorCount + this.successCount);
		
		return "Loaded Triangles: " + this.successCount	+ " (" + PERC_FORMAT.format(successRate) + ")\n" + 
			   "Failed Triangles: " + this.errorCount 	+ " (" + PERC_FORMAT.format(errorRate) + ")";
	}
	
}
