import java.util.Scanner;

public class Getting_back_into_Groove 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		System.out.println("Random Number Generator ----------------------------- \n");
		
		System.out.println("Please enter the minimum number");
		int minNum = input.nextInt();
		
		System.out.println("Please enter the maximum number \n");
		int maxNum = input.nextInt();
		
		
		double[] blankArr = new double[10];
		
		for (int i = 0; i < 9; ++i)
		{
			blankArr[i] = randNumGenerator(minNum, maxNum);
			System.out.println(blankArr[i]);
		}
	}
	
	public static double randNumGenerator(int minNum, int maxNum)
	{
		double output = minNum + Math.random() * (maxNum - minNum); 
		
		return output;
	}
}
