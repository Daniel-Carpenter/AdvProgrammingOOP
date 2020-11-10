
public class TestClass {

	public static void main(String[] args) {
		Employee darin = new Employee(150000, EmployeeStatus.FT);
		System.out.println(darin.getEmpID());
		System.out.println(darin.getBaseSalary());
		System.out.println(darin.getStatus());
		
		Employee daniel = new Employee(90000, EmployeeStatus.FT);
		System.out.println(daniel.getEmpID());
		System.out.println(daniel.getBaseSalary());
		System.out.println(daniel.getStatus());
	}
}
