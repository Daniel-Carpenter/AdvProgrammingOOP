import java.io.IOException;

public class TestClass {

	public static void main(String[] args) throws IOException {

		Department bros = new Department("Super Mario Bros");

		bros.addEmployee(new Employee("Bowser", 2000000, EmployeeStatus.FT), DeptTeam.MAIN_BOSS);
		bros.addEmployee(new Employee("Toad", 	25000, EmployeeStatus.FT),  DeptTeam.SILLY_COMPANION);
		bros.addEmployee(new Employee("Mario",  50000, EmployeeStatus.FT), DeptTeam.PROTAGONIST);
		bros.addEmployee(new Employee("Luigi",  45000, EmployeeStatus.FT), DeptTeam.PROTAGONIST);
		bros.addEmployee(new Employee("Wario",  10000, EmployeeStatus.PT), DeptTeam.PETTY_VILLIAN);
		
		System.out.println(bros);
		
		DeptSummaryMd.writeFile("README", bros);

	}
}
