import java.util.ArrayList;
import java.util.List;

public class Office 
{
	private ArrayList<Person> employees = new ArrayList<Person>();
	private String officeName;

	public Office(String officeName, List<Person> employees) {
		
		this.officeName = officeName;
		this.employees.addAll(employees);
	}

	public ArrayList<Person> getEmployees() {
		return employees;
	}

	public String getOfficeName() {
		return officeName;
	}
}
