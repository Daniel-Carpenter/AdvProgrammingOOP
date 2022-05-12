
public class Person {
	private String name;
	private Position position;
	private int numTasks;

	public Person(String name, Position position, int numTasks) {
		this.name = name.toUpperCase();
		this.position = position;
		this.numTasks = numTasks;
	}

	public String getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

	public int getNumTasks() {
		return numTasks;
	}

	public boolean completeTask() {
		try 
		{
			if (numTasks - 1 >= 0) 
			{
				--this.numTasks;
				return true;
			} 
			else 
			{
				throw new NullPointerException();
			}
		} 
		catch (NullPointerException e) {
			System.out.println("   " + this.name + " - No More tasks remain.");
			return false;
		}
	}
}
