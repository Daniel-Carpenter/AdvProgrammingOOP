import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HammingDist 
{
	// Private Vars ----------------------------------------------------------------------
	
		final private 	String NRMN = "NRMN";
		private 		String STID_1;
		private 		String STID_2;
		private ArrayList<String> STID_List = new ArrayList<String>();
		private ArrayList<String> STID_List_Full = new ArrayList<String>();
		private ArrayList<Integer> HAMM_COUNT = new ArrayList<Integer>();
	
	
	// Constructors -----------------------------------------------------------------------
		
		public HammingDist(String STID_1, String STID_2)
		{
			this.STID_1 = STID_1;
			this.STID_2 = STID_2;
			this.STID_List.add(STID_1);
			this.STID_List.add(STID_2);	
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
									this.STID_List_Full.add(line.substring(0, 10).trim());
									
								// Read in next Line
									line = reader.readLine();			
							}
						// Increment to next Line
							++rows;
					}
					
					reader.close();
			
			return this.STID_List_Full;
		}
		
		public ArrayList<Integer> calcHammDistFromFile() throws IOException
		{
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
						this.HAMM_COUNT.add(count);
				}
			
			// Return ArrayList
				return this.HAMM_COUNT;
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