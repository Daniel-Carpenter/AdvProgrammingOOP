import java.io.IOException;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{	
		HammingDist ham1 = new HammingDist("NEWK", "WEBR");
//		System.out.println(ham1);		
		
		System.out.println(ham1.calcHammDistOfSTID(ham1.getSTID_1(), ham1.getSTID_2()));
		System.out.println(ham1.calcSameHammDists(ham1.getSTID_1()));
		
		
	}
}
		