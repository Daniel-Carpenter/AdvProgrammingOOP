import java.util.Comparator;

public class PersonComparator implements Comparator<Person> // compare persons
{

	@Override
	public int compare(Person p1, Person p2) 
	{
		// Get names
			String name1 = p1.getName();
			String name2 = p2.getName();
			
		// Compare names
			return name1.compareTo(name2);
	}

}
