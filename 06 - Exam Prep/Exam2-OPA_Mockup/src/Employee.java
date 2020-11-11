
/**
 * @author Daniel Carpenter
 */
public class Employee extends EmployeeAbstract {

	private static int empID = 0;
	private int baseSalary;
	private EmployeeStatus status;

	public Employee(int baseSalary, EmployeeStatus status) {
		setEmpID();
		setBaseSalary(baseSalary);
		setStatus(status);
	}

	@Override
	public void setEmpID() {
		++empID;
	}

	@Override
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void setStatus(EmployeeStatus status) {
		this.status = status;
	}
	
	public String toString() {
		return    "ID: " + getEmpID() + "\n" 
				+ "Status: " + getStatus() + "\n"
				+ "Base Salary: " + getBaseSalary() + "\n";
	}

	public int getEmpID() {
		return empID;
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public EmployeeStatus getStatus() {
		return status;
	}
}
