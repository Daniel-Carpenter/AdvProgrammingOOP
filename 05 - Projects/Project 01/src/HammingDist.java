import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HammingDist 
{
	// Private Vars ----------------------------------------------------------------------
	
		final private 	String NRMN = "NRMN";
		private 		String STID_1;
		private 		String STID_2;
	
	
	// Constructors -----------------------------------------------------------------------
		
		public HammingDist(String STID_1, String STID_2)
		{
			this.STID_1 = STID_1;
			this.STID_2 = STID_2;
		}
		 
	// Calculations -----------------------------------------------------------------------
		
		public int calcHammDistOfSTID(String STID_01, String STID_02)
		{
			// Initialize Count to 0
				int STID_Count = 0;	
				
			// Count characters that equal each other from two parameter STIDS
				for (int LETTER = 0; LETTER < 4; ++LETTER)
				{
					if (STID_01.charAt(LETTER) != STID_02.charAt(LETTER))
					{
						++STID_Count;
					}
				}
			
			return STID_Count;
		}
		
		public ArrayList<String> readSTIDs(String filename) throws IOException
		{
			// Output Array
				 ArrayList<String> STID_List_Full = new ArrayList<String>();

			
			// Read in file ------------------------------------------------------------------
					
				// Create Reader
					BufferedReader reader = new BufferedReader(new FileReader(filename));
		
				// Instantiate
					int rows = 1;
					String line = reader.readLine();	
		
				// Read in file via loop
					while (line != null)
					{
						// Don't read in data describing what the data is
							if (rows < 6) // row (line) 6 in .txt file
							{
								line = reader.readLine();					
							}
							
						// Read in Actual Data
							else 
							{
								// Parse first column of STID's
									STID_List_Full.add(line.substring(0, 10).trim());
									
								// Read in next Line
									line = reader.readLine();			
							}
						// Increment to next Line
							++rows;
					}
					
					reader.close();
			
			return STID_List_Full;
		}
		
		public ArrayList<Integer> calcHammDistFromFile(String STID) throws IOException
		{
			// Create Output Array
				ArrayList<Integer> HAMM_COUNT = new ArrayList<Integer>();
			
			// Read in Mesonet.txt file
				ArrayList<String> meso = this.readSTIDs("Mesonet.txt");
			
			// Loop through STID list and Calculate Hamming Distances between Mesonet STID[i] and Parameter STID
				for (int STID_ELEMENT = 0; STID_ELEMENT < meso.size(); ++STID_ELEMENT)
				{
						HAMM_COUNT.add(calcHammDistOfSTID(STID, meso.get(STID_ELEMENT)));
				}
			
			// Return ArrayList
				return HAMM_COUNT;
		}
		
		public int calcSameHammDists(String STID) throws IOException
		{
			// Get Hamming Distance of parameter STID and NRMN
				int hammInput = this.calcHammDistOfSTID(this.NRMN, STID);
			
			// Create ArrayList with Hamming Distances from the STID and all STID's in file
				ArrayList<Integer> hammList = this.calcHammDistFromFile(STID);
			
			// Count Number of Same Hamming Distances as NRMN and Parameter STID
				int count = 0;
				
				for (int ROWS = 0; ROWS < hammList.size(); ++ROWS)
				{
					if (hammInput == hammList.get(ROWS))
					{
						++count;
					}
				}
			
			return count;
		}
		
		public String toString()
		{
			String output = "The Hamming distance between Norman and " + 
							this.getSTID_1() + " is " + this.calcHammDistOfSTID(this.getSTID_1(), this.NRMN) + "; " 
							+ "between Norman and " + this.getSTID_2() 
							+ " is " + this.calcHammDistOfSTID(this.getSTID_2(), this.NRMN) + ".";		
			
			try 
			{
				output = output 
						
						// STID_1
							+ "\n" + "For " + this.getSTID_1() + ": Number of stations with Hamming Distance " 
							+ this.calcHammDistOfSTID(this.getSTID_1(), this.NRMN) + ": " 
							+ this.calcSameHammDists(this.getSTID_1()) + "."
						
						// STID_2
							+ "\n" + "For " + this.getSTID_2() + ": Number of stations with Hamming Distance " 
							+ this.calcHammDistOfSTID(this.getSTID_2(), this.NRMN) + ": " 
							+ this.calcSameHammDists(this.getSTID_2()) + ".";
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
			
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