import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Daniel Carpenter
 */
public class Department extends DepartmentAbstract {
	
	private static HashMap<Employee, Integer> empList = new HashMap<Employee, Integer>();
	private static int numEmpsInDept = 0;
	
	public Department(LinkedList<Employee> empList) {
		for (Employee emp : empList)
		{
			addEmployee(emp);
		}
	}

	@Override
	public void addEmployee(Employee emp) {
			empList.put(emp,  ++numEmpsInDept);
			System.out.println("Successful addition:\n" + emp);
	}

	@Override
	public HashMap<Employee, Integer> getDeptList() {
		return empList;
	}

	@Override
	public String toString() {
		return empList.toString();
	}
	
	

}
