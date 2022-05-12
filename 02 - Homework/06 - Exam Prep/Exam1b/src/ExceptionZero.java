
public class ExceptionZero {
	
	public static String divideMethod(int a, int b) {		
	// Modify this method to catch appropriate exception and return exception e.toString()

		try 
		{
			int result = a / b;
			// don't modify the return statement
			return String.valueOf(result);
		}
		catch (ArithmeticException excpt) 
		{
			return excpt.toString();
		}
		
	}
	
	public static void main(String[] args) {		
		
		System.out.println(divideMethod(20, 0));
		
	}
}