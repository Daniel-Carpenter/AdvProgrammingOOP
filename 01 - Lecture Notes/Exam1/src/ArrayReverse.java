public class ArrayReverse { 
  
	// method to reverse an array and displaying it
	public static int[] reverse(int a[], int n) { 
		int[] b = new int[n]; 
		int j = n; 
		
		for (int i = 0; i < n; i++) 
		{ 
			// Set element of new array 
				int element = j - 1;
			
			// Set Value
				b[element] = a[i]; 
				
			// Decremeent j (like inner loop)
				j = j - 1; 
       } 
	 
		
		return b;
	} 
	  
	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
		System.out.println(reverse(arr, arr.length)[1]);
	}	
} 