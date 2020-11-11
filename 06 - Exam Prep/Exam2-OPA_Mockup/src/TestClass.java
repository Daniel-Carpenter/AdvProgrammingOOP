
public class TestClass {

	public static void main(String[] args) {

		Department OPA = new Department();

		OPA.addEmployee(new Employee("BossMan", 150000, EmployeeStatus.FT), DeptTeam.SENIOR_MANAGER);
		OPA.addEmployee(new Employee("Toad", 	90000, EmployeeStatus.FT),  DeptTeam.DATA_SCIENTIST);
		OPA.addEmployee(new Employee("Mario",   130000, EmployeeStatus.FT), DeptTeam.DATA_SCIENTIST);
		OPA.addEmployee(new Employee("Luigi",   120000, EmployeeStatus.FT), DeptTeam.SITE_LEAD);
		OPA.addEmployee(new Employee("Wario",   110000, EmployeeStatus.FT), DeptTeam.SITE_LEAD);
		
		System.out.println(OPA);

	}
}
