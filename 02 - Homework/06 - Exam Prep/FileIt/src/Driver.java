import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Alex", "Do", 23);
		Person p2 = new Person("Jo", "Donut", 32);
		
		try 
		(
			ObjectOutputStream output =
					new ObjectOutputStream(new FileOutputStream("object.dat")))
					{
						output.writeObject(p1);
						output.writeObject(p2); // 
						output.close();
					}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
