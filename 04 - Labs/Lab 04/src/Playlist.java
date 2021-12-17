import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Playlist 
{
	private ArrayList<Song> songs;
	
	public Playlist() {
		songs = new ArrayList<Song>();
	}
	
	public int getNumSongs() {
		return songs.size();
	}
	
	public Song getSong(int index) 
	{
		if (index < 0 || index >= getNumSongs()) 
		{
			return null;
		}
		return songs.get(index);
	}

	public void addSong(Song song) {
		addSong(getNumSongs(), song);
	}

	public void addSong(int index, Song song) 
	{
		if (index < 0 || index > getNumSongs()) 
		{
			return;
		}
		songs.add(index, song);
	}
	
	public Song removeSong() {
		return removeSong(getNumSongs() - 1);
	}
	
	public Song removeSong(int index) 
	{
		if (index < 0 || index >= getNumSongs()) 
		{
			return null;
		}
		return songs.remove(index);
	}
	
	
// New Code ======================================================
	
	public void addSongs(String filename) throws IOException
	{
		// Create reader
			BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		// Read first line of .txt file
			String line = reader.readLine();
		
		// Read lines until meets last line of .txt file (null)
			while (line != null)
			{
				addSong(new Song(line));
				line = reader.readLine();
			}
			
		reader.close();
	}
	
	public Playlist(String filename) throws IOException
	{
		songs = new ArrayList<Song>();
		addSongs(filename);
	}
		
	public String toString()
	{
		
		String output = "";
		
		if (this.getNumSongs() > 0)
		{
			StringBuilder sb = new StringBuilder(this.getSong(0).toString());		
			
			for (int i = 1; i < this.getNumSongs(); ++i)
			{
				sb.append("\n" + this.getSong(i).toString());
			}
			output = sb.toString();		
		}
		
		return output;
	}
	
	public void saveSongs(String filename) throws IOException
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write(this.toString());
		writer.close();
	}

	public Song getLongestSong()
	{
		// If playlist is empty return null
			if (this.getNumSongs() == 0)
			{
				return null;
			}
			
		// return longest song
			else
			{
				int second	= 0;
				int minute	= 0;
				int hour	= 0;
				int totalTime = 0;

				Song longSong = null;
				
				for (int i = 0; i < this.getNumSongs(); ++i)
				{
					if (this.getSong(i).getTime().length == 3)
					{
						int temp = totalTime;
						second	= this.getSong(i).getTime()[0];
						minute	= this.getSong(i).getTime()[1] * 100;
						hour 	= this.getSong(i).getTime()[2] * 10000;
						
						totalTime = second + minute + hour;
						
						if (temp > totalTime)
						{
							totalTime = temp;
						}
						else
						{
							longSong = this.getSong(i);
						}
					}
					
					// Less than an Hour
					else if (this.getSong(i).getTime().length == 2)
					{
						int temp = totalTime;
						second	= this.getSong(i).getTime()[0];
						minute	= this.getSong(i).getTime()[1] * 100;
						
						totalTime = second + minute;
						
						if (temp > totalTime)
						{
							totalTime = temp;
						}
						else
						{
							longSong = this.getSong(i);
						}
					}
					
					// Less than a Minute
					else
					{
						int temp = totalTime;
						second	= this.getSong(i).getTime()[0];
						
						totalTime = second;
						
						if (temp > totalTime)
						{
							totalTime = temp;
						}
						else
						{
							longSong = this.getSong(i);
						}
					}
				}
				return longSong;
			}
	}

	public int[] getTotalTime()
	{
		// If playlist is empty return null
			if (this.getNumSongs() == 0)
			{
				int[] time = {0};
				return time;
			}
			
		// return longest song
			else
			{
				
				// Loop through to add total time vars -----------------------------------------------------

					// Make indexes for elements of songs
						final int SEC_INDEX  = 0;
						final int MIN_INDEX  = 1;
						final int HOUR_INDEX = 2;
						
					// Create base array to hold sec, min, hours
						int[] time = new int[3];
						int[] timeOut = new int[3];
				
					// initialize song index to first element
						int SONG_INDEX = 0;
					
					for (SONG_INDEX = 0; SONG_INDEX < this.getNumSongs(); ++SONG_INDEX)
					{
						// Greater than or equal to an hour
							if (this.getSong(SONG_INDEX).getTime().length == 3)
							{
								time[SEC_INDEX]		+= this.getSong(SONG_INDEX).getTime()[SEC_INDEX];
								time[MIN_INDEX]		+= this.getSong(SONG_INDEX).getTime()[MIN_INDEX];
								time[HOUR_INDEX] 	+= this.getSong(SONG_INDEX).getTime()[HOUR_INDEX];
							}
							
						// Less than an Hour
							else if (this.getSong(SONG_INDEX).getTime().length == 2)
							{
								time[SEC_INDEX]		+= this.getSong(SONG_INDEX).getTime()[SEC_INDEX];
								time[MIN_INDEX]		+= this.getSong(SONG_INDEX).getTime()[MIN_INDEX];
							}
						
						// Less than a Minute
							else if (this.getSong(SONG_INDEX).getTime().length == 1)
							{
								time[SEC_INDEX]		+= this.getSong(SONG_INDEX).getTime()[SEC_INDEX];
							}
					}
							
					int numTimeElements = 0;
							
					// Count time elements > 0 	
						for (int i = 0; i < this.getNumSongs(); ++i)
						{
							if (time[i] > 0 )
							{
								numTimeElements += 1;	
							}
						}
					
					// Create perfect array for num time elements > 0
						timeOut = new int[numTimeElements];
					
					// Put time elements in new perfect sized array
						for (int i = 0; i < numTimeElements; ++i)
						{	
							timeOut[i] = time[i];	
						}
						
						
					// Make elements in 60 min form -------------------------------------------------
						
						// Elements up to Hours (3)
							if (numTimeElements == 3)
							{
								// Hours 
									timeOut[HOUR_INDEX] = timeOut[HOUR_INDEX]	
											+ (timeOut[MIN_INDEX] - timeOut[MIN_INDEX] % 60) / 60 
											+ (timeOut[SEC_INDEX] - timeOut[SEC_INDEX] % 60) / 60;
								
								// Minutes 
									timeOut[MIN_INDEX] = timeOut[MIN_INDEX] % 60 
											+ (timeOut[SEC_INDEX] - timeOut[SEC_INDEX] % 60) / 60;
								
								// Seconds
									timeOut[SEC_INDEX] = timeOut[SEC_INDEX] % 60;								
							}
						
						// Elements up to Minutes (2)
							else if (numTimeElements == 2)
							{
								// Minutes 
									timeOut[MIN_INDEX] = timeOut[MIN_INDEX] % 60 
											+ (timeOut[SEC_INDEX] - timeOut[SEC_INDEX] % 60) / 60;
									
								// Seconds
								timeOut[SEC_INDEX] = timeOut[SEC_INDEX] % 60;								
							}
							
						// Elements up to Seconds (1)
							else
							{
								// Seconds
								timeOut[SEC_INDEX] = timeOut[SEC_INDEX] % 60;															
							}
					
				return timeOut;
			}
	}

	public String getFavoriteArtist()
	{
		// If empty return null
			if (this.getNumSongs() == 0)
			{
				return null;
			}
			
			else
			{
				
				ArrayList<String> fullArtists = new ArrayList<String>();
				ArrayList<String> distinctArtists = new ArrayList<String>();
				
				// Make array of artists (not uniquw)
					for (int songNum = 0; songNum < songs.size(); ++songNum)
					{
						fullArtists.add(this.getSong(songNum).getArtist());
					}
				
					distinctArtists = (ArrayList<String>) fullArtists.stream().distinct().collect(Collectors.toList());
					
				// Count of Artists
					ArrayList<Integer> artistCounts = new ArrayList();
					
				// Make Frequency Table
					for (int artistNum = 0; artistNum < distinctArtists.size(); ++artistNum)
					{
						int count = 0;
						
						for (int fullArtElem = 0; fullArtElem < fullArtists.size(); ++fullArtElem)
						{
							
							if (distinctArtists.get(artistNum) == fullArtists.get(fullArtElem))
							{									
								count += 1;
							}
						}
						
						artistCounts.add(artistNum, count);
					}	
					
				// Get Max element
					int temp 		= 0;
					int maxElement	= 0;
					
					for (int i = 0; i < artistCounts.size(); ++i)
					{
						
						// See if temp is bigger than the max element
						if (artistCounts.get(i) > artistCounts.get(maxElement))
						{
							maxElement = i;		
						}
					}
					
				
				return distinctArtists.get(maxElement); // CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE CHANGE
			}
	}
}





