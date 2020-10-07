import java.io.IOException;

public class Driver 
{
	public static void main (String[] args) throws IOException
	{
		TriangleList triangleList = new TriangleList();
		
		triangleList.readFromFile("triangleList.txt");
		
		System.out.println(triangleList.getErrorStats());
		
		System.out.println(triangleList.getTriangle(16));
	}
}
