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
		
//		String output = "The Hamming distance between Norman and " + 
//		this.getSTID_1() + " is " + STID_1_Count + "; " +
//		"between Norman and " + 
//		this.getSTID_2() + " is " + STID_2_Count + ".";
//		
		String STID_NAME = "NRMN";
		
//		
		HammingDist ham1 = new HammingDist(STID_NAME, "WEBR");
		int hamCount = ham1.calcSameHammDists(STID_NAME);
		System.out.println("Count of same elements: " + 
		hamCount);
		
//		
//		System.out.println("---------------------------------------");
//		
		
//		ArrayList<String> meso = ham1.readSTIDs("Mesonet.txt");
//		
//		for (int i = 0; i < meso.size(); ++i)
//		{			
//			
//			System.out.println(meso.get(i));
//		}
//
//		System.out.println("File size: " + meso.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String output = "The Hamming distance between Norman and " + 
//		this.getSTID_1() + " is " + STID_1_Count + "; " +
//		"between Norman and " + 
//		this.getSTID_2() + " is " + STID_2_Count + ".";
//
		
	}
}
