import java.util.Scanner;

public class StringInputStream {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;
      String userInput;
      String userMonth;
      int userDate;
      int userYear;

      userInput = scnr.nextLine();
      inSS = new Scanner(userInput);

      /* Your solution goes here  */
      
      userMonth = inSS.next();
      userDate = Integer.parseInt(inSS.next());
      userYear = Integer.parseInt(inSS.next());

      System.out.println("Month: " + userMonth);
      System.out.println("Date: " + userDate);
      System.out.println("Year: " + userYear);
   }
}