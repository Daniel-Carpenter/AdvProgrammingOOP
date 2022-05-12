import java.util.HashMap;

public abstract class DepartmentAbstract {
	public abstract HashMap<Employee, DeptTeam> getDeptList();

	public abstract void addEmployee(Employee emp, DeptTeam team);

	public abstract String toString();
}
