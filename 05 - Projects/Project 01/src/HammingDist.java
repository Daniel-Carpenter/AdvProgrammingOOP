import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class HammingDist 
{
	// Private Vars ----------------------------------------------------------------------
	
		final private 	String NRMN = "NRMN";
		private 		String STID_1;
		private 		String STID_2;
		private ArrayList<String> STID_List = new ArrayList<String>();
	
	
	// Constructors -----------------------------------------------------------------------
		
		public HammingDist(String STID_1, String STID_2)
		{
			this.STID_1 = STID_1;
			this.STID_2 = STID_2;
			this.STID_List.add(STID_1);
			this.STID_List.add(STID_2);	
		}
		
		
	// Calculations -----------------------------------------------------------------------
		
		public String calcInputHammingDist()
		{
			int STID_1_Count = 0;	
			int STID_2_Count = 0;	
			
			for (int STID_ELEMENT = 0; STID_ELEMENT < this.STID_List.size(); ++STID_ELEMENT)
			{
				for (int LETTER = 0; LETTER < 4; ++LETTER)
				{
					if (this.NRMN.charAt(LETTER) != this.STID_List.get(STID_ELEMENT).charAt(LETTER))
					{
						if (this.STID_List.get(STID_ELEMENT) == this.getSTID_1())
						{							
							STID_1_Count += 1;
						}
						else
						{							
							STID_2_Count += 1;
						}
					}
				}
			}
			
			String output = "The Hamming distance between Norman and " + 
							this.getSTID_1() + " is " + STID_1_Count + "; " +
							"between Norman and " + 
							this.getSTID_2() + " is " + STID_2_Count + ".";
			
			return output;
		}
		
		
	// Getters ----------------------------------------------------------------------------
		
		public String getSTID_1() 
		{
			return STID_1;
		}

		public String getSTID_2() 
		{
			return STID_2;
		}
		
		
}