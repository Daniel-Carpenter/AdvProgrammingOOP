import java.util.HashMap;
import java.util.Map;

public class HashMapppp {
	public static int fact(int n ) {
		if (n == 2) {
			return 1;
		}
		else
		{
			return (n * fact(n -2));
		}
	}
	public static void main(String[] args) {
		System.out.println(fact(6));
		
	}
}
