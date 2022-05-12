public class ArrayReverse { 
  
	// method to reverse an array and displaying it
	public static int[] reverse(int a[], int n) { 
		int[] b = new int[n]; 
		int j = n;  // do some coding and fixing
		for (int i = 0; i < n; ++i) 
		{ // complete for loop definition
			b[j - 1] = a[i]; 
			j = j - 1; 	
			
		}
		  
		// Reverse Array
		for (int i : b) 
		{
			System.out.println(i);
		}
		
		return b;
	} 
	  
	public static void main(String[] args) 
	{ 
		int [] arr = {10, 20, 30, 40, 50}; 
		reverse(arr, arr.length); 
	}	
} 