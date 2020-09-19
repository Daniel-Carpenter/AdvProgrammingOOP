
public class Driver 
{
	public static void main (String[] args)
	{
		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(20);
		
		int tArea = t.getArea();
		
		System.out.println(tArea);
	}
	
	
}
