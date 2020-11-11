
/**
 * @author Daniel Carpenter
 */
public class Employee extends EmployeeAbstract {

	private static int numEmps = 1;
	private final int empID = numEmps;
	private int baseSalary;
	private EmployeeStatus status;

	public Employee(int baseSalary, EmployeeStatus status) {
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
		this.status = status;
	}

	public String toString() {
		return "ID: " + getEmpID() + "\n" + "Status: " + getStatus() + "\n" + "Base Salary: " + getBaseSalary() + "\n";
	}

	public int getNumEmps() {
		return numEmps;
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
