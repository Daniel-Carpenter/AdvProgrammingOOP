public class Two extends One {
	int j;
	
	void display()
	{
		super.j = super.i + 1;
		System.out.println(super.i + " " + super.j);
	}

	public static void main (String[] args) {
		Two obj = new Two();
		
		obj.i = 1;
		obj.j = 2;
		obj.display();
		
	}
}