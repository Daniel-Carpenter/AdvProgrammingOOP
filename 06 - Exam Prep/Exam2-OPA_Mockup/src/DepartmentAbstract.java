import java.util.HashMap;

public abstract class DepartmentAbstract {
	public abstract void addEmployee(Employee emp);
	public abstract HashMap<Employee, Integer> getDeptList();
	public abstract String toString();
}
