import java.util.Arrays;

public class Main {

	public static void main(String[] args) 
	{
		Person jim 		= new Person("Michael",	Position.Manager, 10);
		Person michael	= new Person("Jim",		Position.Salesperson, 25);
		Person kevin 	= new Person("Kevin", 	Position.Accountant, 50);
		Person holly 	= new Person("Holly", 	Position.Human_Resources, 2);
		
		Office scranton = new Office("Scranton", 
				Arrays.asList(new Person[] {jim, michael, kevin}));
		
		Office nashua	= new Office("Nashua", 
				Arrays.asList(new Person[] {holly}));
		
		Firm DMI = new Firm(Arrays.asList(new Office[] 
				{scranton, nashua}));
		
		
		Operations.completeAllTasks(DMI);
		
	}

}
