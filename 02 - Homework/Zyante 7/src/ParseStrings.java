import java.util.ArrayList;
import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      ArrayList<String> array = new ArrayList<String>();
      
      for (int i = 0; i < 2; ++i)
      {
    	  array.add(scnr.nextLine().split(",")[i]);
    	  System.out.println(array.get(i));
    	  
      }
      
   }
}
