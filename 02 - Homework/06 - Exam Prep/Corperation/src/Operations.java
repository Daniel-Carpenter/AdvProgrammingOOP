import java.util.HashMap;

public class Operations {
	
	public static int completeAllTasks(Firm firm) 
	{
		int totalTasksCompleted = 0; 
		HashMap<String, Integer> taskLog = new HashMap<String, Integer>();
		
		
		for (Office office : firm.getOffices())
		{
			System.out.println("\n" + office.getOfficeName() + "-----------------------");
			
			for (Person emp : office.getEmployees())
			{
				int selfTasksCompleted = 0;
				
				while (emp.completeTask())
				{
					++selfTasksCompleted;
					++totalTasksCompleted;
				}
				
				taskLog.put(emp.getName(), selfTasksCompleted);
			}
		}
		
		System.out.println("\nFIRM SUMMARY OF TASK COMPLETIONS ----------------\n");
		
		System.out.println("Total Tasks Completed: " + totalTasksCompleted + "\n");
		
		for (HashMap.Entry<String, Integer> emp : taskLog.entrySet())
		{
			System.out.println(emp.getKey() + " - Completed " + emp.getValue() + " tasks");
		}
		
		return totalTasksCompleted;
	}

}
