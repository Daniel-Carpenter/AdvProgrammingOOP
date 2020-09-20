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
		
		public int calcHammDistOfSTID(String STID)
		{
			int STID_Count = 0;	
			
			for (int LETTER = 0; LETTER < 4; ++LETTER)
			{
				if (this.NRMN.charAt(LETTER) != STID.charAt(LETTER))
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
		
		public ArrayList<Integer> calcHammDistFromFile() throws IOException
		{
			// Create Output Array
				ArrayList<Integer> HAMM_COUNT = new ArrayList<Integer>();
			
			// Read in Mesonet .txt file
				ArrayList<String> meso = this.readSTIDs("Mesonet.txt");
			
			// Loop through STID list
				for (int STID_ELEMENT = 0; STID_ELEMENT < meso.size() - 1; ++STID_ELEMENT)
				{
					int count = 0;
					
					// Loop through Letters for NRMN vs. STID String
						for (int LETTER = 0; LETTER < 4; ++LETTER)
						{
							// Calculate Hamming Distance (if letters do not ==, then ++)
								if (this.NRMN.charAt(LETTER) != meso.get(STID_ELEMENT).charAt(LETTER))
								{
									++count;
								}	
						}
					
					// Add the Hamming Count to the ArrayList
						HAMM_COUNT.add(count);
				}
			
			// Return ArrayList
				return HAMM_COUNT;
		}
		
		public int calcSameHammDists(String STID) throws IOException
		{
			int hammInput = this.calcHammDistOfSTID(STID);
			ArrayList<Integer> hammList = this.calcHammDistFromFile();
			
			int count = 0;
			
			for (int ROWS = 0; ROWS < hammList.size() - 1; ++ROWS)
			{
				if (hammInput == hammList.get(ROWS))
				{
					++count;
				}
			}
			
			return count - 1; // -1 because do not double count first
		}
		
		public String toString()
		{
			String output = "The Hamming distance between Norman and " + 
							this.getSTID_1() + " is " + this.calcHammDistOfSTID(this.getSTID_1()) + "; " 
							+ "between Norman and " + this.getSTID_2() 
							+ " is " + this.calcHammDistOfSTID(this.getSTID_2())+ ".";
					
			
			try 
			{
				output = output 
						
						// STID_1
							+ "\n" + "For " + this.getSTID_1() + ": Number of stations with Hamming Distance " 
							+ this.calcHammDistOfSTID(this.getSTID_1()) + ": " 
							+ this.calcSameHammDists(this.getSTID_1()) + "."
						
						// STID_2
							+ "\n" + "For " + this.getSTID_2() + ": Number of stations with Hamming Distance " 
							+ this.calcHammDistOfSTID(this.getSTID_2()) + ": " 
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