
class ExceptionZero {
	
	public static String divideMethod(int a, int b) 
	{		
	// Modify this method to catch appropriate exception and return exception e.toString()
		int result = 0;
		
		try
		{
			result = a/b;
			throw new ArithmeticException();
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		
		// don't modify the return statement
		return String.valueOf(result);
		
	}
	
	public static void main(String[] args) {		
		
		System.out.println(divideMethod(20, 0));
		
	}
}