import java.text.NumberFormat;

/**
 * @author Daniel Carpenter
 */
public class Employee extends EmployeeAbstract {

	private String name;
	private static int numEmps = 1;
	private final int empID = numEmps;
	private int baseSalary;
	private String status;

	public Employee(String name, int baseSalary, EmployeeStatus status) {
		setName(name);
		setNumEmps();
		setBaseSalary(baseSalary);
		setStatus(status);
	}

	@Override
	public void setNumEmps() {
		++numEmps;
	}

	@Override
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void setStatus(EmployeeStatus status) {
		this.status = status.toString();
	}

	public String toString() {
		String salary = NumberFormat.getIntegerInstance().format(getBaseSalary());
		
		return "### `" + getName() + "`\n\n" 
			 + "* ID: "		 + getEmpID() 	+ "\n" 
			 + "* Status: " 	 + getStatus() 	+ "\n" 
			 + "* Base Salary: " + salary 		+ "\n";	}

	public int getEmpID() {
		return empID;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public String getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
