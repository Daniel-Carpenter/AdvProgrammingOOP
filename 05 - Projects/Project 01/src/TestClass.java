import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
//		DateTimeOne dateTimeOne = new DateTimeOne();
//		dateTimeOne.dateTimeNow();
//		System.out.println(dateTimeOne.getValueOfSecond());
//		
//		TimeUnit.SECONDS.sleep(3);
		
//		System.out.println("After-Sleep Second: " + dateTimeOne.getValueOfSecond());
		
		HammingDist ham1 = new HammingDist("NEWK", "WEBR");
		System.out.println(ham1.calcInputHammingDist());
		
		
		ArrayList<String> meso = ham1.readSTIDs("Mesonet.txt");
		ArrayList<Integer> hamCount = ham1.calcAllHammingDist();
		int ELEMENT = 75;
		
		System.out.println(meso.get(ELEMENT));
		System.out.println(hamCount.get(ELEMENT));
	}
}
