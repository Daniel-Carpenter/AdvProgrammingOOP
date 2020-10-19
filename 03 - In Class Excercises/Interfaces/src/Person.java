
public class Person implements Comparable<Person> // must specfy type (usually the class name)
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person p) 
	{
		// take the implement object in < > 
		// DEcides how you want to order the objects
		// sorted list return positive number
		
		// sort by age
		if (this.age < p.age)
		{
			return -1;
		}
		else if (this.age > p.age)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}
	
	public String toString()
	{
		return "(" + name + ", " + age + ")";
	}
}
