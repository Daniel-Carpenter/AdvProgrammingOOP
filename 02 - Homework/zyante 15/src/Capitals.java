import java.util.Scanner;
import java.util.HashMap;

public class Capitals {
   public static void main (String[] args) {
      HashMap<String, String> countryCapital = new HashMap<String, String>();
      Scanner scnr = new Scanner(System.in);
      String countryName;

      countryCapital.put("Peru", "Lima");
      countryCapital.put("Austria", "Vienna");
      countryCapital.put("Egypt", "Cairo");
      countryCapital.putIfAbsent("Chile", "Santiago");
      countryCapital.putIfAbsent("Egypt", "Rome");

      countryName = scnr.next();
      while (!countryName.equals("exit")) {
         System.out.print(countryName + ": ");
         System.out.println(countryCapital.get(countryName));
         countryName = scnr.next();
      }
   }
}