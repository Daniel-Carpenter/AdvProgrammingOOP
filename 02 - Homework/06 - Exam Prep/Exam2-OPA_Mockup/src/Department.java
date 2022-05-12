import java.util.HashMap;

/**
 * @author Daniel Carpenter
 */
public class Department extends DepartmentAbstract {

	private static HashMap<Employee, DeptTeam> empList = new HashMap<Employee, DeptTeam>();
	private String deptName;

	public Department(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public void addEmployee(Employee emp, DeptTeam deptTeam) {
		empList.put(emp, deptTeam);
		System.out.println("Successful addition, ID = " + emp.getEmpID());
	}

	@Override
	public HashMap<Employee, DeptTeam> getDeptList() {
		return empList;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public String toString() {
		String strOut = "";
		
		Object[] emps  = this.getDeptList().keySet().toArray();
		Object[] teams = this.getDeptList().values().toArray();
		
		for (int i = 0; i < emps.length; ++i) {
			strOut += "\n\n"
				   + emps[i]
				   + "* Team: " + teams[i].toString();
		}
		return strOut;
	}
}
